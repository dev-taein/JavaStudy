package sec02.example01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	
	@FXML private Label label1;
	@FXML private Label label2;
	//Slider�� 0.0���� 100.0������ Double���� ���Ѵ�.
	@FXML private Slider slider;
	
	
	//slider��Ʈ���� �Ӽ����� �����ϱ� ���ؼ� valueProperty()��
	//ChangeListener�� ����Ѵ�.
	
	//�Ӽ� ����
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				label1.setFont(new Font(newValue.doubleValue()));
				label2.setFont(new Font(newValue.doubleValue()));
				
				//oldValue���� ����Ǳ� ���� ��, newValue�� ����� ���� �ǹ��Ѵ�.
				//�ƿ﷯, <? extends Number>�� ���׸� ���ϵ� ī�� Ÿ������ Number�̰ų� NumberŬ������ ��ӹ޴� ���� Ŭ������ ������ ����Ÿ���� �����Ѵ�.
				
				//slider�� ���� ����(�Ӽ�����)�� ���� Label��Ʈ���� Font���� ���� ���������ν� ������ ũ�Ⱑ ������ �Ǵ� ���̴�.
				System.out.println("���� �� �� : " + oldValue);
				System.out.println("���� �� �� : " + newValue);
			
			}
		});
	}
}
