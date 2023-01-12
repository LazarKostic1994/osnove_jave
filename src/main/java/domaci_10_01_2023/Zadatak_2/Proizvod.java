package domaci_10_01_2023.Zadatak_2;

public class Proizvod {
    private String naziv;

    private double cenaIzrade;
    private Kupac ime;
    private ClanskaKarta clanskaKarta;


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Proizvod(String naziv, double cenaIzrade, Kupac ime, ClanskaKarta clanskaKarta) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
        this.ime = ime;
        this.clanskaKarta = clanskaKarta;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public double cenaProizvodaSaPopustom (){
        double cena = this.cenaIzrade * 1.9 * (100 - clanskaKarta.getPopust()) / 100;
        return cena;
    }
    public void stampaj (){
        System.out.println("Naziv proizvoda je: " + this.naziv + ", cija je cena: " + this.cenaIzrade +
                ". A cena izrade sa popustom iznosi: " + cenaProizvodaSaPopustom());
        System.out.println("Ime i prezime: " + ime.getImeIPrezime() + " - " + "Broj kartice: " + clanskaKarta.getBroj());
    }
}
