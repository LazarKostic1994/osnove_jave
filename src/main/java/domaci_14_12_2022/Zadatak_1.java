package domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak_1 {
    public static void main(String[] args) {
//Napisati program koji ima informacije koje ucitava informacije sa tastature:
//Ime
//Prezime
//godinu rodjenja
//I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god

        Scanner s = new Scanner(System.in);
        System.out.print("Ime: ");
        String ime = s.next();
        System.out.print("Prezime: ");
        String prezime = s.next();
        System.out.print("Godina rodjenja: ");
        int starost = s.nextInt();

        System.out.println(ime + " " + prezime + " - " + starost + " god");


    }
}
