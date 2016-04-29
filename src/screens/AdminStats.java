package screens;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by GJ on 4/20/2016.
 */
public class AdminStats extends JukeScreen {
	
	/**contains the title for the menu, and the HBox that centers it*/
	Label title = new Label("Stats");
    HBox titleBox = new HBox();
    
    /**Fields require for total funds display */
    // need to have a variable that would hold the current credit
    // and show it in totalFundsDisplay
    double currentFunds = 0.00;
    Label totalFundsLabel = new Label("Total Funds: ");
    Label totalFundsDisplay = new Label(""+currentFunds);
    HBox totalFundsBox = new HBox();
    
    /**Fields for sorting buttons */
    Button mostPlayedBtn = new Button("Most Played");
    Button leastPlayedBtn = new Button("Least Played");
    HBox sortingButtons = new HBox(10.0);
    /** Back button */
    Button back = new Button("<--");
 
    /** Should display all the songs in the database */
    ScrollPane sortedSongs = new ScrollPane();
    
    VBox options = new VBox(10);
    VBox centerInner = new VBox();
    HBox center = new HBox();
    
    /**
     * Default constructor
     */
	public AdminStats() {
		setTitleBar();
        setCenter();
        
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScreenController.backOneScreen();
            }
        });
	}
    
	/**========================================
     *  Sets the menu name at the top center of
     *  the screen.
     *========================================
     */
    public void setTitleBar(){
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().add(title);
        this.setTop(titleBox);
    }
    
    /**========================================
     *  Sets all the user input fields and
     *  buttons to the center of the screen.
     *========================================
     */
    public void setCenter(){
    	totalFundsBox.getChildren().addAll(totalFundsLabel, 
    										totalFundsDisplay);
    	//importFileFrom.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	//exportToFile.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	sortingButtons.getChildren().addAll(mostPlayedBtn, 
    										leastPlayedBtn);
        options.getChildren().addAll(totalFundsBox,
        							sortingButtons, sortedSongs);
        centerInner.getChildren().add(options);
        centerInner.setAlignment(Pos.CENTER);
        center.getChildren().add(centerInner);
        center.setAlignment(Pos.CENTER);
        this.setCenter(center);
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
