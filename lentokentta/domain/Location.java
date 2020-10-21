/*
 *  Eino Lindberg 2020
 */

package lentokentta.domain;

public class Location {
	private String loc;
	
	public Location(String loc) {
		this.loc = loc;
	}
 
	public String getLocation() {
		return loc;
	}
	
	@Override
	public String toString() {
		return this.loc;
	}
}
 