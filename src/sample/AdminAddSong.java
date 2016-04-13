package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 * Created by user on 4/13/2016.
 */
public class AdminAddSong extends BorderPane {
    Label title = new Label("Add Song");

    Button addPic = new Button("Add Picture");
    Button browse = new Button("Browse for Song");
    Label titleLabel = new Label("Title: ");
    TextField titleField = new TextField();
    HBox titleBox = new HBox();

    Label artistLabel = new Label("Artist: ");
    TextField artistField = new TextField();
    HBox artistBox = new HBox();

    Label yearLabel = new Label("Year of Release: ");
    TextField yearField = new TextField();
    HBox yearBox = new HBox();

    Label timeLabel = new Label("Playing Time :");
    TextField timeField = new TextField();
    HBox timeBox = new HBox();


}
