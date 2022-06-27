package com.company.app.tutojavafxmodules;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFXTuto3");
			
			Button btn = new Button();
			btn.setText("Cliquer");
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					System.out.println("Event received.");
				}
			} );
			
			
	        //var javaVersion = SystemInfo.javaVersion();
	        //var javafxVersion = SystemInfo.javafxVersion();
	        //var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
	        //var scene = new Scene(new StackPane(label), 640, 480);
			
			
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			//Parent root =  root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			StackPane root = new StackPane();
			root.getChildren().add(btn);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
