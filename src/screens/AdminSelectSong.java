package screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * Created by user on 4/14/2016.
 */
public class AdminSelectSong extends JukeScreen {
	
	/**contains the title for the menu, and the HBox that centers it*/
	Label title = new Label("Select Song");
	VBox titleBox = new VBox();
    /** Back button */
    Button back = new Button("<--");
	
	 /**
     * Displays the album art of the song
     */
    ImageView albumArt = new ImageView(); 
    /**
     * Will display any info on the song that is avaliable
     */
    Label songInfo = new Label();
    
    /**
     * Will display credit label
     */
    Label creditLabel = new Label("Credit: ");
    TextField creditField = new TextField("$0.00");
    /**
     * Should select the song
     */
    Button selectButton = new Button("Select");
    
    BorderPane content = new BorderPane();
    VBox songInfoBox = new VBox(30);
    
    VBox rightBox = new VBox(30);
    
    
    /**
     * Default constructor
     */
    public AdminSelectSong() {
    	
    	setTopComponents();
        setLeftComponents();
        setCenterComponents();
        setRightComponents();
	}
    
    
    private void setRightComponents() {
    	
    	
    	selectButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	rightBox.getChildren().addAll(creditLabel, creditField, selectButton);
    	rightBox.setPadding(new Insets(0, 75, 0, 0));
    	rightBox.setAlignment(Pos.CENTER);
    	
    	this.setRight(rightBox);
    }
    
    /**========================================
     *  Sets the picture and song info in center
     *========================================
     */
    private void setCenterComponents() {
        
    	//2D rectangle that serves as the view size for the currently playing image
        Rectangle2D viewportRect = new Rectangle2D(100, 100, 100, 100);
        //change the viewport to the rectangle
        albumArt.setViewport(viewportRect);
        albumArt.setPreserveRatio(true);
        albumArt.setSmooth(true);
        albumArt.setCache(true);
        Image dummyAlbumCover = new Image("sample/images/display.png");
        albumArt.setImage(dummyAlbumCover);
        songInfo.setText("Song Info: None");
        songInfoBox.setAlignment(Pos.CENTER);
        songInfoBox.getChildren().addAll(albumArt, songInfo);
        songInfoBox.setPadding(new Insets(5, 15, 5, 5));
        this.setCenter(songInfoBox);
        //currentlyPlayingInfo.setPrefHeight(browseAndPopular.getHeight());
        //Temp css color change to currently playing Image to see it on the screen
        albumArt.setStyle("-fx-background-color: #993399;");

    }
    
    /**========================================
     *  Sets the title on top
     *========================================
     */
    private void setTopComponents() {
        titleBox.getChildren().addAll(title);
        titleBox.setAlignment(Pos.CENTER);
        //Temp cs style change to allow me to see the width of the banner and title*/
        titleBox.setStyle("-fx-background-color: #336699;");
        this.setTop(titleBox);
    }

	/**========================================
     *  Sets the back button at top-left
     *========================================
     */
    private void setLeftComponents() {
        back.setPadding(new Insets(15, 15, 15, 15));
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
