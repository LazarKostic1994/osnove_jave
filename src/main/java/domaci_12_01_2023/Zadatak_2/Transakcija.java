package domaci_12_01_2023.Zadatak_2;

public class Transakcija {
//    Kreirati klasu Transakcija koja ima:
//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
//gettere i settere
//konstruktore
//privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//ako je prenos sredstava manji od 4500, provizija je fiksna 45
//ako je prenos sredstava veci od 4500, provizija je 1%
//S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna

    private String id;
    private Racun racunSalje;
    private Racun racunPrima;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getRacunSalje() {
        return racunSalje;
    }

    public void setRacunSalje(Racun racunSalje) {
        this.racunSalje = racunSalje;
    }

    public Racun getRacunPrima() {
        return racunPrima;
    }

    public void setRacunPrima(Racun racunPrima) {
        this.racunPrima = racunPrima;
    }

    public Transakcija(String id, Racun racunSalje, Racun racunPrima) {
        this.id = id;
        this.racunSalje = racunSalje;
        this.racunPrima = racunPrima;
    }

    private int provizijaTransakcije (int vrednostTransakcije){
        if (vrednostTransakcije < 4500){
            return 45;
        } else {
            return vrednostTransakcije/100;
        }
    }
    public void prenosSredstava (int vrednostTransakcije){
        if (racunSalje.promenaStanjaNaRacunu(vrednostTransakcije * (-1))){
            this.racunPrima.promenaStanjaNaRacunu(vrednostTransakcije);
        }
    }
    public void stampaj (){
        System.out.println("Racun sa: " + this.racunSalje.getIme() + " " + this.racunSalje.getPrezime() + " - " + this.racunSalje.getBroj());
        System.out.println("Stanje na racunu je: " + this.racunSalje.getStanje());
        System.out.println("Racun na: " + this.racunPrima.getIme() + " " + this.racunPrima.getPrezime() + " - " + this.racunPrima.getBroj());
        System.out.println("Stanje na racunu je: " + this.racunPrima.getStanje());
    }
}
