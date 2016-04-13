package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by user on 4/11/2016.
 */
public class AdminCreditControl extends BorderPane {


    Label title = new Label("Credit Control");
    HBox titleBox = new HBox();

    Label toggleLabel = new Label("Free Play Mode: ");
    ToggleButton toggleFreePlayMode = new ToggleButton();
    HBox toggleFreeBox = new HBox();

    Label songCost = new Label("Cost per Song: ");
    TextField songCostField = new TextField();
    HBox songCostBox = new HBox();

    Label freeSongCost = new Label("Cost per Song: ");
    TextField freeSongCostField = new TextField();
    HBox freeSongCostBox = new HBox();

    Button back = new Button("<--");

    VBox options = new VBox(15);

    public AdminCreditControl(){
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().add(title);
        this.setTop(titleBox);

        toggleFreeBox.getChildren().addAll(toggleLabel,toggleFreePlayMode);
        songCostBox.getChildren().addAll(songCost, songCostField);
        freeSongCostBox.getChildren().addAll(freeSongCost, freeSongCostField);

        options.getChildren().addAll(toggleFreeBox, songCostBox, freeSongCostBox);
        options.setAlignment(Pos.CENTER);
        this.setCenter(options);
        this.setLeft(back);

    }


}
