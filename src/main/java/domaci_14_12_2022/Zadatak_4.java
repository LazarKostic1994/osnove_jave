package domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak_4 {
    public static void main(String[] args) {
//  Napisati program koji za unetu vrednost x odredjuje i prikazuje vrednost funkcije y. Iskoristite if/else za racunanje informacije i tek nakon te logike odstampajte vrednost y na ekranu.Funkcija y je definisana kao:
//  (x,x < 2
//y =(2,2 <= x < 10
//   (x - 1, x >= 10

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x: ");
        int x = s.nextInt();

        if (x < 2) {
            System.out.println("y = " + x);
        } else if (x < 10) {
            System.out.println("y = " + 2);
        } else {
            System.out.println("y = " + (x - 1));
        }

    }
}
