/**
 * @author: Muzhda Ehsan
 * @program: ICE12
 * @date: 2020-Dec-09
 */
package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        // step #1 - create controlles
        Label helloLabel = new Label("Hello, World!!!");

        Label goodByeLabel = new Label("Good Bye!!");

        Button clickMeButton = new Button("Click me");

        // step #1.1 - control configuration
        Font font = Font.font("Consolas", FontWeight.BOLD, 20);
        clickMeButton.setFont(font);

        // step #1.2 -  set event for buttons
        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("ClickMe Button Clicked!");

                helloLabel.setText("The button has been clicked!");
            }
        });

        // step 2 - create a container
        // HBox hbox = new HBox(helloLabel, clickMeBUtton);

        //VBox vbox = new VBox(helloLabel, clickMeBUtton);

        GridPane gridPane = new GridPane();

        gridPane.add(helloLabel, 1, 0);
        gridPane.add(goodByeLabel, 1, 1);
        gridPane.add(clickMeButton, 2, 2);

        // step #3 - add layout container to scene
        Scene scene = new Scene(gridPane, WIDTH, HEIGHT);

        // step #4 - add scene to stage
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}