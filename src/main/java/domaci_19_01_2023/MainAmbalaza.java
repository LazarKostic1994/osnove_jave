package domaci_19_01_2023;

import p12_01_2023.Zadatak_1.Korisnik;

public class MainAmbalaza {
//    U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
    public static void main(String[] args) {

        Korpa korpa = new Korpa();

        Ambalaza ambalaza1 = new Tetrapak("12123 - 21432", "Tetra-Pak", 150, 200,
                false, 200);
        Ambalaza ambalaza2 = new StaklenaAmbalaza("65433 - 32312", "Flasa", 200, 300,
                20, true, 50);
        Ambalaza ambalaza3 = new StaklenaAmbalaza("21545-78965", "Casa", 80, 100,
                10, false, 120);

        SuperKartica kartica = new SuperKartica("3585", "Lazar Kostic", 20);

        korpa.dodajAmbalazu(ambalaza1);
        korpa.dodajAmbalazu(ambalaza2);
        korpa.dodajAmbalazu(ambalaza3);

        korpa.izbaciAmbalazu("65433 - 32312");


        kartica.stampaj();
        System.out.println("U korpi se nalaze: ");
        for (int i = 0; i < korpa.getNizAmbalaza().size(); i++) {
            korpa.getNizAmbalaza().get(i).stampaj();
        }
        System.out.print("Cija je ukupna cena sa popustom: " + korpa.cenaKorpe(kartica));

    }
}
