package xo_MiniProjekat;

import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        XOTabla objekat1 = new XOTabla();

        System.out.print("Unesite ime igraca X: ");
        objekat1.setImeXIgraca(s.next());
        System.out.print("Unesite ime igraca O: ");
        objekat1.setImeOIgraca(s.next());

        objekat1.pokreniIgru();

        while (!objekat1.popunjenaTabela() && !objekat1.pobednikX() && !objekat1.pobednikO()) {

            objekat1.koJeNaPotezu();

            System.out.println("Unesi polje za igru: ");
            int potez = s.nextInt();
            objekat1.odigrajPotez(potez);

            objekat1.stampaj();
        }
    }
}
