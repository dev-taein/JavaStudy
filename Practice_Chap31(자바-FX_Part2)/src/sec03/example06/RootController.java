package sec03.example06;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {
	
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Label lebelTime;
	@FXML private Slider sliderVolumn;
	@FXML private Slider sliderMedia;
	
	
	
	
	
	private boolean endOfMedia; //�÷��� ����
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//����� �ҽ�(�̵��)
//		Media media = new Media(getClass().getResource("media/audio.wav").toString()); //�����
		Media media = new Media(getClass().getResource("media/�׽�Ʈ������.mp4").toString()); //����
		
		
		//�̵��並 ��Ʈ���� �÷��̾��
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		//�̵���÷��̾�Ŭ������ �����ϴ� ������ �̵��信 �����ֱ� ���ؼ� �ۼ���
		mediaView.setMediaPlayer(mediaPlayer);
		
		//�ҽ��� �м��� ����� �ȵǾ��µ� play()ȣ���ϸ� �ȵ�(������ ����)
		//mediaPlayer.play();
		
		//setOnReady�� �ҽ��м��� ������ unknown���¿��� ready���°� �Ǹ� �Ʒ��Ͱ��� �ڵ带 �ۼ��Ѵ�.
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
//				setDisable()�Ű����� true�̸� ��Ȱ��ȭ�� �Ѵ�.
				btnPlay.setDisable(false); //�����ư�� Ȱ��ȭ
				btnPause.setDisable(true); //�Ͻ����� ��ư ��Ȱ��ȭ
				btnStop.setDisable(true); //������ư ��Ȱ��ȭ
				
				/////////////////////////////////
				
				//��������� �̵����̴��� �ְ��� �ּҰ��� �ʴ����� ������
				sliderMedia.setMin(0.0);
				sliderMedia.setValue(0.0);
				sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());
				
				//�̵�� �÷��̾��� ����ð��� �˾Ƴ��� �Ӽ������Ѵ�. �ð��̱⿡ ���׸�Ÿ���� Duration�̴�
				//����� �Ǹ鼭 currentTime�� ������ �Ǹ� �� ���� newvalue�� ��� ������ �ȴ�.
				//currentTime�� ProgressBar�� ProgressIndicator���� ��Ÿ���� ���ؼ� 0.0~1.0������ ������ ȯ���Ͽ� ��Ÿ������ϱ� ������ �����Ѵ�.
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
							Duration newValue) {
						//���� ����ð� / �� ����ð�  = 0.0 ~ 1.0
						double progress = mediaPlayer.getCurrentTime().toSeconds() /
								 mediaPlayer.getTotalDuration().toSeconds();
						//0.0~1.0������ ���� �������ش�.
						progressBar.setProgress(progress);
						progressIndicator.setProgress(progress);
						
						//�����̴��� �̵��ҽ��� ��������� ��Ÿ����
						sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());
						
						//�󺧿� ����ð��� ǥ��
						lebelTime.setText((int)mediaPlayer.getCurrentTime().toSeconds() + "/" + 
						(int)mediaPlayer.getTotalDuration().toSeconds() + "��");
						
						System.out.println("�����");
						
					}
				});
			}
		});
		
		//�̵��ҽ��� ����ǰ� ���� ���� �����ؼ� ������ ������ ���ٽ����� �ۼ���
		mediaPlayer.setOnPlaying(()->{
			btnPlay.setDisable(true); //�����ư�� ��Ȱ��ȭ
			btnPause.setDisable(false); //�Ͻ����� ��ư Ȱ��ȭ
			btnStop.setDisable(false); //������ư Ȱ��ȭ	
			});
		
		
		//�̵��ҽ��� �Ͻ����� ���°� �ǰ� ���� ���� �����ؼ� ������ ������ ���ٽ����� �ۼ���
		mediaPlayer.setOnPaused(() -> {
			btnPlay.setDisable(false); //�����ư�� Ȱ��ȭ
			btnPause.setDisable(true); //�Ͻ����� ��ư ��Ȱ��ȭ
			btnStop.setDisable(false); //������ư Ȱ��ȭ	
		});
				
		//�̵��ҽ��� ���� ���°� �ǰ� ���� ���� �����ؼ� ������ ������ ���ٽ����� �ۼ���
		mediaPlayer.setOnStopped(() -> {
			btnPlay.setDisable(false); //�����ư�� Ȱ��ȭ
			btnPause.setDisable(true); //�Ͻ����� ��ư ��Ȱ��ȭ
			btnStop.setDisable(true); //������ư ��Ȱ��ȭ	
		});
		
		//OnEndOfMedia�� �̵�� �ҽ��� �������� ���·� ����� �Ϸ� �Ǿ��� ���� �����ؼ� ������ ������ �ۼ���
		mediaPlayer.setOnEndOfMedia(() -> {
			btnPlay.setDisable(false); //�����ư�� Ȱ��ȭ
			btnPause.setDisable(true); //�Ͻ����� ��ư ��Ȱ��ȭ
			btnStop.setDisable(true); //������ư ��Ȱ��ȭ
			
			//������ ����� �Ϸᰡ �Ǿ �����ư�� Ȱ��ȭ�� �Ǿ� Ŭ���� ������ ����� �� �Ϸᰡ �Ǿ��� �� �ٽ� ����ϸ� ����� �ȵȴ�.
			//������ ����Ϸ� ������ �̵�� �ҽ��� ���°� �ӹ��� �ֱ� �����̴�.
			//�ٽ� ó�� ���·� ������ �ʿ䰡 �ִ�. ��������� stop()�� ȣ���ϰ� �� �ҽ��� �̵���� ���¸� ó������ ������ �ڵ� �ۼ��ؾ��Ѵ�.
			//���� �÷��� ������ Ȱ���Ͽ� ����ϸ� �ȴ�.
			endOfMedia = true;
			
			//���������� 1.0���� �����Ͽ� �Ϸ���°� �������� ����� �ڵ�
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
		});
		
		//��� ��ư�� �̺�Ʈ ó��
		btnPlay.setOnAction(event -> {
			
			//�÷��� ������ true�� �Ǿ��ٴ� ���� �̵�� ���°� ��� �Ϸ�(endOfMedia)���°� �Ǿ���.
			//������� stop()ȣ���ϰ� �̵� ó�� �ð����� �����ش�.
			if(endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endOfMedia = false;
			}
			mediaPlayer.play();
		});
		
		//�����̴� ������ ����Ǿ��� �� ������ ũ�⸦ �����ϴ� �Ӽ����� �ڵ尡 �ʿ��ϴ�.
		//Slider�� value���� ������ 0.0~100.0 �̴�. [ �̵�� �÷��̾��� ������ ������ 0.0~1.0�̴�.]
		sliderVolumn.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				mediaPlayer.setVolume(newValue.doubleValue() / 100.0);
				mediaPlayer.setVolume(sliderVolumn.getValue() / 100.0);
				System.out.println("��������");
			}
		});
		
		sliderVolumn.setValue(50.0); //������ �⺻��
		
		//�Ͻ����� ��ư�� �̺�Ʈ ó��
		btnPause.setOnAction(event -> {
			mediaPlayer.pause();
		});
		
		//���� ��ư�� �̺�Ʈ ó��
		btnStop.setOnAction(event -> {
			mediaPlayer.stop();
		});
		
		///////////////////////////////////////////////////////////
		
		//�����̴��̵�� �κ��� ���콺�� �巡���ϰų� �����϶� �̵��ҽ��� ���� ��ȭ�� �Ͼ�� �ڵ带 �ۼ��Ѵ�.
		sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				//���콺�� �巡���Ҷ�
				if(sliderMedia.isValueChanging()) {
					System.out.println("���콺 �巡��");
					mediaPlayer.seek(Duration.seconds(sliderMedia.getValue()));
				} 
				//���� ��� ���콺�� Ŭ���Ҷ�
				else {
					//������� ���콺�� Ŭ���Ҷ� ������ 0.5�̻��̸� �̵� ,, 0.5�̸��� seek���� �ʰٴ�.
					if(Math.abs(oldValue.doubleValue() - newValue.doubleValue()) > 0.5){
						System.out.println("���콺 Ŭ��");
						mediaPlayer.seek(Duration.seconds(sliderMedia.getValue()));
					}
				}
					
				
				
			}
		});
		
	}
}
