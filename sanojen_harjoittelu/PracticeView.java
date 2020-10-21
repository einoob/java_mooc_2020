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
import javafx.scene.Parent;

public class PracticeView {
	private Dictionary dict;
	private String word;
	
	public PracticeView(Dictionary dict) {
		this.dict = dict;
		this.word = dict.randomWord();
	}
	
	public Parent getView() {
		Label task = new Label();
		TextField usertf = new TextField();
		Button checkbtt = new Button("Check");
		Label feedback = new Label("\n\n");
		VBox practiceBox = new VBox();
		practiceBox.getChildren().addAll(task, usertf, checkbtt, feedback);
		practiceBox.setSpacing(8);
		practiceBox.setAlignment(Pos.CENTER);
		usertf.setMaxSize(200, 20);
		word = dict.randomWord();
		
		if (word.equals("empty")) {
			task.setText("Add some words before practicing.");
		} else {
			task.setText("Translate the word \"" + word + "\"");
		}
		checkbtt.setOnAction((e -> {
			if (task.getText().charAt(0) == 'A') {
				return ;
			}
			String userAns = usertf.getText().trim().toLowerCase();
			if (userAns.equals(dict.translate(word))) {
				feedback.setText("That's correct! :)\n" + word
				+ "'s translation is " + dict.translate(word));
			} else {
				feedback.setText("Wrong answer. :(\n" + word 
					+ "'s translation is " + dict.translate(word).substring(0, dict.translate(word).length() / 2 + 1) + "...");
				return ;
			}
			usertf.clear();
			word = dict.randomWord();
			task.setText("Translate word \"" + word + "\"" );
		}));
		return practiceBox;
	}
	
}
