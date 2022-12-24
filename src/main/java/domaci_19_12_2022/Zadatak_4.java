package domaci_19_12_2022;

import java.util.Scanner;

public class Zadatak_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int brojac1 = 0;
        int brojac2 = 0;
        int brojac3 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Reaguj: ");
            String react = s.next();

            if (react.contains("like")){
                brojac1 = brojac1 + 1;
            }
            if (react.contains("smile")) {
                brojac2 = brojac2 + 1;
            }
            if (react.contains("heart")) {
                brojac3 = brojac3 + 1;
            }
        }
        System.out.println("Summary: like " + brojac1+ " | " + "smile " + brojac2 + " | " + "heart " + brojac3 );
    }
}
