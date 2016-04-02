package example;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloWorld extends Application {
	
	public  static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		
		window.setTitle("Hello World");
		window.show();
		
	}
	

}
