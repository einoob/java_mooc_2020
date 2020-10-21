/*
 *  Eino Lindberg 2020
 */
 
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class Varasto {
	private Map<String, Integer> inventory;
	private Map<String, Integer> prices;
	
	public Varasto() {
		inventory = new HashMap<>();
		prices = new HashMap<>();
	}
	
	public void lisaaTuote(String tuote, int hinta, int saldo) {
		prices.put(tuote, hinta);
		inventory.put(tuote, saldo);
	}
	
	public int hinta(String tuote) {
		if (prices.keySet().contains(tuote)) {
			return prices.get(tuote);
		}
		return -99;
	}
	
	public int saldo(String tuote) {
		if (inventory.keySet().contains(tuote)) {
			return inventory.get(tuote);
		}
		return 0;
	}
	
	public boolean ota(String tuote) {
		if (inventory.keySet().contains(tuote)) {
			if (inventory.get(tuote) > 0) {
				int amnt = inventory.get(tuote);
				amnt--;
				inventory.replace(tuote, amnt);
				return true;
			}
		}
		return false;
	}
	
	public Set<String> tuotteet() {
		return inventory.keySet();
	}
}
