package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MovePage implements Initializable {
	@FXML private TextField Id;
	@FXML private TextField Password;
	@FXML private TextField Name;
	@FXML private Button SignIn;
	@FXML private Button SignUp;
	
	@FXML private void Exit(ActionEvent event) throws Exception {//fxml OnAction이용 나가기.
		Platform.exit();
		/*
		 * Stage primaryStage = new Stage(); Parent root =
		 * FXMLLoader.load(getClass().getResource("Root2.fxml")); Scene scene = new
		 * Scene(root); primaryStage.setScene(scene);
		 * primaryStage.setTitle("SignUp Page"); primaryStage.show();
		 */
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		SignUp.setOnAction(e->membersAction(e)); //버튼 누르면 페이지 이동.
	}
	
	public void membersAction(ActionEvent event){
		try{
		Parent members = FXMLLoader.load(getClass().getResource("Root2.fxml"));
		StackPane root = (StackPane) SignUp.getScene().getRoot();
		root.getChildren().add(members);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void loadPage(){
		try {
			Parent signup = FXMLLoader.load(getClass().getResource("Root2.fxml"));
			Scene scene = new Scene(signup);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
