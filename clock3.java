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
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class clock3 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
		// Create a clock pane
		clock clock = new clock();
                

		// Create a hBox and set it porperties
		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);

		// Create two buttons
		Button btStop = new Button("Stop");
		Button btStart = new Button("Start");

		// Create and register handler
		btStop.setOnAction(e -> clock.pause());
		btStart.setOnAction(e -> clock.play());

		// Place buttons in hBox
		hBox.getChildren().addAll(btStop, btStart);

		// Create a border pane and place the nodes in to it
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(clock);
		borderPane.setBottom(hBox);

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 250, 270);
		primaryStage.setTitle("clock3"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
                 
  
    
	}
public static void main(String[] args) {

Application.launch(args);} }
    
