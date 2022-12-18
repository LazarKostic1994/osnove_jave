package domaci_13_12_2022;

public class Zadatak_4 {
    public static void main(String[] args) {
// Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//Primer izvrsenja programa:
//a: 10
//Povrsina je 43.25
//Obim je 30
        double a = 12.5;
        System.out.println("a: "+ a );

        double p = ((a * a) * 1.73) / 4;
        System.out.println("Povrsina je " + p);

        double o = 3 * a;
        System.out.println("Obim je " + o);
    }
}
