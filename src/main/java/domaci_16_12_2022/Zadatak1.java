package domaci_16_12_2022;

import java.util.Scanner;

public class Zadatak1 {
//    Napisati program koji za uneti broj x
//            (smatrajte da korisnik unosi jednocifreni broj) ispisuje tablicu mnozenja za taj broj.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int broj = s.nextInt();
//        int rezultat = 0;

        for (int i = 1; i <=10 ; i++) {
            int rezultat = broj * i;
            System.out.println(broj + " * " + i + " = " + rezultat);
        }
    }
}
