//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 8 Exercise-2
//Date: 2020/05/05

package Exercise2;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application 
{
	Sphere s = new Sphere(50);
	Cylinder c = new Cylinder(50, 100);
	Box b = new Box(100, 100, 75);
	Polygon h = new Polygon();
	
	RotateTransition rt1 = new RotateTransition(Duration.millis(3000),s); 
	RotateTransition rt2 = new RotateTransition(Duration.millis(3000),c); 
	RotateTransition rt3 = new RotateTransition(Duration.millis(3000),b); 
	RotateTransition rt4 = new RotateTransition(Duration.millis(3000),h); 
	
	ScaleTransition t = new ScaleTransition(Duration.millis(2000),s);  
	
	FadeTransition ft = new FadeTransition(Duration.millis(3000), h);
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		FanPane pane = new FanPane();
		
		// create a sphere 
		s.setTranslateX(150); 
        s.setTranslateY(150); 
        PhongMaterial phmaterial1 = new PhongMaterial();
        phmaterial1.setDiffuseColor(Color.RED);
        s.setMaterial(phmaterial1);
        
        //create a Cylinder 
        c.setTranslateX(450);
        c.setTranslateY(150); 
        PhongMaterial phmaterial2 = new PhongMaterial();
        phmaterial2.setDiffuseColor(Color.BLUE);
        c.setMaterial(phmaterial2);
        
        //create a Box
        b.setTranslateX(150);
        b.setTranslateY(450); 
        PhongMaterial phmaterial3 = new PhongMaterial();
        phmaterial3.setDiffuseColor(Color.ORANGE);
        b.setMaterial(phmaterial3);
        
       //create a Polygon
        h.getPoints().addAll(new Double[]{        
        		   420.0, 380.0, 
        		   480.0, 380.0, 
        		   520.0, 430.0,          
        		   480.0, 475.0, 
        		   420.0, 475.0,                   
        		   380.0, 430.0, 
        		});
        
		pane.getChildren().addAll(s);
		pane.getChildren().addAll(c);
		pane.getChildren().addAll(b);
		pane.getChildren().addAll(h);

		// these Animation Button
		Button btRotate = new Button("Rotate");
		btRotate.setOnAction(e -> rotate(e));
		
		Button btScale = new Button("Scale");
		btScale.setOnAction(e -> scale(e));
		
		Button btFade = new Button("Fade(Only for 2-D)");
		btFade.setOnAction(e -> Fade(e));
		
		Button btSequential = new Button("Sequential");
		btSequential.setOnAction(e -> Sequential(e));
				
		HBox buttons = new HBox(5);
		buttons.getChildren().addAll(btRotate, btScale, btSequential, btFade);
		buttons.setAlignment(Pos.CENTER);
		buttons.setPadding(new Insets(10, 10, 10, 10));

		BorderPane Pane = new BorderPane(pane, null, null, buttons, null);
		primaryStage.setScene(new Scene(Pane, 600, 680));
	    primaryStage.setTitle("CS151 HW8 Exercise-2 ");
	    primaryStage.show();
		
	}

	//the Rotate Transition Part
	private void rotate(ActionEvent e) 
	{
		rt1.setByAngle(360); 
	    rt1.setCycleCount(50); 
	    rt1.setAutoReverse(false); 
		rt1.play();
		
		rt2.setByAngle(360); 
	    rt2.setCycleCount(50); 
	    rt2.setAutoReverse(false); 
		rt2.play();
		
		rt3.setByAngle(360); 
	    rt3.setCycleCount(50); 
	    rt3.setAutoReverse(false); 
		rt3.play();
		
		rt4.setByAngle(360); 
	    rt4.setCycleCount(50); 
	    rt4.setAutoReverse(false); 
		rt4.play();
	}
	
	// the Scale Transition Part
	private void scale(ActionEvent e) 
	{
		//ScaleTransition t = new ScaleTransition(Duration.millis(2000),s);  
		t.setByX(1);
		t.setByY(1);
		t.setCycleCount(50); 
		t.setAutoReverse(false);  
		t.play();  
	}
	
	// the Fade Transition Part
	private void Fade(ActionEvent e) 
	{
		//FadeTransition ft = new FadeTransition(Duration.millis(3000), h);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
	}
	
	// the Sequential Transition Part
	private void Sequential(ActionEvent e)
	{
		SequentialTransition S = new SequentialTransition(rt4, t, ft); 
		S.play();
	}
	
	
	public static void main(String[] args) 
	{
		Animation.launch(args);
	}
	
	private class FanPane extends Pane
	{	
		FanPane()
		{
			Line lineX2 = new Line(0, 0, 600, 0);
			Line lineX = new Line(0, 300, 600, 300);
			Line lineY = new Line(300, 0, 300, 600);
			Line lineY2 = new Line(600, 0, 600, 600);
			Line lineY3 = new Line(0, 0, 600, 0);
			Line lineX3 = new Line(0, 600, 600, 600);	
			
			getChildren().addAll(lineX);
			getChildren().addAll(lineX2);
			getChildren().addAll(lineX3);
			getChildren().addAll(lineY);
			getChildren().addAll(lineY2);
			getChildren().addAll(lineY3);
		}
	}

}
