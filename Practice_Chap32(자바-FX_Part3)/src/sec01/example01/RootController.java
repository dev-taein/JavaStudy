package sec01.example01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class RootController implements Initializable {

	@FXML private TextArea textArea;
	@FXML private ComboBox<String> comboBox;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	public void handleNew(ActionEvent event) {
		//setText()는 이벤트 처리가 될 때 마다 새로 갱신하므로 appendText()를 사용한다.
//		textArea.setText("새로 만들기\n");
		textArea.appendText("새로만들기\n");
	}
	
	public void handleOpen(ActionEvent event) {
		textArea.appendText("열기\n");	
	}
	
	public void handleSave(ActionEvent event) {
		textArea.appendText("저장하기\n");
	}
	public void handleExit(ActionEvent event) {
		textArea.appendText("끝내기\n");
		Platform.exit();
	}
	public void handleCombo(ActionEvent event) {
		if(comboBox.getValue().equals("공개")) {
			textArea.appendText("공개\n");
		} else
			textArea.appendText("비공개\n");
	}
}
