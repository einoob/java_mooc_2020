/*
 *  Eino Lindberg 2020
 */

package lentokentta.service;

import lentokentta.service.Service;
import lentokentta.domain.Airplane;
import lentokentta.domain.Flight;
import lentokentta.domain.Location;
import java.util.Scanner;
 
public class UI {
	private Scanner scan;
	private Service service;
	
	public UI(Scanner scan, Service service) {
		this.scan = scan;
		this.service = service;
	}
	
	public void addData() {
		System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
        System.out.println();
		while (true) {
			System.out.println("Valitse toiminto:\n[1] Lisää lentokone\n"
				+ "[2] Lisää lento\n[x] Poistu hallintamoodista\n>");
			String cmnd = scan.nextLine();
			if (cmnd.equals("x")) {
				break ;
			} else if (cmnd.equals("1")) {
				System.out.println("Anna lentokoneen tunnus:");
				String id = scan.nextLine();
				System.out.println("Anna lentokoneen kapasiteetti:");
				int capacity = Integer.valueOf(scan.nextLine());
				service.addPlane(new Airplane(id, capacity));
			} else if (cmnd.equals("2")) {
				System.out.println("Anna lentokoneen tunnus:");
				String id = scan.nextLine();
				System.out.println("Anna lähtöpaikan tunnus:");
				Location start = new Location(scan.nextLine());
				System.out.println("Anna kohdepaikan tunnus:");
				Location dest = new Location(scan.nextLine());
				Airplane plane = service.getPlane(id);
				service.addFlight(new Flight(plane, start, dest));
			}
		}
	}
	
	public void printData() {
		System.out.println("Lentopalvelu");
        System.out.println("------------");
        System.out.println();
		while (true) {
			System.out.println("Valitse toiminto:\n[1] Tulosta lentokoneet\n"
				+ "[2] Tulosta lennot\n[3] Tulosta lentokoneen tiedot\n[x] Lopeta\n>");
			String cmnd = scan.nextLine();
			if (cmnd.equals("x")) {
				break ;
			} else if (cmnd.equals("1")) {
				service.listPlanes();
			} else if (cmnd.equals("2")) {
				service.listFlights();
			} else if (cmnd.equals("3")) {
				System.out.println("Mikä kone:");
				String id = scan.nextLine();
				System.out.println(service.getPlane(id).toString());
			}
		}
	}
}
