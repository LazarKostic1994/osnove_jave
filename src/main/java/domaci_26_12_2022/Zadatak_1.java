package domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak_1 {
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
public static void main(String[] args) {
    stampajVrednostZa10Vecu(20, 10, 15, 5);
    }

    public static void stampajVrednostZa10Vecu(int a, int b, int c, int d) {
        System.out.println("Vrednost a je: " + a * 10);
        System.out.println("Vrednost b je: " + b * 10);
        System.out.println("Vrednost c je: " + c * 10);
        System.out.println("Vrednost d je: " + d * 10);
    }
}
