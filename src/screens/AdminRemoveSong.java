package screens;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



/**
 * Created by user on 4/14/2016.
 */
public class AdminRemoveSong extends JukeScreen{

    /**Label for the menu name*/
    Label title = new Label("Remove Song");
    /**HBox to help me canter the menu label*/
    HBox screenTitleBox = new HBox();

    ScrollPane selection = new ScrollPane();
    Button remove = new Button("Remove");
    Button back = new Button("<--");

    HBox center = new HBox();
    VBox centerInner = new VBox();
    VBox content = new VBox();

    public AdminRemoveSong(){
        this.setTitleBar();
        this.setBack();
        this.setCenter();
    }

    /**========================================
     *  Sets all the user input fields and
     *  buttons to the center of the screen.
     *========================================
     */
    public void setCenter(){
        content.getChildren().addAll(selection, remove);
        center.getChildren().add(centerInner);
        centerInner.getChildren().add(content);

        content.setPrefWidth(500.0);
        content.setPrefHeight(500.0);
        selection.setPrefWidth(500.0);
        remove.setMaxWidth(500.0);
        center.setAlignment(Pos.CENTER);
        centerInner.setAlignment(Pos.CENTER);
        this.setCenter(center);
    }

    /**========================================
     *  Sets the menu name at the top center of
     *  the screen.
     *========================================
     */
    public void setTitleBar(){
        screenTitleBox.setAlignment(Pos.CENTER);
        screenTitleBox.getChildren().add(title);
        this.setTop(screenTitleBox);
    }

    public void setBack(){
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
