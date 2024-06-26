package javafx_add_product_screen;

import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx_home_screen.HomeScreenViewer;

public class AddProductScreenController {

	@FXML
	TextField pname;

	@FXML
	TextField pquantity;

	@FXML
	TextField pprice;

	@FXML
	Button loginButtonClick;

	public void loginButtonClick() throws SQLException {
		String Pname = pname.getText();
		String Pquantitie = pquantity.getText();
		String Pprice = pprice.getText();

		String query = "insert into product(product_name, product_quantity, product_price) values('" + Pname + "','"
				+ Pquantitie + "','" + Pprice + "')";
		Dbutils.executeQuery(query);
		System.out.println("Product Added Successfully!!");
		HomeScreenViewer.show();
	}

}
