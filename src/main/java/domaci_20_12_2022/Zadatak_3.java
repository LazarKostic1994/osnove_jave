package domaci_20_12_2022;

import java.util.Scanner;

public class Zadatak_3 {
//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int brojcanik1 = 0;
        int brojcanik2 = 0;

        while (brojcanik1 != 3 && brojcanik2 != 2){
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj == 1){
                brojcanik1 = brojcanik1 + 1;
            }
            if (broj == 2){
                brojcanik2 = brojcanik2 + 1;
            }
        }
        System.out.println("Kraj programa.");
    }
}
