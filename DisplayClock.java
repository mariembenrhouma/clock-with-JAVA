/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariem
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
public class DisplayClock extends Application {
@Override // Override the start method in the Application class

public void start(Stage primaryStage) {

// Create a clock and a label

clock clock = new clock();
String timeString = clock.getHour() + ":" + clock.getMinute()+ ":" + clock.getSecond();
Label lblCurrentTime = new Label(timeString);

// Place clock and label in border pane

BorderPane pane = new BorderPane();

pane.setCenter(clock);

pane.setBottom(lblCurrentTime);

BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

// Create a scene and place it in the stage

Scene scene = new Scene(pane, 250, 250);

primaryStage.setTitle("DisplayClock"); // Set the stage title

primaryStage.setScene(scene); // Place the scene in the stage

primaryStage.show(); }

public static void main(String[] args) {

Application.launch(args);} 
}
    

