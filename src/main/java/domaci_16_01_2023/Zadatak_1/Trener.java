package domaci_16_01_2023.Zadatak_1;

public class Trener extends Osoba {
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
    private int godineIskustva;
    private String tipTrenera;

    public Trener (){
        super();
    }

    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj(){
        System.out.println("Trener: ");
        super.stampaj();
        System.out.println("Godina iskutva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tipTrenera);
        System.out.println();
    }
}
