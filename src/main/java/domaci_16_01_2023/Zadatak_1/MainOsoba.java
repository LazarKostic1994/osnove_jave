package domaci_16_01_2023.Zadatak_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainOsoba {
//    U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
    public static void main(String[] args) {

//        Igrac a = new Igrac("Lazar Kostic", "321548765421", 1994, 10, "Napadac", false);
//        Igrac b = new Igrac("Aleksandar Vujicic", "546412165413", 1993, 11, "Stoper", true);
//
//        Trener c = new Trener("Radomir Antic", "123145612135", 1963, 30, "za igru");
//        Trener d = new Trener("Dragan Stojkovic", "1231654162165", 1965, 27, "kondicioni");
//
//        a.stampaj();
//        b.stampaj();
//
//        c.stampaj();
//        d.stampaj();

        Scanner s = new Scanner(System.in);

        ArrayList<Igrac> igraci = new ArrayList<Igrac>();
        System.out.println("Unesite broj igraca: ");
        int brojIgraca = s.nextInt();

        for (int i = 0; i < brojIgraca; i++) {
            System.out.print("Unesite ime i prezime igraca: ");
            String imeiPrezime = s.next();
            System.out.print("JMBG: ");
            String jmbg = s.next();
            System.out.print("Godina rodjenja: ");
            int godinaRodjenja = s.nextInt();
            System.out.print("Broj igraca: ");
            int brIgraca = s.nextInt();
            System.out.print("Pozicija: ");
            String pozicija = s.next();
            System.out.print("Da li je kapiten: ");
            boolean kapiten = s.nextBoolean();
            if (kapiten == true){
                System.out.println("jeste");
            } else {
                System.out.println("nije");
            }
            Igrac a = new Igrac(imeiPrezime, jmbg, godinaRodjenja, brIgraca, pozicija, kapiten);
            igraci.add(a);

            igraci.get(i).stampaj();
        }


        ArrayList<Trener> treneri = new ArrayList<Trener>();
        System.out.println("Unesite broj trenera: ");
        int brojTrenera = s.nextInt();

        for (int i = 0; i < brojTrenera; i++) {
            System.out.print("Unesite ime i prezime trenera: ");
            String imeiPrezime = s.next();
            System.out.print("JMBG: ");
            String jmbg = s.next();
            System.out.print("Godina rodjenja: ");
            int godinaRodjenja = s.nextInt();
            System.out.print("Godine iskustva: ");
            int godIskustva = s.nextInt();
            System.out.print("Tip trenera: ");
            String tipTrenera = s.next();

            Trener b = new Trener(imeiPrezime, jmbg, godinaRodjenja, godIskustva, tipTrenera);
            treneri.add(b);

            treneri.get(i).stampaj();
        }
    }
}

