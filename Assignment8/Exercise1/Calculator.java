//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 8 Exercise-1
//Date: 2020/05/05


package Exercise1;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Calculator extends Application 
{
	private TextField tfNum1 = new TextField(); // the textField for first number 
	private TextField tfNum2 = new TextField(); // the textField for second number 
	private Button btnClear = new Button("Clear"); // the clear buttons
	private Label FinalAnswer = new Label(); // the text for final answer
	ComboBox <String> FileMenu = new ComboBox<String>(); // the menu of operative symbol
	
	//the image for the calculator buttons
	Image btnImg = new Image(getClass().getResourceAsStream("Calculator.png"));
	ImageView imageView = new ImageView(btnImg);
	Button btCalculate = new Button("Calculate"); // the calculator buttons.
	
	@Override 
	public void start(Stage primaryStage) throws Exception 
	{
		GridPane pane = new GridPane();
		pane.setVgap(10);
		pane.setHgap(10);
		
		FileMenu.getItems().add("+");
		FileMenu.getItems().add("-");
		FileMenu.getItems().add("*");
		FileMenu.getItems().add("/");
		FileMenu.setEditable(true);
		
		imageView.setFitWidth(50);
		imageView.setFitHeight(50);
		btCalculate.setGraphic(imageView);
		
		pane.add(new Label("The First Number:"), 0, 0);
		pane.add(tfNum1, 1, 0);
		pane.add(new Label("The Sceond Number:"), 0, 1);
		pane.add(tfNum2, 1, 1);
		pane.add(new Label("The Operation(Menu):"), 0, 2);
		HBox hbox = new HBox(FileMenu);
		pane.add(hbox, 1, 2);
		pane.add(new Label("The Final Answer:"), 0, 3);
		pane.add(FinalAnswer, 1, 3);
		pane.add(btnClear, 0, 4);
		pane.add(btCalculate, 1, 4);
		Scene scene = new Scene(pane, 500, 350);
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("CS151 HW8 Exercise-1");
	    primaryStage.show();
		
		pane.setAlignment(Pos.CENTER);
		tfNum1.setAlignment(Pos.BOTTOM_RIGHT);
		tfNum2.setAlignment(Pos.BOTTOM_RIGHT);
		GridPane.setHalignment(hbox, HPos.RIGHT);
		FinalAnswer.setAlignment(Pos.BOTTOM_RIGHT);
		GridPane.setHalignment(btnClear, HPos.LEFT);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		pane.setPadding(new Insets(11, 12, 13, 14));
		
		btnClear.setOnAction(e -> clearValue(e));
		btCalculate.setOnAction(e -> calculatorValue(e));	
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	private void clearValue(Event e)
	{
		//e tells us which button was clicked
		if (e.getSource() == btnClear) 
		{
		   tfNum1.setText("");
		   tfNum2.setText("");
		   FinalAnswer.setText("");
		   FileMenu.setValue("");
		   tfNum1.requestFocus();
		   return;
		}
	}
		
	private void calculatorValue(Event e)
	{
		int num1, num2, answer;
		char symbol;
		
		num1 = Integer.parseInt(tfNum1.getText());
		num2 = Integer.parseInt(tfNum2.getText());
		String usertype = FileMenu.getValue().toString();
		
		if (usertype == "+") 
		{
		   symbol = '+';
		   answer = num1 + num2;
		} else if (usertype == "-") {
		   symbol = '-';
		   answer = num1 - num2;
		} else if (usertype == "*") {
		   symbol = 'x';
		   answer = num1 * num2;
		} else {
		   symbol = '/';
		   answer = num1 / num2;
		}
		//display answer
		FinalAnswer.setText("" + num1 + " " + symbol + " " + num2 + " = " + answer);
	}

}
