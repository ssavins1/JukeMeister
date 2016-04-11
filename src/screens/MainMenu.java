package screens;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.geometry.Rectangle2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import library.Song;

/**
 * Created by user on 4/2/2016.
 */
public class MainMenu extends VBox {

    /**Displays the album art of the currently playing song*/
    ImageView currentlyPlayingImage = new ImageView();

    /**Will display any info on the song that is avaliable*/
    Label currentlyPlayingInfo = new Label();

    /**Just shows that this is the main menu*/
    Label menuTitle = new Label("Main Menu");

    /**A banner that will display*/
    Label banner = new Label("Banner");

    /**Should display all the songs in the queue*/
    ScrollPane songQueue = new ScrollPane();

    /**A button that should prompt the user to enter a admin password
     * and if it is a valid password, switch the screen to the admin menus.
     */
    Image adminCog = new Image(getClass().getResourceAsStream("Images/cogs_icon.png"));
    Button adminButton = new Button("", new ImageView(adminCog));

    /**Stores both the menuTitle, and banner*/
    VBox titleAndBanner = new VBox();

    /**Holds the admin button, browseAndPopular, and currently playing in that order*/
    HBox content = new HBox();

    /**Contains the popular tabPane*/
    VBox browseAndPopular = new VBox();

    /**Should display the browse songs screen*/
    Button browseButton = new Button("Browse for song");

    /**Should display the most popular songs on the jukeMeister.*/
    TabPane popularSelections = new TabPane();

    /**will contain currentlyPlayingImage, currentlyPlayingInfo, and songQueue
     * in that order.
     */
    VBox currentlyPlaying = new VBox();


    public MainMenu(){
        this.getChildren().addAll(titleAndBanner, content);
        content.getChildren().addAll(adminButton, browseAndPopular, currentlyPlaying);
        content.setHgrow(browseAndPopular, Priority.ALWAYS);
        content.setHgrow(currentlyPlaying, Priority.ALWAYS);
        this.setVgrow(content, Priority.ALWAYS);

        setBannerAndTitle();
        setBrowseAndPopular();
        setCurrentlyPlaying();
    }

    private void setBannerAndTitle(){
        //Temp cs style change to allow me to see the width of the banner and title*/
        titleAndBanner.setStyle("-fx-background-color: #336699;");
        titleAndBanner.getChildren().addAll(menuTitle, banner);
        titleAndBanner.setAlignment(Pos.CENTER);
    }


    private void setBrowseAndPopular(){
        Rectangle popularContent = new Rectangle(200, 200, Color.LIGHTSTEELBLUE);
        Tab popularTab = new Tab("Popular");
        popularTab.setContent(popularContent);
        popularTab.setClosable(false);
        popularSelections.getTabs().add(popularTab);

        browseButton.setPrefWidth(popularContent.getWidth());
        //Add the components to the browseAndPopular VBox*/
        browseAndPopular.getChildren().addAll(popularSelections, browseButton);
        popularSelections.setMinWidth(this.getWidth()/2);

    }


    private void setCurrentlyPlaying(){

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
        currentlyPlaying.getChildren().addAll(currentlyPlayingImage, currentlyPlayingInfo, songQueue);

        currentlyPlaying.setPrefHeight(browseAndPopular.getHeight());
        //Temp css color change to currently playing Image to see it on the screen
        currentlyPlayingImage.setStyle("-fx-background-color: #993399;");

    }
    
    public void setCurrentSong(Song s){
    	currentlyPlayingImage.setImage(new Image(s.getImageFileName()));
    	
    	currentlyPlayingInfo.setText("Now Playing: " 
    			+ s.getArtist() + " - " + s.getName());
    }






}
