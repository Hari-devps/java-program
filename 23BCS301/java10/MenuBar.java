import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCombination;

public class MenuBar extends Application {

    // launch the application
    public void start(Stage s) {
        // set title for the stage
        s.setTitle("Creating MenuBar");

        // create a menu
        Menu m = new Menu("Menu");

        // create menuitems
        MenuItem m1 = new MenuItem("Menu Item 1");
        MenuItem m2 = new MenuItem("Menu Item 2");
        MenuItem m3 = new MenuItem("Menu Item 3");

        // add menu items to menu
        m.getItems().add(m1);
        m.getItems().add(m2);
        m.getItems().add(m3);

        // label to display events
        Label l = new Label("\t\t\t\tNo menu item selected");

        // create events for menu items
        EventHandler<ActionEvent> event = (ActionEvent e) -> {
            l.setText("\t\t\t\t" + ((MenuItem) e.getSource()).getText() + " selected");
        };

        // add event handlers to menu items
        m1.setOnAction(event);
        m2.setOnAction(event);
        m3.setOnAction(event);

        // create a menubar
        MenuBar mb = new MenuBar();

        // add menu to menubar
        mb.getMenus().add(m);

        // create a VBox to hold the MenuBar and Label
        VBox vb = new VBox(mb, l);

        // create a scene
        Scene sc = new Scene(vb, 500, 300);

        // set the scene
        s.setScene(sc);
        
        // Handling window close event properly
        s.setOnCloseRequest(event1 -> {
            System.out.println("Application closed");
            System.exit(0); // Ensures the application closes properly
        });

        // show the stage
        s.show();
    }

    public static void main(String[] args) {
        // launch the application
        launch(args);
    }
}
