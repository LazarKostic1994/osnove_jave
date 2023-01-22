package domaci_19_01_2023;

public class Tetrapak extends Ambalaza {
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
    private boolean mogucnostReciklaze;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean mogucnostReciklaze, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.mogucnostReciklaze = mogucnostReciklaze;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isMogucnostReciklaze() {
        return mogucnostReciklaze;
    }

    public void setMogucnostReciklaze(boolean mogucnostReciklaze) {
        this.mogucnostReciklaze = mogucnostReciklaze;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.mogucnostReciklaze){
           return this.brutoTezina * 1.5 * this.osnovnaCena;
        } else if (!this.mogucnostReciklaze){
            return this.osnovnaCena;
        }
        return 0;
    }

    @Override
    public void stampaj() {
        System.out.println("Naziv proizvoda: " + this.nazivArtikla);
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Neto tezina: " + this.netoTezina);
        System.out.println("Bruto tezina: " + this.brutoTezina);

        if (this.mogucnostReciklaze){
            System.out.println("Recikliran: da");
        }else {
        System.out.println("Recikliran: ne");
        }
        System.out.println("Cena artikla: " + cenaArtikla());
        System.out.println();

    }
}
