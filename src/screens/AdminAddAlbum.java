package screens;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Screen where an administrator can add an album to the song library.
 */
public class AdminAddAlbum extends JukeScreen{

    /** Label for the menu name*/
    Label title = new Label("Add Song");
    /** HBox to help center the menu label*/
    HBox screenTitleBox = new HBox();

    /**Search for a picture to go with the album*/
    Button addPic = new Button("Add Picture");
    /**Search for a song to add to the database*/
    Button browse = new Button("Browse for Song");

    /** Displays the album art */
    ImageView songArt = new ImageView("sample/images/display.png");

    /** Label that prompts the administrator to enter the album title */
    Label titleLabel = new Label("Title: ");
    /** The field where the administrator enters the album title */
    TextField titleField = new TextField();
    /** The horizontal box where the title is contained */
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


    /**Button that will add the Album to the embedded database*/
    Button addAlbum = new Button("Add Album");

    Label songsOnAlbum = new Label("Songs on Album");
    HBox songsOnAlbumCenter = new HBox();
    ScrollPane listOfSongs = new ScrollPane();
    VBox albumScrollContent = new VBox();

    /**Should take the admin back one screen*/
    Button back = new Button("<--");

    HBox center = new HBox();
    VBox centerInner = new VBox();
    VBox content = new VBox(10);
    HBox imageCenter = new HBox();


    /**Default constructor for AdminAddSong*/
    public AdminAddAlbum() {
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
        setAlbumCenter();
        imageCenter.getChildren().add(songArt);
        titleBox.getChildren().addAll(titleLabel, titleField);
        artistBox.getChildren().addAll(artistLabel, artistField);
        yearBox.getChildren().addAll(yearLabel, yearField);
        timeBox.getChildren().addAll(timeLabel, timeField);
        content.getChildren().addAll(imageCenter, addPic, browse, titleBox,
                artistBox, yearBox, timeBox, albumScrollContent);

        songArt.setPreserveRatio(true);
        songArt.setFitWidth(250.0);
        songArt.setFitHeight(250.0);

        addAlbum.setMaxWidth(Double.MAX_VALUE);
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

    /**
     * Places the album art image in the center of the screen.
     */
    private void setAlbumCenter(){
        songsOnAlbumCenter.getChildren().add(songsOnAlbum);
        songsOnAlbumCenter.setAlignment(Pos.CENTER);
        albumScrollContent.getChildren().addAll(songsOnAlbumCenter, listOfSongs, addAlbum);
    }

    /**
     * Add the back button to the left side of the screen.
     */
    public void setBackButton(){
        this.setLeft(back);
        
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.backOneScreen();
            }
        });
    }

    @Override
    public Parent getScreen() {
        return null;
    }

    @Override
    public void update() {

    }
}
