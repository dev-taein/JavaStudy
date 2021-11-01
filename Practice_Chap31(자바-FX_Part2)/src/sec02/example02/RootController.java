package sec02.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class RootController implements Initializable {

	@FXML private TextArea textArea;
	@FXML private TextField textField;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//�ܹ��� ���ε� ó��
		textArea.textProperty().bind(textField.textProperty());
		
		//�ܹ��� ���ε� ����
		textArea.textProperty().unbind();
		
		//����� ���ε� ó��
//		textArea.textProperty().bindBidirectional(textField.textProperty());
		
		//BindingsŬ������ �̿��Ͽ� ����ϴ� ���� ���ϴ�.(�����)
//		Bindings.bindBidirectional(textArea.textProperty(), textField.textProperty());
		//����� ���ε� ����
		
//		Bindings.unbindBidirectional(textArea.textProperty(), textField.textProperty());
		

		

		
		
		
		
	}
}
