package screens;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.File;

//import javafx.scene.control.Dialog;

/**
 * Created by Samuel Avins on 4/13/2016.
 */
public class AdminAddSong extends JukeScreen{

    /**Label for the menu name*/
    Label title = new Label("Add Song");
    /**HBox to help me canter the menu label*/
    HBox screenTitleBox = new HBox();

    /**Search for a picture to go with the album*/
    Button addPic = new Button("Add Picture");
    Label imageFilename = new Label("Selected Image File: None");
    File imageFile = null;
    
    /**Search for a song to add to the databse*/
    Button browse = new Button("Browse for Song");
    Label browseFilename = new Label("Selected: None");
    File selectedFile = null;

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
        //setAddSongButton();
        setBrowseButton();
        setAddPictureButton();
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
        content.getChildren().addAll(imageCenter, addPic, imageFilename, browse, 
        		browseFilename, titleBox, artistBox, yearBox, addSong);

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
    
    private void setAddPictureButton(){
    	addPic.setOnAction(new EventHandler<ActionEvent>(){
    		@Override
    		public void handle(ActionEvent e){
    			imageFile = new FileChooser().showOpenDialog(null);
    			if(imageFile != null){
    				imageFilename.setText("Selected Image File: "
    					+ imageFile.getName());
    			} else {
    				imageFilename.setText("Selected Image File: None");
    			}	
    		}
    	});
    }
    
    private void setBrowseButton(){
    	browse.setOnAction(new EventHandler<ActionEvent>(){
    		@Override
    		public void handle(ActionEvent e){
    			selectedFile = new FileChooser().showOpenDialog(null);
    			if(selectedFile != null){
    				browseFilename.setText("Selected: "
    					+ selectedFile.getName());
    			} else {
    				browseFilename.setText("Selected: None");
    			}	
    		}
    	});
    }
    
//    private void setAddSongButton(){
//    	addSong.setOnAction(new EventHandler<ActionEvent>(){
//			@Override
//			public void handle(ActionEvent e) {
//				String artist = artistField.getText();
//				String title = titleField.getText();
//
//				int year;
//
//				try {
//					year = Integer.parseInt(yearField.getText());
//				} catch (NumberFormatException ex){
//					Dialog<String> dialog = new Dialog<String>();
//
//					dialog.setContentText("Error entering year released: "
//							+ ex.getMessage());
//
//					dialog.showAndWait();
//					return;
//				}
//
//				Song s = new Song(artist, title, year, selectedFile.getName());
//
//				ApplicationSettings.getLibraryInstance().addSong(s);
//			}
//    	});
//    }

    private void setBackButton(){
        this.setLeft(back);
        
        back.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Go to AdminMenu
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
