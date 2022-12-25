package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1 {
//    .Zadatak
//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost
// elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        brojevi.add (23);
        brojevi.add (12);
        brojevi.add (18);
        brojevi.add (10);
        brojevi.add (4);
        brojevi.add (9);
        brojevi.add (13);
        brojevi.add (22);
        brojevi.add (16);
        brojevi.add (1);
        System.out.println(brojevi);
        System.out.println("Unesite poziciju od 0 do 9: ");
        int pozicija = s.nextInt();
        System.out.println("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();

        brojevi.set(pozicija, novaVrednost);
        System.out.println(brojevi);
    }
}

