/*
 *  Eino Lindberg 2020
 */

public class Ostos {
	private String product;
	private int amnt;
	private int price;
 
	public Ostos(String product, int amnt, int price) {
		this.product = product;
		this.amnt = amnt;
		this.price = price;
	}
	
	public int hinta() {
		return this.price * this.amnt;
	}
	
	public void kasvataMaaraa() {
		this.amnt++;
	}
	
	@Override
	public String toString() {
		return this.product + ": " + this.amnt;
	}
}
