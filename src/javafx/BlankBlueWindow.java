package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyCombination;

public class BlankBlueWindow extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override

	public void start(Stage stageProvidedByJavaFx) {

		stageProvidedByJavaFx.setTitle("First Window");
		stageProvidedByJavaFx.setFullScreen(true);
		stageProvidedByJavaFx.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

		Group actorGroup = new Group();
		Scene scene = new Scene(actorGroup, Color.BLUE);

		stageProvidedByJavaFx.setScene(scene);
		stageProvidedByJavaFx.show();

	}

}
