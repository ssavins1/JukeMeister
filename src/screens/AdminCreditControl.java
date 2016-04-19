package screens;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by user on 4/11/2016.
 */
public class AdminCreditControl extends JukeScreen {

    /**contains the title for the menu, and the HBox that centers it*/
    Label title = new Label("Credit Control");
    HBox titleBox = new HBox();

    /**Components needed for free play mode, free play can be toggled on and off*/
    Label toggleLabel = new Label("Free Play Mode: ");
    ToggleButton toggleFreePlayMode = new ToggleButton();
    HBox toggleFreeBox = new HBox();

    /**Fields require for the admin to set the cost of each song*/
    Label songCost = new Label("Cost per Song: ");
    TextField songCostField = new TextField();
    HBox songCostBox = new HBox();

    /**Allows the admin to set a free bonus song after each x amount*/
    Label freeSongCost = new Label("Cost per Song: ");
    TextField freeSongCostField = new TextField();
    HBox freeSongCostBox = new HBox();

    /**back button should return the admin back to the previous screen*/
    Button back = new Button("<--");

    /**HBoxes and VBoxes needed to center the content to the center of the screen*/
    VBox options = new VBox(15);
    HBox center = new HBox();
    VBox centerInner = new VBox();

    public AdminCreditControl(){
        setTitle();
        setBack();
        setCenter();
    }

    public void setBack(){
        this.setLeft(back);
    }

    /**========================================
     *  Sets all the user input fields and
     *  buttons to the center of the screen.
     *========================================
     */
    public void setCenter(){
        toggleFreeBox.getChildren().addAll(toggleLabel,toggleFreePlayMode);
        songCostBox.getChildren().addAll(songCost, songCostField);
        freeSongCostBox.getChildren().addAll(freeSongCost, freeSongCostField);
        options.getChildren().addAll(toggleFreeBox, songCostBox, freeSongCostBox);

        centerInner.getChildren().add(options);
        centerInner.setAlignment(Pos.CENTER);
        center.getChildren().add(centerInner);
        center.setAlignment(Pos.CENTER);

        this.setCenter(center);
    }

    public void setTitle(){
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().add(title);
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
