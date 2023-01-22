package domaci_19_01_2023;

public class StaklenaAmbalaza  extends Ambalaza{
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.
    private double kaucija;
    private boolean vracaKauciju;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija, boolean vracaKauciju, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.vracaKauciju = vracaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isVracaKauciju() {
        return vracaKauciju;
    }

    public void setVracaKauciju(boolean vracaKauciju) {
        this.vracaKauciju = vracaKauciju;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.vracaKauciju){
        return this.osnovnaCena * 1.2 * this.kaucija;
    } else if (!this.vracaKauciju) {
            return this.osnovnaCena * 1.2;
        }
        return 0;
    }

        @Override
    public void stampaj() {
            System.out.println("Naziv proizvoda: " + this.nazivArtikla);
            System.out.println("Barkod: " + this.barkod);
            System.out.println("Neto tezina: " + this.netoTezina);
            System.out.println("Bruto tezina: " + this.brutoTezina);

            if (this.vracaKauciju){
                System.out.println("Recikliran: da");
            }else {
                System.out.println("Recikliran: ne");
            }
            System.out.println("Cena artikla: " + cenaArtikla());
            System.out.println();
    }
}
