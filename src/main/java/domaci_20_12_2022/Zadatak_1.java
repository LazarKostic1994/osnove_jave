package domaci_20_12_2022;

import java.util.Scanner;

public class Zadatak_1 {
//Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve
//dok se ne unese nula.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        while (broj != 0) {
            if (broj < 0) {
                System.out.println("Apsolutna vrednost je " + broj * (-1));
            } else {
                System.out.println("Apsolutna vrednost je" + broj);
            }
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
        }
        System.out.println("Kraj programa jer je uneta nula.");
    }
}

