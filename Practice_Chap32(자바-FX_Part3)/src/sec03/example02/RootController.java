package sec03.example02;

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
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	//��� ���� ���� Task�� ����� ���ؼ� voidŸ���� ����
	private Task<Void> task;
	//Void�� Ŭ����
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//�̺�Ʈ ó�� �κ� ���
		btnStart.setOnAction(e->BtnStart(e));
		btnStop.setOnAction(e->BtnStop(e));
	}
	
	public void BtnStart(ActionEvent e) {
		System.out.println("BtnStart()���� ������ �� : " + Thread.currentThread().getName());
		
		task = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				System.out.println("call()���� ������ �� : " + Thread.currentThread().getName());
				for(int i=0; i<=100; i++) {
					//��Ұ� �Ǿ����� ��� ���� �ϴ� �ڵ带 �Ʒ��� ���� �ۼ���
					if(this.isCancelled()) {
						this.updateMessage("��ҵ�");
						break;
					}
					//updaeProgressms ProgressBar, ProgressIndicator���� ���ѵǾ��ִ�.
					this.updateProgress(i, 100); //i�� 1~100�������µ� ���ప�� ���ϰ�, 100�� �Ϸᰪ
					//�۾��� �Ϸᰡ �Ǹ� i���� lblWorkDone�� �ѷ��ش�
					this.updateMessage(String.valueOf(i)+ "%");
					
					//call()���� ����ó���� �Ǿ� �ִ�. ������ ������ �ܺο��� interrupt()�� ȣ���� �� �ֱ� ������
					//task�� ��ҵǵ��� ����
					try {
					Thread.sleep(100);
					} catch (InterruptedException e) {
						if(this.isCancelled()) {
							this.updateMessage("���ͷ�Ʈ�� ���� ���");
//							break;
						}
					}
				}
				return null;
			}
		};
		
		//�Ӽ� ���ε� �ڵ�
		//progressBar��Ʈ���� �Ӽ��� task�� updateProgress�� progress�Ӽ��� ���ε� ó���� �Ѵ�.
		//�̷��� ���ָ� progressBar�� ���������� ���Ѵ�.
		progressBar.progressProperty().bind(task.progressProperty());
		//���� ���� Label��Ʈ���� �Ӽ��� updateMessage�� �Ӽ��� ���ε��Ѵ�.
		lblWorkDone.textProperty().bind(task.messageProperty());
		
		//Task<V> RunnableŬ������ ������ �ϱ� ������ �������� �Ű������� �� �� �ִ�.
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	public void BtnStop(ActionEvent e) {
		System.out.println("BtnStop()���� ������ �� : " + Thread.currentThread().getName());
		task.cancel();
	}
}
