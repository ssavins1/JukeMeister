package screens;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Scene content = new Scene(ScreenController.getBasePane(), 900, 900);

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Juke Meister");
        content.getStylesheets().add("screens/JukeMeister.css");
        primaryStage.setScene(content);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
