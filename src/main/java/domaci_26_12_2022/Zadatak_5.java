package domaci_26_12_2022;

public class Zadatak_5 {
//    Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//Napomena: Metoda nista ne vraca.
    public static void main(String[] args) {
        int broj = 5;
        String znak = "/";

        stampaj(broj, znak);
}
    public static void stampaj (int n, String s){
        for (int i = 1; i <= n; i++) {
            System.out.print(s);
        }
    }
}
