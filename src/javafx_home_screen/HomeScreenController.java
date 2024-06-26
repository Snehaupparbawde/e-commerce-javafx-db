package javafx_home_screen;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx_add_product_screen.AddProductScreenViewer;
import javafx_add_user_screen.AddUserScreenViewer;


public class HomeScreenController {
	@FXML
	Button addUserButton;

	@FXML
	Button addProductButton;

	@FXML
	Button addLogoutButton;

	public void addUserButtonClick() {
		
		AddUserScreenViewer.addUserClickButton();


	}

	public void addProductButtonClick() {
		AddProductScreenViewer.addProductClickButton();
	}

	public void addLogoutButtonClick() {
		System.out.println("Add Logout Button Clicked!!!");
	}

}
