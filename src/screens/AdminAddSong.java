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
 * Created by Samuel Avins on 4/13/2016.
 */
public class AdminAddSong extends BorderPane implements JukeScreenIF{

    /**Label for the menu name*/
    Label title = new Label("Add Song");
    /**HBox to help me canter the menu label*/
    HBox screenTitleBox = new HBox();

    /**Search for a picture to go with the album*/
    Button addPic = new Button("Add Picture");
    /**Search for a song to add to the databse*/
    Button browse = new Button("Browse for Song");

    ImageView songArt = new ImageView("sample/images/display.png");

    /**All the components to make the user input field for the title of the song*/
    Label titleLabel = new Label("Title: ");
    TextField titleField = new TextField();
    HBox titleBox = new HBox();

    /**All the components to make the user input field for the name of the band/artist*/
    Label artistLabel = new Label("Artist: ");
    TextField artistField = new TextField();
    HBox artistBox = new HBox();

    /**All the components to make the user input field for the year the song was released*/
    Label yearLabel = new Label("Year of Release: ");
    TextField yearField = new TextField();
    HBox yearBox = new HBox();

    //Sam- I don't think we actually need this. The media object should just play to completion regardless.
    //so this field seems kinda redundant
    /**All the components to make the user input field for how long the song plays*/
    Label timeLabel = new Label("Playing Time: ");
    TextField timeField = new TextField();
    HBox timeBox = new HBox();

    /**Button that will add the song to the embedded database*/
    Button addSong = new Button("Add Song");

    /**Should take the admin back one screen*/
    Button back = new Button("<--");

    HBox center = new HBox();
    VBox centerInner = new VBox();
    VBox content = new VBox(10);
    HBox imageCenter = new HBox();


    /**Default constructor for AdminAddSong*/
    public AdminAddSong() {
        setTitleBar();
        setCenter();
        setBackButton();
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

    /**========================================
     *  Sets all the user input fields and
     *  buttons to the center of the screen.
     *========================================
     */
    public void setCenter(){
        imageCenter.getChildren().add(songArt);
        titleBox.getChildren().addAll(titleLabel, titleField);
        artistBox.getChildren().addAll(artistLabel, artistField);
        yearBox.getChildren().addAll(yearLabel, yearField);
        timeBox.getChildren().addAll(timeLabel, timeField);
        content.getChildren().addAll(imageCenter, addPic, browse, titleBox,
                artistBox, yearBox, timeBox, addSong);

        songArt.setPreserveRatio(true);
        songArt.setFitWidth(250.0);
        songArt.setFitHeight(250.0);

        addSong.setMaxWidth(Double.MAX_VALUE);
        addPic.setMaxWidth(Double.MAX_VALUE);
        browse.setMaxWidth(Double.MAX_VALUE);

        center.setMaxWidth(500.0);
        centerInner.getChildren().add(content);
        centerInner.setAlignment(Pos.CENTER);
        center.getChildren().add(centerInner);
        center.setAlignment(Pos.CENTER);
        imageCenter.setAlignment(Pos.CENTER);

        this.setCenter(center);
    }

    public void setBackButton(){
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
