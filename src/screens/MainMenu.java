package screens;

import org.junit.Test;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import library.Song;
import static org.junit.Assert.*;

/**
 * Created by user on 4/2/2016.
 */
public class MainMenu extends JukeScreen{

    /**
     * Displays the album art of the currently playing song
     */
    ImageView currentlyPlayingImage = new ImageView();

    /**
     * Will display any info on the song that is avaliable
     */
    Label currentlyPlayingInfo = new Label();

    /**
     * Just shows that this is the main menu
     */
    Label menuTitle = new Label("Main Menu");

    /**
     * A banner that will display
     */
    Label banner = new Label("Banner");

    /**
     * Should display all the songs in the queue
     */
    ScrollPane songQueue = new ScrollPane();

    /**
     * A button that should prompt the user to enter a admin password
     * and if it is a valid password, switch the screen to the admin menus.
     */
    Image adminCog = new Image("sample/images/cogs_icon.png");
    Button adminButton = new Button("", new ImageView(adminCog));

    /**
     * Holds the admin button, browseAndPopular, and currently playing in that order
     */
    BorderPane content = new BorderPane();

    /**
     * Should display the browse songs screen
     */
    Button browseButton = new Button("Browse for song");

    /**
     * Should display the most popular songs on the jukeMeister.
     */
    ScrollPane popularSelections = new ScrollPane();

    VBox titleAndBanner = new VBox();
    VBox popularAndBrowse = new VBox();
    VBox currentlyPlayingPortion = new VBox();

    public MainMenu() {
        setTopComponents();
        setLeftComponents();
        setCenterComponents();
        setRightComponents();
    }

    private void setTopComponents() {
        titleAndBanner.getChildren().addAll(menuTitle, banner);
        titleAndBanner.setAlignment(Pos.CENTER);
        //Temp cs style change to allow me to see the width of the banner and title*/
        titleAndBanner.setStyle("-fx-background-color: #336699;");
        this.setTop(titleAndBanner);
    }

    private void setCenterComponents() {
        popularAndBrowse.getChildren().addAll(popularSelections, browseButton);
        popularAndBrowse.setPrefHeight(this.getHeight());
        GridPane.setHgrow(popularSelections, Priority.ALWAYS);
        GridPane.setVgrow(browseButton, Priority.ALWAYS);
        browseButton.setMinWidth(popularSelections.getWidth());
        popularSelections.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        popularSelections.setPadding(new Insets(5, 5, 5, 5));
        popularAndBrowse.setPadding(new Insets(5, 5, 5, 5));
        popularAndBrowse.setAlignment(Pos.CENTER);

        this.setCenter(popularAndBrowse);

    }

    private void setRightComponents() {
        //2D rectangle that serves as the view size for the currently playing image
        Rectangle2D viewportRect = new Rectangle2D(100, 100, 100, 100);
        //change the viewport to the rectangle
        currentlyPlayingImage.setViewport(viewportRect);
        currentlyPlayingImage.setPreserveRatio(true);
        currentlyPlayingImage.setSmooth(true);
        currentlyPlayingImage.setCache(true);
        Image dummyAlbumCover = new Image("sample/images/display.png");
        currentlyPlayingImage.setImage(dummyAlbumCover);

        currentlyPlayingInfo.setText("Now Playing: None");


        currentlyPlayingPortion.setAlignment(Pos.CENTER);
        currentlyPlayingPortion.getChildren().addAll(currentlyPlayingImage, currentlyPlayingInfo, songQueue);
        currentlyPlayingPortion.setPadding(new Insets(5, 15, 5, 5));
        this.setRight(currentlyPlayingPortion);
        //currentlyPlayingInfo.setPrefHeight(browseAndPopular.getHeight());
        //Temp css color change to currently playing Image to see it on the screen
        currentlyPlayingImage.setStyle("-fx-background-color: #993399;");

    }

    public void setCurrentSong(Song s) {
        currentlyPlayingImage.setImage(new Image(s.getImageFileName()));

        currentlyPlayingInfo.setText("Now Playing: "
                + s.getArtist() + " - " + s.getName());
    }


    private void setLeftComponents() {
        adminButton.setPadding(new Insets(5, 5, 5, 5));
        adminButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.setScreen(ScreenController.Screens.ADMIN_MENU);
            }
        });
        this.setLeft(adminButton);
    }

    @Override
    public Parent getScreen() {
        return null;
    }

    @Override
    public void update() {

    }
}
