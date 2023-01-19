package domaci_17_01_2023;

public class VideoPlayer {
//Kreirati klasu VideoPlayer koja ima:
//duzinu videa
//trenutno vreme videa
//jacinu zvuka
//Kvalitet videa (144, 240, 360, 480, 720, 1080)
//gettere, settere i konstruktore
//metodu stampaj koja stampa podatke u formatu:
//trenutno vreme videa
//jacina zvuka
//kavlitet videa
    private double duzinaVidea;
    private double trenutnoVremeVidea;
    private double jacinaZvuka;
    private double kvalitetVidea;

    public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea, double jacinaZvuka, double kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public double getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public double getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(double jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public double getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(double kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public void stampaj (){
        System.out.println("Trenutno vreme videa je: " + this.trenutnoVremeVidea);
        System.out.println("Jacina zvuka je: " + this.jacinaZvuka);
        System.out.println("Kvalitet videa je: " + this.kvalitetVidea);
        System.out.println();
    }
}
