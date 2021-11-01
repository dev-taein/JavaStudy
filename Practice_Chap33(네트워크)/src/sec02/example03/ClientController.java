package sec02.example03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//������ Ŭ���̾�Ʈ�� �����ϱ� ������ AppMain�� ���� ������ �ʾҴ�.
public class ClientController extends Application implements Initializable{
	
	@FXML TextArea txtDisplay;
	@FXML TextField txtInput;
	@FXML Button btnConn;
	@FXML Button btnSend;
	
	
	///////////////////////////////
	Socket socket;
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//����
		Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ŭ���̾�Ʈ");
		primaryStage.show();
		
	}
	
	
	//��ȭ������ ����� ���ؼ� appendText�� �����
	public void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		txtDisplay.setEditable(false);
		//�ؽ�Ʈ �ʵ忡 Ű����� ����Ű�� �Է��� ���� �� ������ ���۵ǵ��� �̺�Ʈ ó�� �ڵ带 ���
		txtInput.setOnAction(e->send(txtInput.getText()));
		btnConn.setOnAction(e->{
			if(btnConn.getText().equals("start")) {
				startClient();
			} else if (btnConn.getText().equals("stop")) {
				stopClient();
			}
		});
		
		
		//���ο� Ŭ���̾�Ʈ â�� �߸� send��ư�� ��Ȱ��ȭ
		btnSend.setDisable(true); //��ư Ȱ��ȭ�� ����
		btnSend.setOnAction(e->txtInput.getText());
	}
	
	public void startClient() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress("localhost", 7777));
					Platform.runLater(() -> {
						displayText("[���� ���� : " + socket.getRemoteSocketAddress() + "]");
						//������ �����ϸ� start��ư�� stop���� �ٲٰ�, send��ư�� Ȱ��ȭ �Ѵ�.
						btnConn.setText("stop");
						btnSend.setDisable(false);
					});
				} catch (Exception e) {
					Platform.runLater(() -> displayText("[���� ��� �Ұ�"));
					if(!socket.isClosed()) {
						stopClient();
					}
					return;
				}
				//Ŭ���̾�Ʈ�� ���ῡ �����ϸ� ������ ������ �����ϱ� ���ؼ� receive()ȣ��
				receive();
			}
		};
		thread.start();
	}
	public void stopClient() {
		try {
			Platform.runLater(()-> {
				displayText("[���� ����]");
				btnConn.setText("start");
				btnSend.setDisable(true);//��Ȱ��ȭ
			});
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {}
	}
	
	public void send(String data) {
		//�����͸� �����ϴ� �޼���
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					byte[] byteArr = data.getBytes("UTF-8");
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(byteArr); //���ŷ ���� �߻�
					outputStream.flush();
					Platform.runLater(() -> {
						displayText("[�۽� �Ϸ�] : " + data);
						//�����͸� ������ ���� �ؽ�Ʈ �ʵ� ������ �ʱ�ȭ
						txtInput.setText("");
					});
				} catch (Exception e) {
					Platform.runLater(() -> displayText("[���� ��� �Ұ�]"));
					stopClient();
				}
			}
		};
		thread.start();
	}
	
	public void receive() {
		//�����͸� ��������� �ޱ� ���ؼ� ���ѷ����� �ۼ���.
		while(true) {
			try {
				byte[] byteArr = new byte[1000];
				InputStream inputStream = socket.getInputStream();
				
				//������ ������������ �������� ��� IOExecption�� �߻�
				int readCount = inputStream.read(byteArr);
				
				//������ ���������� Socket�� close()ȣ�� ���� ���� -1�� ����
				if(readCount == -1) {
					throw new IOException();
				}
				
				//���� �����͸� ���ڵ�
				String data = new String(byteArr, 0, readCount, "UTF-8");
				Platform.runLater(() -> displayText("[���� �Ϸ�] : " + data));
			}catch (Exception e) {
				//�������� ���� �� ��
				Platform.runLater(() -> displayText("[���� ��� �Ұ�]"));
				stopClient();
				break;
			}
		}
	}
}
	
	
