package domaci_19_12_2022;

import java.util.Scanner;

public class Zadatak_2 {
//    Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj > 99 && broj < 1000) {
                suma = suma + broj;
            }
        }
        System.out.println("Suma je: " + suma);
    }
}
