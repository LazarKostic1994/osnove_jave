package domaci_16_01_2023.Zadatak_2;

import java.util.ArrayList;

public class Igrac extends Osoba {
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
    private int broj;
    private String pozicija;
    ArrayList<Karton> kartoni = new ArrayList<Karton>();
    private boolean kapiten;

    private Karton tipKartona;

    public Igrac() {
        super();
    }

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }


    public void dodajKarton(Karton tipKartona) {
        kartoni.add(tipKartona);
    }

    public int zutiKartoni() {
        int counter = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (this.kartoni.get(i).getTipKartona().equals("zuti")) {
                counter++;
            }
        }
        return counter;
    }

    public int crveniKartoni() {
        int counter = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (kartoni.get(i).getTipKartona().equals("crveni")) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Igrac ima " + zutiKartoni() + " zutih kartona i " + crveniKartoni() + " crvenih kartona.");
    }
}
