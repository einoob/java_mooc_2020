/*
 *  Eino Lindberg 2020
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
 
public class SanaharjoitteluSovellus extends Application {
	
	private Dictionary dict;
	
	@Override
	public void init() throws Exception {
		this.dict = new Dictionary();
	}
 
	@Override
	public void start(Stage window) {
		InsertView insertview = new InsertView(dict);
		PracticeView practiceview = new PracticeView(dict);
		
		BorderPane frame = new BorderPane();
		
		Button addWords = new Button("Add words");
		Button practice = new Button("Practice");
	
		HBox topButtons = new HBox();
		topButtons.getChildren().addAll(addWords, practice);
		topButtons.setSpacing(16);
		
		frame.setTop(topButtons);
		frame.setCenter(insertview.getView());
		addWords.setOnAction((e) -> {
			frame.setCenter(insertview.getView());
		});
		practice.setOnAction((e) -> {
			frame.setCenter(practiceview.getView());
		});
		
		Scene view = new Scene(frame);
		window.setScene(view);
		window.setWidth(640);
		window.setHeight(360);
		window.show();
	}
    public static void main(String[] args) {
		launch(SanaharjoitteluSovellus.class);
    }
}
