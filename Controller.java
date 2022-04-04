package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	private Stage primaryStage;
	private Scene scene;
	private Parent root;
	
	public void switchToLogIn(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("logIn.fxml"));
		primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void switchToSignUp(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("signUp.fxml"));
		primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
