package javafx_login_screen;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx_home_screen.HomeScreenViewer;

public class LoginScreenController {

	@FXML
	TextField loginName;

	@FXML
	TextField password;

	@FXML
	Label errorMessage;

	public void loginButtonClick() throws SQLException {
		String userName = loginName.getText();
		String Password = password.getText();

		String query = "SELECT * FROM login WHERE login_name='" + userName + "' AND password = '" + Password + "'";
		ResultSet resultset = Dbutils.executeSelectQuery(query);

		if (resultset.next()) {
			errorMessage.setText("Login Success");
			errorMessage.setTextFill(Color.GREEN);

			HomeScreenViewer.show();
		} else {
			errorMessage.setText("Login failed");
			errorMessage.setTextFill(Color.RED);
		}
	}
}
