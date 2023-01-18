package domaci_16_01_2023.Zadatak_2;

public class MainIgrac {
//    U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

    public static void main(String[] args) {

        Igrac a = new Igrac("Lazar Kostic", "30015645641651", 1994, 10, "napadac", true);

        Karton zuti = new Karton("zuti");
        Karton crveni = new Karton("crveni");

        a.dodajKarton(zuti);
        a.dodajKarton(zuti);
        a.dodajKarton(zuti);
        a.dodajKarton(crveni);
        a.dodajKarton(crveni);

        a.stampaj();
    }
}
