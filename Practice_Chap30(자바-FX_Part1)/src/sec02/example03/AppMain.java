package sec02.example03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		//�ΰ��� ������ �ִ� ����� �� ������ �ʿ䰡 �ִ�.
		HBox hBox = new HBox();
//		hBox.setPadding(new Insets(20, 20, 20, 50)); //�ð����
//		Button button = new Button();
//		button.setPrefSize(100, 100);
		
		//���� ����
		Button button = new Button();
		button.setPrefSize(100, 100);
		//HBox.setMargin�� ȣ���Ҷ� �Ű������� ��Ʈ���� �ְԵǸ�,
		//��Ʈ���� �������� ����(�ٱ�����)�� �����̵ȴ�.
		HBox.setMargin(button, new Insets(50,20,10,60)); //��ư�� �������� ����
		//�оȸ���(�е�������, ������ �ٱ�����)
		
		hBox.getChildren().add(button);
		Scene scene = new Scene(hBox);
		primaryStage.setTitle("����");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
