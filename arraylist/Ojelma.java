import java.util.Scanner;
 
public class Ohjelma {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
		Lista<Integer> list = new Lista<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(16);
		list.add(-32);
		list.add(-64);
		
		System.out.println("koko " + list.size());
		System.out.println("16 " + list.contains(16));
		System.out.println("-16 " + list.contains(-16));
		System.out.println("indeksi 5 " + list.valueOf(5));
		System.out.println("16 indeksi " + list.indexOf(16));
		System.out.println("Poistetaan 16");
		list.remove(16);
		System.out.println("16 " + list.contains(16));
		System.out.println("indeksi 5 " + list.valueOf(5));
		System.out.println("koko " + list.size());
 
    }
}
