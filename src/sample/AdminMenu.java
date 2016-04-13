package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



/**
 * Created by user on 4/11/2016.
 */
public class AdminMenu  extends BorderPane {


        Label title = new Label("Admin Menu");
        HBox titleBox = new HBox();

        Button stats = new Button("Stats");

        Button songLibary = new Button("Song Library");

        Button importExport = new Button("Import/Export");

        Button creditControl = new Button("Credit Control");

        Button misc = new Button("Misc");

        Button back = new Button("<--");

        VBox options = new VBox(15);

        public AdminMenu(){
            titleBox.setAlignment(Pos.CENTER);
            titleBox.getChildren().add(title);
            this.setTop(titleBox);
            options.getChildren().addAll(stats, songLibary, importExport, creditControl, misc);
            options.setAlignment(Pos.CENTER);
            this.setCenter(options);
            this.setLeft(back);

        }

    }

