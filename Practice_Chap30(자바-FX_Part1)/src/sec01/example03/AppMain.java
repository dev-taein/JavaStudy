package sec01.example03;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//������ ����
//1. Stage�� ������ �� �� ������ â�� �ش��Ѵ�
//2. Stage�� �����Ǹ� ��� �� , Scene�� ���� �������ش�.
//3. Scene�� ������ �� �Ű����� ��� ParentŬ���� ���µ�,�߻�Ŭ�����̹Ƿ� ���� �����̳� Ŭ������ �Ѱ��ش�.
//4. ParentŬ������ ��� �޴� �����̳ʿ� ���� ��Ʈ��(����)�� �߰� ��ġ�Ѵ�.

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//VBox�� �����̳�Ŭ������ �� �����̸�  Vertical Box (�������� ������� ��ġ)
		//HBox�� �������� ��ġ
		VBox root = new VBox();
		root.setPrefWidth(500); //���� ����
		root.setPrefHeight(350); //���� ����
		root.setAlignment(Pos.CENTER); //�߾� ����
		root.setSpacing(20); //��ġ �Ǵ� ��Ʈ�ѵ� ���� ������ 20px�� �ϰڴ�
		
		Label label = new Label();
		label.setText("�ȳ�! �ڹ�FX");
		label.setFont(new Font(50)); //���� ũ��
		
		Button button = new Button();
		button.setText("Ȯ��");
		//��ư �̺�Ʈ ó��
		button.setOnAction(event->Platform.exit()); //���ٽ����� ��ư�� ����ǵ��� ������ �̺�Ʈ ó���� 
		//�͸� ���� ��ü�� ���� ���� �̺�Ʈ �ڵ鸵�� ��(�Լ��� �������̽�)
		//EventHandler�������̽��� handle()�޼��带 �ϳ� ������ ������ ���ٽ��� ��밡���ϴ�.
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("������ ����");
//				//Platform.exit();
//				//System.exit(0);
//			}
//		});
		
		//VBOX��� �����̳ʿ� ��Ʈ�ѵ��� ��ġ�Ѵ�.
		ObservableList<Node> list = root.getChildren(); //�迭 �迭
		list.add(new Label("HELLO!!!"));
		list.add(label);
		list.add(button);
		//root.getChildren().add(label); //�̷��� ��� ����
		
		//Scene�� �������� �Ű����� Parent��� �߻�Ŭ�����̴�.
		//VBOX�� Parent�� ��ӹ����Ƿ� Scene �Ű������� ��밡���ϴ�.
		//Scene�� �Ű����� ��� �����̳ʰ� ����.
		Scene scene = new Scene(root);
		primaryStage.setScene(scene); //��� �߰�
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

	
	
}
