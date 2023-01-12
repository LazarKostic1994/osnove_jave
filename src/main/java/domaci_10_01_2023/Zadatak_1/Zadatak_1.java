package domaci_10_01_2023.Zadatak_1;

import p27_12_2022.Auto;

public class Zadatak_1 {
    public static void main(String[] args) {

        Autor robert = new Autor("Robert", "Kiosaki");
        Autor stiven = new Autor("Stiven", "R.Kavi");

        Knjiga otac = new Knjiga(1234, "Bogati otac, siromasni otac", 1997, robert);
        Knjiga navike = new Knjiga(4321, "Sedam navika uspesnih ljudi", 1989, stiven);

        robert.stampaj();
        otac.stampaj();

        stiven.stampaj();
        navike.stampaj();
    }
}
