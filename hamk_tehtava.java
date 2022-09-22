import java.util.Scanner;

public class Login {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // kysy käyttäjän tiedot:
    // etunimi, sukunimi ja yrityksen verkkotunnus

    System.out.println("Etunimi?");
    String etunimi = in.nextLine();

    System.out.println("Sukunimi?");
    String sukunimi = in.nextLine();

    System.out.println("Yrityksen verkkotunnus?");
    String verkkotunnus = in.nextLine();
    // ehto, jos tyhjä, loppuu
    if ((etunimi.isEmpty()) || (sukunimi.isEmpty()) || (verkkotunnus.isEmpty())) {
      System.out.println("Virhe, jokin tiedoista puuttui!");
    } else {
      // muodosta email: etunimi.sukunimi@verkkotunnus
      System.out.println("E-mailosoite on " + (etunimi.toLowerCase()) + "." + (sukunimi.toLowerCase()) + "@"
          + (verkkotunnus.toLowerCase()) + ".");
      // muodosta username: etunimen 4 ensimmäistä ja sukunimen 4viimeistä merkkiä
      System.out.println("Käyttäjänimi on " + etunimi.substring(0, 4) + sukunimi.substring(sukunimi.length() - 4));
    }
  } // main loppuu
} // luokka loppuu
