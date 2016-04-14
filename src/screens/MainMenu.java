package screens;

import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.geometry.Rectangle2D;
import library.Song;

/**
 * Created by user on 4/2/2016.
 */
public class MainMenu extends BorderPane {

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
    Image adminCog = new Image(getClass().getResourceAsStream("Images/cogs_icon.png"));
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
        Image dummyAlbumCover = new Image(getClass().getResourceAsStream("Images/display.png"));
        currentlyPlayingImage.setImage(dummyAlbumCover);

        currentlyPlayingInfo.setText("Now Playing: None");

        //Add all the components to the currently playing VBox*/
        currentlyPlayingPortion.getChildren().addAll(currentlyPlayingImage, currentlyPlayingInfo, songQueue);

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
        this.setLeft(adminButton);
    }
}
