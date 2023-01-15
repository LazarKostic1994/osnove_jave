package domaci_12_01_2023.Zadatak_2;
//Kreirati klasu Racun koja ima:
//broj racuna (npr: 170-289328923-23)
//ime i prezime osobe
//trenutno stanje na racunu (npr: 100, 1220)
//gettere i setter za sve atribute, sem settera za stanje na racunu
//metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//metodu koja stampa podatke o racunu u formatu:
//Ime i prezime  -  broj racuna
//stanje na racunu je (trenutno stanje) rsd.

public class Racun {
    private String broj;
    private String ime;
    private String prezime;
    private int stanje;

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getStanje() {
        return stanje;
    }

    public Racun(String broj, String ime, String prezime, int stanje) {
        this.broj = broj;
        this.ime = ime;
        this.prezime = prezime;
        this.stanje = stanje;
    }
    public boolean promenaStanjaNaRacunu(int prosledjenaVrednost){
        if (this.stanje + prosledjenaVrednost < 0){
            System.out.println("Nemate dovoljno sredstava na racunu.");
            return false;
        } else {
            this.stanje = this.stanje + prosledjenaVrednost;
            return true;
        }
    }
    public void stampaj (){
        System.out.println(this.ime + " " + this.prezime + " - " + this.broj);
        System.out.println("Stanje na racunu je: " + this.stanje + "rsd.");
        System.out.println();
    }

}
