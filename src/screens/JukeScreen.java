package screens;

import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import org.junit.Test;

/**
 * Created by user on 4/19/2016.
 */
public class JukeScreen extends BorderPane implements JukeScreenIF {
    @Override
    public Parent getScreen() {
        return this;
    }

    @Override
    public void update() {
        System.out.println("The update methods for this has not been overriden");
    }
}
