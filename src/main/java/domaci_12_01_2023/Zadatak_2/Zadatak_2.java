package domaci_12_01_2023.Zadatak_2;

import java.util.Scanner;

public class Zadatak_2 {
//    U glavnom kreirati objekte i testirati funkcionalnosti

    public static void main(String[] args) {

    Racun r1 = new Racun("170-289328923-23", "Lazar", "Kostic", 1500);
    Racun r2 = new Racun("170-345342456-65", "Jelena", "Ognjanovic", 1200);

    Transakcija t1 = new Transakcija("151-214", r1, r2);

    r1.stampaj();
    r2.stampaj();

    Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost za transakciju: ");
        int unetaVrednost = s.nextInt();


        t1.prenosSredstava(unetaVrednost);
        t1.stampaj();
    }
}
