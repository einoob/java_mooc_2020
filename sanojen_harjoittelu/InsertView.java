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
 
public class InsertView {
	
	private Dictionary dict;
	
	public InsertView(Dictionary dict) {
		this.dict = dict;
	}
	
	public Parent getView() {
		
		Label wordlbl = new Label("Word");
		Label translationlbl = new Label("Translation");
		TextField wordtf = new TextField();
		TextField translationtf = new TextField();
		Button addbtt = new Button("Add pair");
		VBox adderBox = new VBox();
		adderBox.getChildren().addAll(wordlbl, wordtf, translationlbl, translationtf, addbtt);
		adderBox.setSpacing(8);
		wordtf.setMaxSize(200, 20);
		translationtf.setMaxSize(200, 20);
		adderBox.setAlignment(Pos.CENTER);
		
		addbtt.setOnAction((e) ->{ 
			String word = wordtf.getText().trim().toLowerCase();
			String translation = translationtf.getText().trim().toLowerCase();
			dict.add(word, translation);
			wordtf.clear();
			translationtf.clear();
		});
		
		return adderBox;
	}
}
