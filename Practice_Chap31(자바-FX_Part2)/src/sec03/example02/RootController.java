package sec03.example02;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {

	@FXML private TextField textTitle;
	@FXML private PasswordField txtPassword;
	@FXML private ComboBox<String> comboTxt;
	@FXML private DatePicker date;
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void handleBtnPrint() {
		String title = textTitle.getText();
		System.out.println("���� : " + title);
		
		String passWord = txtPassword.getText();
		System.out.println("��й�ȣ : " + passWord);
		
		String combo = comboTxt.getValue();
		//������ ���� �ʾ��� ��쵵 ������ �ؾ��ϹǷ� ���ǹ��� �־�� �ȴ�.
		if(combo != null) {
			System.out.println("�������� : "+ combo);
		} else
			System.out.println("�������δ� �Էµ��� �ʾҽ��ϴ�.");
		
		//DatePicker�� ����ڷκ��� ��¥�� ������ �Ǿ������ �� ���� LocalDateŸ������ ������ �Ѵ�.
		//���࿡ �������� ������ null�� ���ϵǾ����Ƿ� ��ȿ�� �˻��ϴ� �ڵ尡 ���°� ����
		LocalDate localDate = date.getValue();
		if( localDate != null) {
			System.out.println("�Խ� ������ : " + localDate.toString());
		}else
			System.out.println("�Խ��������� �������� �ʾҽ��ϴ�.");
		
		String content = textArea.getText();
		System.out.println("���� : " + content);
	}
	public void handleBtnExit(ActionEvent event) {
		Platform.exit();
	}
}
