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
import javafx.scene.control.ComboBox;
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
	
	ComboBox <String> FileMenu = new ComboBox<String>();
	
	// the rotate transition
	RotateTransition rt1 = new RotateTransition(Duration.millis(3000),s); 
	RotateTransition rt2 = new RotateTransition(Duration.millis(3000),c); 
	RotateTransition rt3 = new RotateTransition(Duration.millis(3000),b); 
	RotateTransition rt4 = new RotateTransition(Duration.millis(3000),h); 
	
	//the Scale Transition
	ScaleTransition t1 = new ScaleTransition(Duration.millis(3000),s);
	ScaleTransition t2 = new ScaleTransition(Duration.millis(3000),c);
	ScaleTransition t3 = new ScaleTransition(Duration.millis(3000),b);
	ScaleTransition t4 = new ScaleTransition(Duration.millis(3000),h);
	
	//the Fade Transition
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
        phmaterial3.setDiffuseColor(Color.GREEN);
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
		
		FileMenu.getItems().add("Sphere");
		FileMenu.getItems().add("Cylinder");
		FileMenu.getItems().add("Box");
		FileMenu.getItems().add("Polygon");
		FileMenu.setEditable(true);
		
		HBox hbox = new HBox(FileMenu);
				
		HBox buttons = new HBox(5);
		buttons.getChildren().addAll(hbox, btRotate, btScale, btFade, btSequential);
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
		String usertype = FileMenu.getValue().toString();
		if (usertype == "Sphere") {
			rt1.setByAngle(360); 
		    rt1.setCycleCount(50); 
		    rt1.setAutoReverse(false); 
			rt1.play();	
		} else if (usertype == "Cylinder") {
			rt2.setByAngle(360); 
		    rt2.setCycleCount(50); 
		    rt2.setAutoReverse(true); 
			rt2.play();
		} else if (usertype == "Box") {
			rt3.setByAngle(360); 
		    rt3.setCycleCount(50); 
		    rt3.setAutoReverse(false); 
			rt3.play();
		} else {
			rt4.setByAngle(360); 
		    rt4.setCycleCount(50); 
		    rt4.setAutoReverse(false); 
			rt4.play();
		}
	}
	
	// the Scale Transition Part
	private void scale(ActionEvent e) 
	{
		String usertype = FileMenu.getValue().toString();
		if (usertype == "Sphere") {
			t1.setByX(1);
			t1.setByY(1);
			t1.setCycleCount(50); 
			t1.setAutoReverse(false);  
			t1.play(); 	
		} else if (usertype == "Cylinder") {
			t2.setByX(1);
			t2.setByY(1);
			t2.setCycleCount(50); 
			t2.setAutoReverse(false);  
			t2.play(); 	
		} else if (usertype == "Box") {
			t3.setByX(1);
			t3.setByY(1);
			t3.setCycleCount(50); 
			t3.setAutoReverse(false);  
			t3.play(); 	
		} else {
			t4.setByX(1);
			t4.setByY(1);
			t4.setCycleCount(50); 
			t4.setAutoReverse(false);  
			t4.play(); 	
		} 
	}
	
	// the Fade Transition Part
	private void Fade(ActionEvent e) 
	{
		String usertype = FileMenu.getValue().toString();
		if (usertype == "Polygon") 
		{
			ft.setFromValue(1.0);
			ft.setToValue(0.1);
			ft.setCycleCount(Timeline.INDEFINITE);
			ft.setAutoReverse(true);
			ft.play();
		}
	}
	
	// the Sequential Transition Part
	private void Sequential(ActionEvent e)
	{	
		String usertype = FileMenu.getValue().toString();
		if (usertype == "Sphere") {
			rt1.setByAngle(360); 
		    	rt1.setCycleCount(50); 
		    	t1.setByX(1);
			t1.setByY(1);
			t1.setCycleCount(50); 
			SequentialTransition S1 = new SequentialTransition(s, rt1, t1);
			S1.getCurrentTime();
			S1.setAutoReverse(true);
			S1.play();
		} else if (usertype == "Cylinder") {
			rt2.setByAngle(360); 
		    rt2.setCycleCount(50); 
		    t2.setByX(1);
			t2.setByY(1);
			t2.setCycleCount(50); 
			SequentialTransition S2 = new SequentialTransition(c, rt2, t2); 
			S2.setCycleCount(2);
			S2.setAutoReverse(true);
			S2.playFromStart();
		} else if (usertype == "Box") {
			rt3.setByAngle(360); 
		    	rt3.setCycleCount(50); 
		    	t3.setByX(1);
			t3.setByY(1);
			t3.setCycleCount(50); 
			SequentialTransition S3 = new SequentialTransition(b, rt3, t3); 
			S3.setAutoReverse(true);
			S3.play();	
		} else {
			rt4.setByAngle(360); 
		    	rt4.setCycleCount(50); 
		    	t4.setByX(1);
			t4.setByY(1);
			t4.setCycleCount(50); 
			ft.setFromValue(1.0);
			ft.setToValue(0.1);
			ft.setCycleCount(Timeline.INDEFINITE);
			SequentialTransition S4 = new SequentialTransition(h, rt4, t4, ft); 
			S4.setAutoReverse(true);
			S4.play();
		} 
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
