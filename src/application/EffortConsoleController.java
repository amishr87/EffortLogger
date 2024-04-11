package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EffortConsoleController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void swtichToEffortLogEdditor(ActionEvent event) throws IOException{ 
		root = FXMLLoader.load(getClass().getResource("EffortLogEdditor.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void swtichToDefectLogConsole(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("DefectLogConsole.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void swtichToDefinitions(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Definitions.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void swtichToEffortAndDefectLogs(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("EffortAndDefectLogs.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToDashboard(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
