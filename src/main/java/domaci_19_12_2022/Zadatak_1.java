package domaci_19_12_2022;

import java.util.Scanner;

public class Zadatak_1 {
//    Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj % 2 == 0){
                suma = suma + broj;
            }
        }
        System.out.println("Suma parnih brojeva je: " + suma);
    }
}
