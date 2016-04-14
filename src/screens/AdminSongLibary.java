package screens;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

/**
 * Created by user on 4/11/2016.
 */
public class AdminSongLibary extends BorderPane implements JukeScreenIF {


    Label title = new Label("Song Libary");
    HBox titleBox = new HBox();

    Button addSong = new Button("Add Song");

    Button addAlbum = new Button("Add Album");

    Button removeSong = new Button("Remove Song");

    Button back = new Button("<--");

    VBox options = new VBox(15);

    public AdminSongLibary(){
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().add(title);
        this.setTop(titleBox);
        options.getChildren().addAll(addSong, addAlbum, removeSong);
        options.setAlignment(Pos.CENTER);
        this.setCenter(options);
        this.setLeft(back);

    }

    @Override
    public Parent getScreen() {
        return null;
    }

    @Override
    public void update() {

    }
}
