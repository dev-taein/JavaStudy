package sec03.example03;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private ListView<String> listView;
	@FXML private ImageView imageView;
	@FXML private Button btn1_print;
	@FXML private Button btn2_exit;
	
	String str = null;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
			
		//����Ʈ �信 ���ؼ� �Ӽ����ø� ���ؼ� ���ϰ�θ� �˾Ƴ��� �̹����信 �̹����� ���̰Բ� �Ѵ�.
		
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				str = newValue.toString(); //�̹����� ��θ� ����ϱ� ���� ����
				
				//�̹������� �̹����� ����Ʈ�信�� ������ �̹����� �����ִ� �ڵ�
				imageView.setImage(new Image(getClass().getResource("images/"+newValue.toString()).toString()));
			}
		});
		
		btn1_print.setOnAction(event-> btn1Print(event,str));
		btn2_exit.setOnAction(event->btn2Exit(event));
	}
	
	public void btn1Print(ActionEvent event, String str) {
		System.out.println("�̹��� ��� : images/"+str );
	}
	
	public void btn2Exit(ActionEvent event) {
		Platform.exit();
	}
}
