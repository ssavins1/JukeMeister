package screens;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by user on 4/14/2016.
 */
public class AdminOtherFeatures extends JukeScreen {
	
	/**contains the title for the menu, and the HBox that centers it*/
    Label title = new Label("Other Features");
    HBox titleBox = new HBox();
    /**back button should return the admin back to the previous screen*/
    Button back = new Button("<--");
    
    /** components for center */
    VBox options = new VBox(20);
    HBox center = new HBox();
    VBox centerInner = new VBox();
    
    Label attractModeLabel = new Label("Attract Mode: ");
    ToggleButton amToggle = new ToggleButton();
    HBox box1 = new HBox(10);
    Label playSongAfterLabel = new Label("Play Song After: ");
    TextField playSongAfterField = new TextField();
    HBox box2 = new HBox(10);
    Label screenSaverLabel = new Label("Screen Saver: ");
    ToggleButton screenSaverToggle = new ToggleButton();
    HBox box3 = new HBox(10);
    Label screenSaverAfterLabel = new Label("Display Screen Saver After: ");
    TextField screenSaverAfterField = new TextField();
    HBox box4 = new HBox(10);
    Label venueToggleLabel = new Label("Show Venue Name: ");
    ToggleButton venueToggle = new ToggleButton();
    HBox box5 = new HBox(10);
    Label venueLabel = new Label("Venue Name: ");
    TextField venueField = new TextField();
    HBox box6 = new HBox(10);
    Label bannerLabel = new Label("Banner Message: ");
    TextField bannerField = new TextField();
    HBox box7 = new HBox(10);
    Button saveButton = new Button("Save");
    Button resetButton = new Button("Reset");
    HBox box8 = new HBox(25);
	
    public AdminOtherFeatures() {
    	setTitleBar();
    	setCenter();
    	
    	back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.backOneScreen();
            }
        });
	}
    
    public void setCenter(){
    	
    	box1.getChildren().addAll(attractModeLabel, amToggle);
    	box2.getChildren().addAll(playSongAfterLabel, playSongAfterField);
    	box3.getChildren().addAll(screenSaverLabel, screenSaverToggle);
    	box4.getChildren().addAll(screenSaverAfterLabel, screenSaverAfterField);
    	box5.getChildren().addAll(venueToggleLabel, venueToggle);
    	box6.getChildren().addAll(venueLabel, venueField);
    	box7.getChildren().addAll(bannerLabel, bannerField);
    	box8.getChildren().addAll(saveButton, resetButton);
    	options.getChildren().addAll(box1, box2, box3, box4, box5, box6, box7, box8);
    	centerInner.getChildren().add(options);
        centerInner.setAlignment(Pos.CENTER);
        center.getChildren().add(centerInner);
        center.setAlignment(Pos.CENTER);
        this.setCenter(center);
    	this.setLeft(back);
    }
    
    public void setTitleBar(){
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().add(title);
        this.setTop(titleBox);
    }

	@Override
    public Parent getScreen() {
        return null;
    }

    @Override
    public void update() {

    }
}
