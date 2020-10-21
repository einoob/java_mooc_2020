/*
 *  Eino Lindberg 2020
 */

import java.util.Map;
import java.util.HashMap;
 
public class Ostoskori {
	private Map<String, Ostos> basket;
 
	public Ostoskori() {
		this.basket = new HashMap<>();
	}
	
	public void lisaa(String product, int price) {
		if (basket.keySet().contains(product)) {
			basket.get(product).kasvataMaaraa();
		} else {
			basket.put(product, new Ostos(product, 1, price));
		}
	}
	
	public int hinta() {
		int price = 0;
		for (String obj : basket.keySet()) {
			price += basket.get(obj).hinta();
		}
		return price;
	}
	
	public void tulosta() {
		for (String obj : basket.keySet()) {
			System.out.println(basket.get(obj).toString());
		}
	}
}
