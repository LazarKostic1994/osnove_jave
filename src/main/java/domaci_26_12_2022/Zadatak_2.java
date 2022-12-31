package domaci_26_12_2022;

public class Zadatak_2 {
//Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost. Metoda od parametara prima ime i prezime (2 parametra) i
//vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.

public static void main(String[] args) {
    String spoj = imeIPrezime("Lazar", "Kostic");
    System.out.println("Ime i prezime: " +  spoj);
    }
    public static String imeIPrezime(String ime, String prezime) {
        String spoj = ime + " " + prezime;
        return spoj;
    }
}
