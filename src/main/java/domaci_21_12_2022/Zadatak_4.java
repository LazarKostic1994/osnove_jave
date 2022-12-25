package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_4 {
    //    . Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih
//    clanova niza koji su jednaki broju X.

    public static void main(String[] args) {
        ArrayList<Integer> nizA = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            nizA.add(broj);
        }
        System.out.println("Unesite X: ");
        int x = s.nextInt();
        String brojevi = " ";

        for (int i = 0; i < nizA.size(); i++) {
            if (nizA.get(i) == x) {
                brojevi = brojevi + i + ", ";
            }
        }
        System.out.println("Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: " + brojevi);
    }
}