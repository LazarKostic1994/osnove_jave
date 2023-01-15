package domaci_13_01_2023;

import java.util.ArrayList;

public class Student {
    private String brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> nizIspita = new ArrayList<Ispit>();

    public Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
    }
    public void dodajIspit(Ispit nazivPredmeta){
        nizIspita.add(nazivPredmeta);
    }
    public double prosekNaStudijama (){
        double prosecnaOcena = 0;
        int brojac = 0;
        for (int i = 0; i < nizIspita.size(); i++) {
            prosecnaOcena = (prosecnaOcena + nizIspita.get(i).getOcena());
            brojac ++;
        }
        return prosecnaOcena/brojac;
    }
    public void stampa(){
        System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < nizIspita.size(); i++) {
            System.out.println(this.nizIspita.get(i).getNazivPredmeta() + " - " +
                    this.nizIspita.get(i).getImeIPrezimeProfesora() + " - " + this.nizIspita.get(i).getOcena());

        }
        System.out.println("Prosecna ocena je " + prosekNaStudijama() + ".");
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getNizIspita() {
        return nizIspita;
    }
}