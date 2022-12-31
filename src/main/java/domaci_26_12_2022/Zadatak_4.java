package domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak_4 {
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("JMBG: ");
    String jmbg = s.next();
    System.out.println("Ime: ");
    String ime = s.next();
    System.out.println("Prezime: ");
    String prezime = s.next();
    System.out.println("God. rodjenja: ");
    int godine = s.nextInt();
    System.out.println("Aktivan: ");
    boolean aktivan = s.nextBoolean();

    podaci("3002994722236", "Lazar", "Kostic", 1994, aktivan);
}
    public static void podaci (String jmbg, String ime, String prezime, int godine, boolean aktivnost){
        System.out.println(jmbg);
        System.out.println(ime);
        System.out.println(prezime);
        System.out.println(godine);
        System.out.println(aktivnost);
    }
}
