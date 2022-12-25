package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_3 {
    //Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente
    // niza koji su veci od nule.

    public static void main(String[] args) {
        ArrayList<Integer> nizA = new ArrayList<Integer>();
        ArrayList<Integer> pozitivniBrojevi = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            nizA.add(broj);
            if (broj > 0) {
                pozitivniBrojevi.add(broj);
            }
        }
        System.out.println("Brojevi veci od nule u nizu A su: " + pozitivniBrojevi);
    }
}