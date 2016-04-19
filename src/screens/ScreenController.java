package screens;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.util.Stack;

/**
 * Created by user on 4/19/2016.
 */
public class ScreenController {

    static private StackPane main = new StackPane();
    static private Stack<JukeScreen> screensStack = new Stack<JukeScreen>();
    static ScreenController singleton;

    enum Screens{
        MAIN_MENU(new MainMenu()),
        ADMIN_MENU(new AdminMenu()),
        ADMIN_SONG_LIBARY(new AdminSongLibary()),
        ADMIN_ADD_SONG(new AdminAddSong()),
        ADMIN_ADD_ALBUM(new AdminAddAlbum()),
        ADMIN_CREDIT_CONTROL(new AdminCreditControl()),
        ADMIN_REMOVE_SONG(new AdminRemoveSong()),
        IMPORT_AND_EXPORT(new MainMenu()),
        BROWSE_SONGS(new BrowseSongs()),
        SELECT_SONGS(new AdminSelectSong()),
        ADMIN_STATS(new AdminStats()),
        ADMIN_OTHER_FEATURES(new AdminOtherFeatures());

        JukeScreen js;

        Screens(JukeScreen js){
            this.js = js;
        }

        public JukeScreen getScreen(){
            return js;
        }
    }

    private ScreenController(){}

    /**
     * @return the singleton field
     */
    public static ScreenController getInstance(){
        if(singleton == null){
            initializeScreenController();
        }
        return singleton;
    }

    /**
     * Set up the mainScreen, and set it to the mai nmenu
     */
    static private void initializeScreenController(){
        setScreen(Screens.MAIN_MENU);
    }

    /**
     *
     * @return the main pane that is adjust with calls to setScreen, and backOneScreen
     */
    static public Pane getBasePane(){
        if (main.getChildren().size()==0) {
            initializeScreenController();
        }
        return main;
    }

    /**
     *
     * @param s a field of the screens enumeration, used to call the enumerations get
     *          screen method so it can be added to the stack.
     */
    static void setScreen(Screens s){
        main.getChildren().removeAll(main.getChildren());
        main.getChildren().add(screensStack.push(s.getScreen()));
    }

    /**
     * Should go back to the previous screen when called
     */
    static public void backOneScreen(){
        screensStack.pop();
        main.getChildren().removeAll(main.getChildren());
        main.getChildren().add(screensStack.lastElement());
    }

}
