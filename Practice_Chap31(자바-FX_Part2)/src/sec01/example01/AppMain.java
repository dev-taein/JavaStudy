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
		root.setAlignment(Pos.CENTER); //중앙정렬
		root.setSpacing(20);
		
		
		//버튼 컨트롤3개를 생성함
		Button button1 = new Button();
		button1.setText("Button1");
		
		Button button2 = new Button();
		button2.setText("Button2");
		
		Button button3 = new Button();
		button3.setText("Button3");
		
		//하나의 컨트롤을 추가하는 방법
//		root.getChildren().add(button1);
//		root.getChildren().add(button2);
//		root.getChildren().add(button3);
		
		//한번에 addAll()를 이용하여 추가하는 방법이다.
		root.getChildren().addAll(button1, button2, button3);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("이벤트 처리");
		primaryStage.setScene(scene);
		primaryStage.show();
		
//		버튼에서 Action이벤트가 발생하면, 이를 처리해줄 핸들러를 버튼에 등록을 해준다.
//		이것을 위임형 방식이라고 한다. 그러면 EventHandler라는 인터페이스가 제네릭타이면서, 함수적 인터페이스에 해당한다.
//		즉, handle()메서드를 하나만 가지고 있다. 이 handle()메서드를 오버라이딩을 해주면 버튼에서 이벤트가 발생하면
//		handle()메서드가 호출되면서 실행이 되는 것이다.
		
		//EventHandler라는 인터페이스는 handle() 1개만 가지고 있기 때문에 람다식으로 표현할 수 가 있다.
		//이벤트 처리부분 등록
		//익명구현 객체를 직접 만들어서 제공하는 방법
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button1을 클릭하였습니다.");
			}
		});
		//람다식을 이용한 방법 - 코드가 매우 간결해지는 장점이있다.
		button2.setOnAction(event->System.out.println("Button2를 클릭하였습니다."));
		button3.setOnAction(event->System.out.println("Button3를 클릭하였습니다."));
		
		//윈도우 창의 X버튼 닫기버튼을 클릭했을 때 이벤트처리를 하고자 할때
		primaryStage.setOnCloseRequest(event->System.out.println("윈도우 창을 종료했습니다."));
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
