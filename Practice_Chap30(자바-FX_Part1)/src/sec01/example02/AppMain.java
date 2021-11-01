package sec01.example02;

import javafx.application.Application;
import javafx.stage.Stage;

//�ڹ�FX�� ������ ����Ŭ(���� �ֱ�)
public class AppMain extends Application {

	//���ེ���� : JavaFX Application Thread (���� ���� ȣ���)
	public AppMain() {
		System.out.println("������ ȣ��");
		System.out.println("������ ������ �� : " + Thread.currentThread().getName());
	}
	
	
	//���󽺷��� : JavaFx-Launcher Thread
	@Override
	public void init() throws Exception {
		System.out.println("init() ����");
		System.out.println("init() ������ �� : " + Thread.currentThread().getName());
	}
	
	//���ེ���� : JavaFX Application Thread
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("start() ����");
		System.out.println("start() ������ �� : " + Thread.currentThread().getName());		
		primaryStage.show();
	}
	
	//���ེ���� : JavaFX Application Thread
	//stop()�� ������ â�� Xǥ��(����)�� Ŭ�� �ÿ� �ڵ����� ȣ��
	//Application P/G���� ���� �ÿ� �����ؾ��� �ڵ� ���� �ַ� �ۼ��ϸ� �ȴ�. 
	@Override
	public void stop() throws Exception {
		System.out.println("stop() ����");
		System.out.println("stop() ������ �� : " + Thread.currentThread().getName());	
	}
	public static void main(String[] args) {
		Application.launch(args);
		
		
	}

}
