package domaci_16_01_2023.Zadatak_1;

public class Igrac extends Osoba {
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
    private int brojIgraca;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {
       super();
    }

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
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

    @Override
    public void stampaj (){
        System.out.println("Igrac: ");
        super.stampaj();
        System.out.println("Broj igraca je: " + this.brojIgraca);
        System.out.println("Igrac igra na poziciji: " + this.pozicija);
        System.out.print("Da li je igrac kapiten: ");
        if(this.kapiten){
            System.out.println("Da");
        } else {
            System.out.println("Ne");
        }
        System.out.println();

    }
}
