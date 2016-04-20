package screens;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ImportExport extends JukeScreen {

	/**contains the title for the menu, and the HBox that centers it*/
	Label title = new Label("Import/Export");
    HBox titleBox = new HBox();
    
    /**Fields require for the admin to select the file name*/
    Label fileNameLabel = new Label("Select a filename: ");
    HBox fileNameLabelBox = new HBox();
    TextField fileNameField = new TextField();
    HBox fileNameFieldBox = new HBox();

    Button importFileFrom = new Button("Import from file");
    Button exportToFile = new Button("Export to file");
    Button back = new Button("<--");

    VBox options = new VBox(30);
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
    	fileNameLabelBox.getChildren().addAll(fileNameLabel);
    	fileNameFieldBox.getChildren().addAll(fileNameField);
    	importFileFrom.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	exportToFile.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        options.getChildren().addAll(fileNameLabelBox,
        		fileNameFieldBox, importFileFrom, exportToFile);
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
