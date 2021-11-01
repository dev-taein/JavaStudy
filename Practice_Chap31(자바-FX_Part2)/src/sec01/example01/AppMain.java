package sec01.example01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox root = new HBox();
		root.setPrefSize(300, 100);
		root.setAlignment(Pos.CENTER); //�߾�����
		root.setSpacing(20);
		
		
		//��ư ��Ʈ��3���� ������
		Button button1 = new Button();
		button1.setText("Button1");
		
		Button button2 = new Button();
		button2.setText("Button2");
		
		Button button3 = new Button();
		button3.setText("Button3");
		
		//�ϳ��� ��Ʈ���� �߰��ϴ� ���
//		root.getChildren().add(button1);
//		root.getChildren().add(button2);
//		root.getChildren().add(button3);
		
		//�ѹ��� addAll()�� �̿��Ͽ� �߰��ϴ� ����̴�.
		root.getChildren().addAll(button1, button2, button3);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("�̺�Ʈ ó��");
		primaryStage.setScene(scene);
		primaryStage.show();
		
//		��ư���� Action�̺�Ʈ�� �߻��ϸ�, �̸� ó������ �ڵ鷯�� ��ư�� ����� ���ش�.
//		�̰��� ������ ����̶�� �Ѵ�. �׷��� EventHandler��� �������̽��� ���׸�Ÿ�̸鼭, �Լ��� �������̽��� �ش��Ѵ�.
//		��, handle()�޼��带 �ϳ��� ������ �ִ�. �� handle()�޼��带 �������̵��� ���ָ� ��ư���� �̺�Ʈ�� �߻��ϸ�
//		handle()�޼��尡 ȣ��Ǹ鼭 ������ �Ǵ� ���̴�.
		
		//EventHandler��� �������̽��� handle() 1���� ������ �ֱ� ������ ���ٽ����� ǥ���� �� �� �ִ�.
		//�̺�Ʈ ó���κ� ���
		//�͸��� ��ü�� ���� ���� �����ϴ� ���
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button1�� Ŭ���Ͽ����ϴ�.");
			}
		});
		//���ٽ��� �̿��� ��� - �ڵ尡 �ſ� ���������� �������ִ�.
		button2.setOnAction(event->System.out.println("Button2�� Ŭ���Ͽ����ϴ�."));
		button3.setOnAction(event->System.out.println("Button3�� Ŭ���Ͽ����ϴ�."));
		
		//������ â�� X��ư �ݱ��ư�� Ŭ������ �� �̺�Ʈó���� �ϰ��� �Ҷ�
		primaryStage.setOnCloseRequest(event->System.out.println("������ â�� �����߽��ϴ�."));
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
