package domaci_20_12_2022;

import java.util.Scanner;

public class Zadatak_4 {
//Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =.
//Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unos: ");
        String karakter = s.next();
        int brojac1 = 0;
        int brojac2 = 0;
        while (!karakter.equals("=")){

            if (karakter.contains("(")) {
                brojac1 = brojac1 + 1;
            }
            if (karakter.contains(")")) {
                brojac2 = brojac2 + 1;
            }
            System.out.println("Unos: ");
            karakter = s.next();
        }
        if (brojac1 == brojac2){
            System.out.println("Zagrade su uparene");
        }else {
            System.out.println("Zagrade nisu uparene");
        }

    }

}
