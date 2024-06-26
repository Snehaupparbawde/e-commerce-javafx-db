package javafx_add_product_screen;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import newstage.StageHolder;

public class AddProductScreenViewer {

	public static void addProductClickButton() {

		URL fxmlUrl;
		try {
			fxmlUrl = Paths.get(
					"C:\\Users\\Win\\eclipse-workspace\\E-commerceJavaFx\\src\\javafx_add_product_screen\\add_ProductScreen.fxml")
					.toUri().toURL();

			Parent actorGroup = FXMLLoader.load(fxmlUrl);
			StageHolder.stage.setTitle("Add Product");

			Scene scene = new Scene(actorGroup, 500, 400);

			StageHolder.stage.setScene(scene);
			StageHolder.stage.show();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
