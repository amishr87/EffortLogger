package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController 
{
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//switch to LogInPage scene
	public void switchToLogInPage(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("LogInPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//switch to Captcha scene
	public void switchToCaptcha(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("Captcha.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show(); 
	}

	//switch to SignUpPage scene
	public void switchToSignUpPage(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("SignUpPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show(); 
	}
	
	//switch to SignUpAccept scene
	public void switchToSignUpAccept(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("SignUpAccept.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//switch to TokenEnterPage scene
	public void switchToTokenEnterPage(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("TokenEnterPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show(); 
	}

	//switch to Dashboard scene
	public void switchToDashboard(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//switch to EmployeeDashboard scene
	public void switchToEmployeeDashboard(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("EmployeeDashboard.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//switch to UserMenu scene
	public void switchToUserMenu(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("UserMenu.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//switch to MyProjects scene
	public void switchToMyProjects(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("MyProjects.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void swtichToEffortConsole(ActionEvent event) throws IOException{ 
		root = FXMLLoader.load(getClass().getResource("EffortConsole.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
