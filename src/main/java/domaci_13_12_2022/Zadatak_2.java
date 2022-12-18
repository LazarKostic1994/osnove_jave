package domaci_13_12_2022;

public class Zadatak_2 {
    public static void main(String[] args) {
//Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
// Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina
// do kada vazi kartica, kao i ime i prezime vlasnika kartice. Kartica se stampa sa
// zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
//Napomena: svaka informacija mora da bude u okviru posebne promenljive.

        String tipKartice = "Credit Card";
        String brojKartice = "1234 1232 4321 1212";
        String validnost = "valid";
        int mesec = 10;
        int godina = 25;
        String imeIPrezime = "Milan Jovanovic";

        System.out.println("*************************************");
        System.out.println("*  "+     tipKartice+"                      *");
        System.out.println("*     "+"****"+"                          *");
        System.out.println("*     "+"****"+"                          *");
        System.out.println("*         "+brojKartice+"       *");
        System.out.println("*                  "+       validnost+ " > " + mesec + "/" + godina+"    *");
        System.out.println("*                                   *");
        System.out.println("*     "+imeIPrezime+"               *");
        System.out.println("*************************************");


    }
}
