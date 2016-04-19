package screens;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by Samuel Avins on 4/11/2016.
 */
public class AdminSongLibary extends JukeScreen {


    Label title = new Label("Song Libary");
    HBox titleBox = new HBox();

    Button addSong = new Button("Add Song");

    Button addAlbum = new Button("Add Album");

    Button removeSong = new Button("Remove Song");

    Button back = new Button("<--");

    VBox options = new VBox(15);
    VBox centerInner = new VBox();
    HBox center = new HBox();

    public AdminSongLibary() {
        setTitleBar();
        setCenter();
    }

    /**========================================
     *  Sets the menu name at the top center of
     *  the screen.
     *========================================
     */
    public void setTitleBar(){
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().add(title);
        this.setTop(titleBox);
    }

    /**========================================
     *  Sets all the user input fields and
     *  buttons to the center of the screen.
     *========================================
     */
    public void setCenter(){
        removeSong.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        addSong.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        addAlbum.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        options.getChildren().addAll(addSong, addAlbum, removeSong);
        centerInner.getChildren().add(options);
        centerInner.setAlignment(Pos.CENTER);
        center.getChildren().add(centerInner);
        center.setAlignment(Pos.CENTER);
        this.setCenter(center);
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
