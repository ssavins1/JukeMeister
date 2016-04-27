package screens;

import org.junit.Test;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import static org.junit.Assert.*;


/**
 * Created by user on 4/11/2016.
 */
public class AdminMenu extends JukeScreen{

    int buttonHeight = 25;
    int backPadding = 10;
    double optionsMaxWidth = 250;


    Label title = new Label("Admin Menu");
    HBox titleBox = new HBox();

    Button stats = new Button("Stats");

    Button songLibary = new Button("Song Library");

    Button importExport = new Button("Import/Export");

    Button creditControl = new Button("Credit Control");

    Button misc = new Button("Misc");

    Button back = new Button("<--");

    VBox backBox = new VBox();
    Label blank = new Label();
    VBox center = new VBox();
    VBox options = new VBox(25);

    public AdminMenu() {
        setButtonsUp();
        importExport.setPrefSize(Double.MAX_VALUE, buttonHeight);
        creditControl.setPrefSize(Double.MAX_VALUE, buttonHeight);
        songLibary.setPrefSize(Double.MAX_VALUE, buttonHeight);
        stats.setPrefSize(Double.MAX_VALUE, buttonHeight);
        misc.setPrefSize(Double.MAX_VALUE, buttonHeight);
        backBox.getChildren().add(back);
        backBox.setPadding(new Insets(backPadding,backPadding,backPadding,backPadding));
        blank.setPrefSize(back.getWidth()+backPadding, back.getHeight()+backPadding);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().add(title);
        options.setMaxWidth(optionsMaxWidth);
        options.getChildren().addAll(stats, songLibary, importExport, creditControl, misc);
        center.setAlignment(Pos.CENTER);
        center.getChildren().add(options);
        this.setCenter(center);
        this.setLeft(backBox);
        this.setRight(blank);
        this.setTop(titleBox);
    }

    @Test(timeout = 1000)
    private void setButtonsUp(){
        stats.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.setScreen(ScreenController.Screens.ADMIN_STATS);
            }
        });
        songLibary.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.setScreen(ScreenController.Screens.ADMIN_SONG_LIBARY);
            }
        });
        misc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.setScreen(ScreenController.Screens.ADMIN_OTHER_FEATURES);
            }
        });
        creditControl.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.setScreen(ScreenController.Screens.ADMIN_CREDIT_CONTROL);
            }
        });
        importExport.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.setScreen(ScreenController.Screens.IMPORT_AND_EXPORT);
            }
        });
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.backOneScreen();
            }
        });
    }

    @Override
    public Parent getScreen() {
        return null;
    }

    @Override
    public void update() {

    }
}

