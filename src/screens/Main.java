package screens;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {



    Scene content = new Scene(new MainMenu(), 900, 900);
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Juke Meister");
        primaryStage.setScene(content);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
