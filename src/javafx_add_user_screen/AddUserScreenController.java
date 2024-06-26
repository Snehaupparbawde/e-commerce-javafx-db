package javafx_add_user_screen;

import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx_home_screen.HomeScreenViewer;

public class AddUserScreenController {
	@FXML
	TextField fname;

	@FXML
	TextField lname;

	@FXML
	TextField gender;

	@FXML
	TextField age;

	@FXML
	TextField email;

	@FXML
	TextField password;

	@FXML
	TextField confirmPassword;

	@FXML
	Button loginButtonClick;

	public void loginButtonClick() throws SQLException {
		String Fname = fname.getText();
		String Lname = lname.getText();
		String Gender = gender.getText();
		String Age = age.getText();
		String Email = email.getText();
		String Password = password.getText();
		String ConfirmPassword = confirmPassword.getText();
		if (Password.equals(ConfirmPassword)) {
			String query = "insert into user(first_name, last_name, gender, age, email, password) values('" + Fname
					+ "','" + Lname + "','" + Gender + "','" + Age + "','" + Email + "','" + Password + "')";
			Dbutils.executeQuery(query);
			System.out.println("User Added Successfully!!");
		} else {
			System.out.println("User Additon Failed");
		}
		HomeScreenViewer.show();
	}

}
