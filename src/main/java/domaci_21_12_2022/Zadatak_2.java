package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_2 {
//    .Zadatak
//Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto.
//Brojeve unosi korisnik.

    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int counter = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);
            if (broj % 2 == 0) {
                counter = counter + 1;
            }
        }
        System.out.println("U nizu ima " + counter + " parna broja.");
    }
}