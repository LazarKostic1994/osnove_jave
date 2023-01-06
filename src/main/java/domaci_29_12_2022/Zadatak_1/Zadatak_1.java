package domaci_29_12_2022.Zadatak_1;

public class Zadatak_1 {
//    Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
// va funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena
// proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust
// u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
// Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

    public static void main(String[] args) {

        Proizvod ogledalo = new Proizvod();
        ogledalo.naziv = "Ogledalo";
        ogledalo.cena = 10000;
        ogledalo.tezina = 505;

        ogledalo.stampaj();

        ogledalo.povecajCenu(150.3);
        System.out.println("Cena sa povecanjem je: " + ogledalo.cena + "RSD");
        double popustProizvoda = 0;
        popustProizvoda = ogledalo.vratiCenuSaPopustom(10);
        System.out.println("Cena sa popustom je: " + popustProizvoda + "RSD");
        double cenaPostarine = 0;
        cenaPostarine = ogledalo.racunajPostarinu();
        System.out.println("Cena postarine je: " + cenaPostarine + "RSD");

        System.out.println();

        Proizvod parfem = new Proizvod();
        parfem.naziv = "Parfem";
        parfem.cena = 8000;
        parfem.tezina = 250;

        parfem.stampaj();

        parfem.povecajCenu(500.5);
        System.out.println("Cena sa povecanjem je: " + parfem.cena + "RSD");

        popustProizvoda = parfem.vratiCenuSaPopustom(20);
        System.out.println("Cena sa popustom je: " + popustProizvoda + "RSD");

        cenaPostarine = parfem.racunajPostarinu();
        System.out.println("Cena postarine je: " + cenaPostarine + "RSD");
    }
}
