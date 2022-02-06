/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariem
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class ClockAnimation extends Application {
    @Override
    public void start (Stage primaryStage){
    clock clock1 = new clock();
    EventHandler<ActionEvent> eventHandler =e ->{
    clock1.setCurrentTime();};
    Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play();
    Scene scene = new Scene (clock1,300,100);
    primaryStage.setTitle("Clock Animation");
    primaryStage.setScene(scene);
    primaryStage.show();
    
    }      
   public static void main (String[] args){
    Application.launch(args);}
}
    

