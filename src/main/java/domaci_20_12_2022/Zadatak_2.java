package domaci_20_12_2022;

import java.util.Scanner;

public class Zadatak_2 {
//    Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje
//    arapsku vrednost sve dok korisnik ne unese KRAJ..
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int jedan = 1;
        String rimski1 = "I";
        int pet = 5;
        String rimski5 = "V";
        int deset = 10;
        String rimski10 = "X";
        int pedeset = 50;
        String rimski50 = "L";
        int sto = 100;
        String rimski100 = "C";
        int petsto = 500;
        String rimski500 = "D";
        int hiljadu = 1000;
        String rimski1000 = "M";

        System.out.println("Unesite rimski broj: ");
        String rBroj = s.next();

        while (!rBroj.contains("Kraj")) {

            if (rBroj.equals(rimski1)){
                System.out.println("Arapski: " + jedan);
            }
            if (rBroj.equals(rimski5)) {
                System.out.println("Arapski: " + pet);
            }
            if (rBroj.equals(rimski10)) {
                System.out.println("Arapski: " + deset);
            }
            if (rBroj.equals(rimski50)) {
                System.out.println("Arapski: " + pedeset);
            }
            if (rBroj.equals(rimski100)) {
                System.out.println("Arapski: " + sto);
            }
            if (rBroj.equals(rimski500)) {
                System.out.println("Arapski: " + petsto);
            }
            if (rBroj.equals(rimski1000)) {
                System.out.println("Arapski: " + hiljadu);


            }
            System.out.println("Unesite rimski broj: ");
            rBroj = s.next();
        }
        System.out.println("Kraj programa.");
    }
}
