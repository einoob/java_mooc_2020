/*
 *  Eino Lindberg 2020
 */

package lentokentta.domain;

public class Flight {
	private Airplane plane;
	private Location start;
	private Location dest;
 
	public Flight(Airplane plane, Location start, Location dest) {
		this.plane = plane;
		this.start = start;
		this.dest = dest;
	}
	
	public Location getStart() {
		return start;
	}
	
	public Location getDest() {
		return dest;
	}
	
	public Airplane getPlane() {
		return plane;
	}
	
	@Override
	public String toString() {
		String trip = " (" + this.start.toString() + "-" + this.dest.toString() + ")";
		return this.plane.toString() + trip;
	}
}
