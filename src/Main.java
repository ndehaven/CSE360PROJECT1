import java.util.*; 
import java.util.Stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.*;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("ProcessScene.fxml"));
		primaryStage.setTitle("Processor View");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();

	}


	public static void main(String[] args) {

		launch(args);

	}


}

/*public static boolean CheckId() {
	if (asuID instanceof String) { //checking if ID is a string or not for now
			return true;
	} 
	else {
			return false;
	}
}*/