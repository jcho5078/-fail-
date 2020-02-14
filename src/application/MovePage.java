package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class MovePage implements Initializable {
	@FXML private BorderPane bp;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
	@FXML
	private void movePage(MouseEvent event) {
		loadPage();
	}
	
	
	public void loadPage(){
		try {
			Parent signup = FXMLLoader.load(getClass().getResource("Root2.fxml"));
			bp.setCenter(signup);//�Ƹ� �̰� �����ε�.
			//������ �̵� ���� ����.
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
