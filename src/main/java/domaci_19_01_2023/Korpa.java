package domaci_19_01_2023;

import java.util.ArrayList;

public class Korpa {
//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.

    private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

    public ArrayList<Ambalaza> getNizAmbalaza() {
        return nizAmbalaza;
    }

    public void dodajAmbalazu (Ambalaza ambalaza){
        nizAmbalaza.add(ambalaza);
    }

    public void izbaciAmbalazu (String barkod){
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            if (nizAmbalaza.get(i).getBarkod().equals(barkod)){
                nizAmbalaza.remove(i);
            }
        }
    }
    private double cenaAmbalazeSaPopustom (double popust){
        double cenaAmbalaze = 0;
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            cenaAmbalaze = nizAmbalaza.get(i).cenaArtikla() - ((nizAmbalaza.get(i).cenaArtikla() * popust) / 100);
        }
        return cenaAmbalaze;
    }

    public double cenaKorpe(SuperKartica popust){
        double cenaKorpe = 0;
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            cenaKorpe = cenaKorpe + nizAmbalaza.get(i).cenaArtikla();
        }
        return cenaKorpe - (cenaKorpe * popust.getPopust()) / 100;
    }



}
