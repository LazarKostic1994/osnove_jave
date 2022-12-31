package domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost u eurima: ");
        double vrednost = s.nextInt();

        System.out.println("Unesite valutu za konverziju: ");
        String valuta = s.next();

        konverzija(vrednost, valuta);
        System.out.println(konverzija(vrednost,valuta));
    }

    public static double konverzija(double eura, String valuta) {
        double rsd = eura * 117.2113;
        double usd = eura * 1.1821;
        double rub = eura * 89.2323;

        if (valuta.equals("RSD")) {
            return rsd;
        } else if (valuta.equals("USD")) {
            return usd;
        } else if (valuta.equals("RUB")) {
            return rub;
        }
        return 0;
    }
}
