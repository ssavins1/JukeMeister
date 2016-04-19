package screens;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ImportExport extends JukeScreen {

	Label title = new Label("Import/Export");
    HBox titleBox = new HBox();

    Button importFileFrom = new Button("Import from file");
    Button exportToFile = new Button("Export to file");
    Button back = new Button("<--");

    VBox options = new VBox(15);
    VBox centerInner = new VBox();
    HBox center = new HBox();
    
	public ImportExport() {
		setTitleBar();
        setCenter();
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
    	importFileFrom.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	exportToFile.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        options.getChildren().addAll(importFileFrom, exportToFile);
        centerInner.getChildren().add(options);
        centerInner.setAlignment(Pos.CENTER);
        center.getChildren().add(centerInner);
        center.setAlignment(Pos.CENTER);
        this.setCenter(center);
        this.setLeft(back);
    }
    
    
	
}
