/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariem
 */
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class clock2 extends Application {
    @Override // Override the start method in the Application class

public void start(Stage primaryStage) {
     Random random = new Random();
    
    int minute = random.nextInt(2)==0?0:30;
    int hour= random.nextInt(12);
    clock clock1 = new clock(hour,minute,0);
    
    clock1.setSecondHandVisible(false);
    BorderPane pane = new BorderPane();
    Label label = new Label(hour+" : "+minute +" : 0 ");
    BorderPane.setAlignment(label,Pos.CENTER);
   
    pane.setCenter(clock1);
    pane.setBottom(label);
    
    Scene scene = new Scene(pane, 250, 250);
    primaryStage.setTitle("clock2"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); }
    

public static void main(String[] args) {
Application.launch(args);} }


