/*
 *  Eino Lindberg 2020
 */

package lentokentta.service;
 
import lentokentta.domain.Airplane;
import lentokentta.domain.Flight;
import lentokentta.domain.Location;
import java.util.ArrayList;
 
public class Service {
	private ArrayList<Airplane> planes;
	private ArrayList<Flight> flights;
	
	public Service() {
		this.planes = new ArrayList<>();
		this.flights = new ArrayList<>();
	}
	
	public Airplane getPlane(String id) {
		for (Airplane plane : planes) {
			if (id.matches(plane.getId())) {
				return plane;
			}
		}
		return null;
	}
	
	public void addPlane(Airplane plane) {
		planes.add(plane);
	}
	
	public void addFlight(Flight flight) {
		flights.add(flight);
	}
	
	public void listPlanes() {
		for (Airplane plane : planes) {
			System.out.println(plane);
		}
	}
	
	public void listFlights() {
		for (Flight flight : flights) {
			System.out.println(flight);
		}
	}
	
	public void planeInfo(String id) {
		for (Airplane plane : planes) {
			if (plane.getId().matches(id)) {
				System.out.println(plane);
			}
		}
	}
}
