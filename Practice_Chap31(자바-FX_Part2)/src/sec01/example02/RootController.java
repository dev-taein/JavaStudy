package sec01.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


//FXML���ϴ� �ϳ��� ��Ʈ�ѷ��� ������ �Ѵ�. �� �� �̺�Ʈ�� ���� ó�� ������ ����ϴµ�, �ݵ�� �ؾ��� ���� Initializable�������̽��� �����ؾ� �Ѵ�.
public class RootController implements Initializable {
	public RootController() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("RootController������ ȣ��");
	}
	//root.fxml���Ͽ� fx:id�� ������ ��ư3���� ������ ���ͼ� ��Ʈ�ѷ����� ����� �Ѵ�.
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	
	
//	initialize()�� AppMain.java������ �ε��� �� �� FXMLLoader.load()�� ����ɶ� 
//	RootController��ü�� ���������, FXML���Ͽ� ����Ǿ� �ִ� ��Ʈ�ѿ� ������ �̷���� ����
//	initialize�޼��带 �ڵ����� JavaFxApplicationThread�� �ڵ����� ȣ�����ش�.
	
	
	//���� initialize()�� �̺�Ʈó�� �ڵ��� ������ ª�� ��� ���� ���� �ۼ��� �ص� ������ �ڵ尡 ����������.
	//initialize()�ȿ����� �̺�Ʈ ��ϸ� ���ְ� �������� ������ ����ϴ� �޼������ �ܺη� ���� �޼��带 �ۼ��ϴ� ���� �ڵ��� ���ļ��� �ٶ����� ����̴�.
	//initialize()�� UI�����̳� �̺�Ʈ ����� �Ҷ��� ����.
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("initialize�޼��� ȣ��");
		
		//�͸� ���� ��ü�� �̿��� �ڵ�
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btn1Handle(event);
			}
		});
		
		//���ٽ����� �̺�Ʈ�� ����ϴ� �ڵ�
		btn2.setOnAction(event->btn2Handle(event));
		btn3.setOnAction(event->btn3Handle(event));
		
	}
	//btn1�� �������� �̺�Ʈ ó�� �޼��带 �и��Ѵ�.
	public void btn1Handle(ActionEvent event) {
		System.out.println("btn1Ŭ���Ǿ����ϴ�.");
	}
	
	//btn2�� �������� �̺�Ʈ ó�� �޼��带 �и��Ѵ�.
	public void btn2Handle(ActionEvent event) {
		System.out.println("btn2Ŭ���Ǿ����ϴ�.");
	}
	//btn3�� �������� �̺�Ʈ ó�� �޼��带 �и��Ѵ�.
	public void btn3Handle(ActionEvent event) {
		System.out.println("btn3Ŭ���Ǿ����ϴ�.");
	}
	public void btn4Handle(ActionEvent event) {
		System.out.println("btn4Ŭ���Ǿ����ϴ�.");
	}
	
	
}
