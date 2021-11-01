package sec03.example05;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable {
	
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	
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
		
		//�Ͻ����� ��ư�� �̺�Ʈ ó��
		btnPause.setOnAction(event -> {
			mediaPlayer.pause();
		});
		
		//���� ��ư�� �̺�Ʈ ó��
		btnStop.setOnAction(event -> {
			mediaPlayer.stop();
		});
		
	}
}
