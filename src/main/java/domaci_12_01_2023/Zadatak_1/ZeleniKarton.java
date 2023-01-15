package domaci_12_01_2023.Zadatak_1;

public class ZeleniKarton {

//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//(naziv predmeta) - (ocena)
//Student: ime i prezime, broj indeksa
//Profesor: ime i prezime

    private String imeIPrezime;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena;

    public ZeleniKarton(String imeIPrezime, String brojIndeksa, String nazivPredmeta,String imeIPrezimeProfesora, int ocena) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public boolean daLiJeIspitPolozen () {
        if (ocena > 5) {
            System.out.println("Ispit je polozen");
            return true;
        } else {
            System.out.println("Ispit nije polozen.");
            return false;
        }
    }
    public void stampa (){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.imeIPrezime + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.imeIPrezimeProfesora);
    }
}
