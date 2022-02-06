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

import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class twoclock extends Application {
    @Override // Override the start method in the Application class

public void start(Stage primaryStage) {
    clock clock1 = new clock(4,20,45);
    clock clock2 = new clock(22,46,15);
    clock1.setHourHandVisible(true);
    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);
   
    pane.getChildren().addAll(clock1,clock2);
    HBox.setHgrow(clock1, Priority.ALWAYS);
    HBox.setHgrow(clock2, Priority.ALWAYS);
 
    Scene scene = new Scene(pane, 250, 250);
    primaryStage.setTitle("DisplayClock"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); }
    

public static void main(String[] args) {

Application.launch(args);} }


