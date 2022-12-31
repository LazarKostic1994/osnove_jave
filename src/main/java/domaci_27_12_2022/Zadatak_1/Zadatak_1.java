package domaci_27_12_2022.Zadatak_1;

import java.util.Scanner;

public class Zadatak_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Proizvod cokolada = new Proizvod();
        cokolada.nazivProizvoda = "Milka cokolada";
        cokolada.cenaProizvoda = 420;
        cokolada.tezinaProizvoda = 300;
        cokolada.jedinica = "kg";

        Proizvod marmelada = new Proizvod();
        marmelada.nazivProizvoda = "Marmelada";
        marmelada.cenaProizvoda = 420;
        marmelada.tezinaProizvoda = 300000;
        marmelada.jedinica = "t";

        cokolada.stampaj();
        System.out.println("Tezina proizvoda: " + cokolada.nazivProizvoda + " u " + cokolada.jedinica + " je " +
                cokolada.konvertuj(cokolada.jedinica) );


        marmelada.stampaj();
        System.out.println("Tezina proizvoda: " + marmelada.nazivProizvoda + " u " + marmelada.jedinica + " je " +
                marmelada.konvertuj(marmelada.jedinica) );

    }
}