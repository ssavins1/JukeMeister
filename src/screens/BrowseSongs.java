package screens;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * Created by user on 4/14/2016.
 */
public class BrowseSongs extends JukeScreen {
	
	/**contains the title for the menu, and the HBox that centers it*/
	Label title = new Label("Browse Songs");
	VBox titleBox = new VBox();
    /** Back button */
    Button back = new Button("<--");
    
    /**Center Components*/
    
	VBox centerBox = new VBox(15);
	TextField searchBox = new TextField();
	Button searchButton = new Button("Search");
	HBox sortingButtonsBox = new HBox(5);
	Button aToZ = new Button("A-Z");
	Button genre = new Button("Genre");
	Button albumTitle = new Button("Album Title");
	Button artist = new Button("Artist");
	ScrollPane songList = new ScrollPane();
	
	
	
	
    public BrowseSongs() {
		
    	setLeftComponents();
    	setTopComponents();
    	setCenterComponents();
    	
    	back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.backOneScreen();
            }
        });
	}
    
    private void setCenterComponents() {
    	
    	sortingButtonsBox.getChildren().addAll(aToZ, genre, albumTitle, artist);
        centerBox.getChildren().addAll(searchBox, searchButton,
        		sortingButtonsBox, songList );
        centerBox.setPrefHeight(this.getHeight());
        GridPane.setHgrow(songList, Priority.ALWAYS);
        GridPane.setVgrow(centerBox, Priority.ALWAYS);
        centerBox.setMinWidth(songList.getWidth());
        songList.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        songList.setPadding(new Insets(5, 5, 5, 5));
        centerBox.setPadding(new Insets(5, 50, 5, 5));
        centerBox.setAlignment(Pos.CENTER);

        this.setCenter(centerBox);

    }
    
    private void setTopComponents() {
        titleBox.getChildren().addAll(title);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.setStyle("-fx-background-color: #336699;");
        this.setTop(titleBox);
    }
    
    
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
