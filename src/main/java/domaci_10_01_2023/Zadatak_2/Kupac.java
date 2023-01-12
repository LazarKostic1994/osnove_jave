package domaci_10_01_2023.Zadatak_2;

public class Kupac {
    private String imeIPrezime;

    private ClanskaKarta brojKartice;

    private ClanskaKarta popusti;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }


    public Kupac(String imeIPrezime, ClanskaKarta brojKartice, ClanskaKarta popusti) {
        this.imeIPrezime = imeIPrezime;
        this.brojKartice = brojKartice;
        this.popusti = popusti;

    }

    public void stampaj (){
        System.out.println("Ime i prezime kupca je: " + this.imeIPrezime + " - " + "Broj kartice: " + this.brojKartice);
    }
}
