package sec01.example01;

import javafx.application.Application;
import javafx.stage.Stage;


//Main�� �׻� javafx.application.Application(�߻�Ŭ����)�� �׻� ����� �ؾ��Ѵ�.
public class AppMain extends Application {

	//ApplicationŬ������ start()�� �ݵ�� �������̵��� �ؾ��Ѵ�.(Applicaiotn�� �߻�Ŭ���� �̴ϱ�)
	@Override
	public void start(Stage primaryStage) throws Exception {
		String threadName = Thread.currentThread().getName();
		System.out.println("start�޼��� �����̴� ������ : " + threadName);
		primaryStage.show(); //������ â�� �����Ͽ� ������
	}
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("main�޼��� �����̴� ������ : " + threadName);
		
		//launch() ����Ǹ鼭 JavaFx ���ø����̼� �����尡 �����Ǿ� start() ȣ���Ѵ�.
		Application.launch(args); //�����޼��� ȣ����
	}

}
