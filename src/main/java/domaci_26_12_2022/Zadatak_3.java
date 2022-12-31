package domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak_3 {
//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj x: ");
        int x = s.nextInt();
        System.out.println("Unesite broj y: ");
        int y = s.nextInt();
        int vrednost = funkcija(x, y);

        System.out.println("Vrednost je: " + vrednost);
    }
    public static int funkcija (int a, int b){
        int m = a * 10 + b;

        return m;
    }
}
