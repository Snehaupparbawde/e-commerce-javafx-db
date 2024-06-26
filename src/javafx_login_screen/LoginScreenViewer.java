package javafx_login_screen;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import newstage.StageHolder;

public class LoginScreenViewer extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override

	public void start(Stage stageCreatedByJavafx) throws Exception {

		StageHolder.stage = stageCreatedByJavafx;
		URL fxmlUrl = Paths
				.get("C:\\Users\\Win\\eclipse-workspace\\E-commerceJavaFx\\src\\javafx_login_screen\\LoginScreen.fxml")
				.toUri().toURL();

		Parent actorGroup = FXMLLoader.load(fxmlUrl);
		StageHolder.stage.setTitle("Student Login");

		Scene scene = new Scene(actorGroup, 600, 400);

		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();

	}

}
