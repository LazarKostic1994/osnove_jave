package domaci_10_01_2023.Zadatak_2;

public class Zadatak_2 {
    public static void main(String[] args) {

        ClanskaKarta clanskaKarta1 = new ClanskaKarta(10,"9329-0239");

        Kupac kupac1 = new Kupac("Kostic Lazar", clanskaKarta1, clanskaKarta1);

        Proizvod proizvod1 = new Proizvod("knjiga", 750, kupac1, clanskaKarta1);

        proizvod1.stampaj();

    }
}
