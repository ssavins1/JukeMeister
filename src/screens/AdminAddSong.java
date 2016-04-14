package screens;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by user on 4/13/2016.
 */
public class AdminAddSong extends BorderPane implements JukeScreenIF{
    Label title = new Label("Add Song");
    HBox screenTitleBox = new HBox();

    Button addPic = new Button("Add Picture");
    Button browse = new Button("Browse for Song");

    ImageView songArt = new ImageView();
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

    Button addSong = new Button("Add Song");
    Button back = new Button("<--");

    VBox content = new VBox(10);

    public AdminAddSong() {
        screenTitleBox.getChildren().add(title);
        screenTitleBox.setAlignment(Pos.CENTER);
        this.setTop(title);
        titleBox.getChildren().addAll(titleLabel, titleField);
        titleBox.setAlignment(Pos.CENTER);
        artistBox.getChildren().addAll(artistLabel, artistField);
        artistBox.setAlignment(Pos.CENTER);
        yearBox.getChildren().addAll(yearLabel, yearField);
        yearBox.setAlignment(Pos.CENTER);
        timeBox.getChildren().addAll(timeLabel, timeField);
        timeBox.setAlignment(Pos.CENTER);
        content.getChildren().addAll(songArt, addPic, browse, titleBox,
                artistBox, yearBox, timeBox, addSong);
        content.setAlignment(Pos.CENTER);
        this.setCenter(content);
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
