/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariem
 */


import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

public class clock extends Pane{
    private int hour;
    private int minute;
    private int second;
    private boolean hourHandVisible = true;
    private boolean minuteHandVisible = true;
    private boolean secondHandVisible = true;
    private Timeline animation;
    
    public clock(){
        setCurrentTime();
       
        animation = new Timeline(new KeyFrame(Duration.millis(1000),e -> setCurrentTime()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        
}
    
    public clock(int hour,int minute, int second ){
        
    this.hour= hour;
    this.minute= minute;
    this.second= second;
    paintClock();
   }

    public boolean isHourHandVisible() {
        return hourHandVisible;
    }

    public void setHourHandVisible(boolean hourHandVisible) {
        this.hourHandVisible = hourHandVisible;
    }

    public boolean isMinuteHandVisible() {
        return minuteHandVisible;
    }

    public void setMinuteHandVisible(boolean minuteHandVisible) {
        this.minuteHandVisible = minuteHandVisible;
    }

    public boolean isSecondHandVisible() {
        return secondHandVisible;
    }

    public void setSecondHandVisible(boolean secondHandVisible) {
        this.secondHandVisible = secondHandVisible;
    }
    
    public int getHour(){ return hour;}
    public void setHour (int hour){this.hour = hour;}
    public int getMinute(){return minute;}
    public void setMinute(int minute){this.minute = minute;}
    public int getSecond() {return second; }
    public void setSecond(int second)
    {this.second = second;
    paintClock(); }
    public void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute =calendar.get(Calendar.MINUTE);
        this.second =calendar.get(Calendar.SECOND);
        paintClock(); // Repaint the clock

}
    private void paintClock() {

// Initialize clock parameters

double clockRadius = Math.min(getWidth(),
getHeight()) * 0.8 * 0.5;

double centerX = getWidth() /2;

double centerY = getHeight() /2;



Circle circle = new Circle(centerX, centerY,clockRadius);
circle.setFill(Color.WHITE);
circle.setStroke(Color.BLACK);
Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
// Draw second hand
double sLength = clockRadius * 0.8;
double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));

double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI /60));
Line sLine = new Line(centerX, centerY, secondX, secondY);
sLine.setStroke(Color.RED);
sLine.setVisible(secondHandVisible);

// Draw minute hand
double mLength = clockRadius *0.65;
double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI /60));
Line mLine = new Line(centerX,centerY, xMinute, minuteY);
mLine.setStroke(Color.BLUE);
mLine.setVisible(minuteHandVisible);

// Draw hour hand
double hLength = clockRadius * 0.5;
double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
Line hLine = new Line(centerX, centerY, hourX, hourY);
hLine.setStroke(Color.GREEN);
hLine.setVisible(hourHandVisible);

getChildren().clear();
getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
}

@Override
public void setWidth(double width)
{ super.setWidth(width);
paintClock();
}

public void play(){animation.play();}
public void pause(){animation.pause();}

@Override
public void setHeight(double height) {
super.setHeight(height);
paintClock(); }}




