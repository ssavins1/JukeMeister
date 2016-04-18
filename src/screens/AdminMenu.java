package screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


/**
 * Created by user on 4/11/2016.
 */
public class AdminMenu extends BorderPane implements JukeScreenIF {

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

    @Override
    public Parent getScreen() {
        return null;
    }

    @Override
    public void update() {

    }
}

