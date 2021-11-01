package sec03.example03;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable {
	
	@FXML private ProgressBar progressBar;
	@FXML private Label lblWorkDone;
	@FXML private Label lblResult;
	@FXML private Button btnStart;
	@FXML private Button btnStop;

	//Integer������� �ִ� Task�� ����
	private Task<Integer> task;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//�̺�Ʈ ���
		btnStart.setOnAction(e->BtnStart(e));
		btnStop.setOnAction(e->BtnStop(e));
		
	}
	
	public void BtnStart(ActionEvent e) {
		
		task = new Task<Integer>() {
			@Override
			protected Integer call() throws Exception {
				
				int result = 0;
				
				for(int i=0; i<=100; i++) {
					
					result += i;
					
					this.updateProgress(i, 100);
					this.updateMessage(String.valueOf(i));
					
					
					try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					if(this.isCancelled()) {
						this.updateMessage("���ͷ�Ʈ�� ���� ��ҵ�");
						break;
						}
					}
				}
				return result;
			}
			
			//�������� �� �ڵ����� �����
			//�Ʒ� 3���� �ݹ�޼���� JavaFX Application�����尡 �����ϹǷ� �󸶵��� UI�����ۼ��� �ȴ�. �ݹ�=�ڿ��� ����=�ڵ����ν���ȴ�.
			@Override
			protected void succeeded() {
				System.out.println("succeeded()���� ������ : " + Thread.currentThread().getName());
				lblResult.setText(String.valueOf(task.getValue())); //����� ui����
			}
			
			//��ҵǾ��� �� �ڵ� �����
			@Override
			protected void cancelled() {
				System.out.println("cancelled()���� ������ : " + Thread.currentThread().getName());
				lblResult.setText("��ҵ�");
			}
			
			//���ܰ� �߻� ���� �� �ڵ� �����
			@Override
			protected void failed() {
				System.out.println("failed()���� ������ : " + Thread.currentThread().getName());
				lblResult.setText("���ܹ߻���");
			}
		};
		
		//�Ӽ� ���ε�
		progressBar.progressProperty().bind(task.progressProperty());
		lblWorkDone.textProperty().bind(task.messageProperty());
		//������ϴ� ���
		lblResult.setText("");
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
		
	}
	public void BtnStop(ActionEvent e) {
		task.cancel();
	}
}
