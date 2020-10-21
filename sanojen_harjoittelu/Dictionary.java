/*
 *  Eino Lindberg 2020
 */

package sovellus;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
 
public class Dictionary {
	private ArrayList<String> words;
	private HashMap<String, String> translations;
	
	public Dictionary() {
		words = new ArrayList<>();
		translations = new HashMap<>();
	}
	
	public void add(String word, String translation) {
		word = word.trim().toLowerCase();
		translation = translation.trim().toLowerCase();
		if (translations.containsKey(word)) {
			translations.remove(word);
			words.remove(word);
		}
		translations.put(word, translation);
		words.add(word);
	}
	
	public String translate(String word) {
		word = word.trim().toLowerCase();
		if (translations.containsKey(word)) {
			return translations.get(word);
		}
		return word;
	}
	
	public String randomWord() {
		Random rndm = new Random();
		if (words.isEmpty()) {
			return "empty";
		}
		return words.get(rndm.nextInt(words.size()));
	}
}
