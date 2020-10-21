package lentokentta;
 
import java.util.Scanner;
import lentokentta.service.Service;
import lentokentta.service.UI;
public class Main {
 
    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
		Scanner scan = new Scanner(System.in);
		Service service = new Service();
		UI ui = new UI(scan, service);
		ui.addData();
		ui.printData();
    }
}
