package domaci_12_01_2023.Zadatak_1;

import java.util.ArrayList;

public class Zadatak_1 {
// Kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite.
// Pronaci i ispisati prosecnu ocenu za sve ispite.
// Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita.

    public static void main(String[] args) {
        ArrayList<ZeleniKarton> nizZelenihKartona = new ArrayList<ZeleniKarton>();

        ZeleniKarton student1 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "Mehanika 1", "Radovan Slavkovic", 10);

        nizZelenihKartona.add(student1);

        ZeleniKarton student2 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "Mehanika 2", "Ljiljana Bogdanovic", 9);

        nizZelenihKartona.add(student2);

        ZeleniKarton student3 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "Mehanika 3", "Ljiljana Bogdanovic", 7);

        nizZelenihKartona.add(student3);

        ZeleniKarton student4 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "Masinski materijali", "Dragan Adamovic", 8);

        nizZelenihKartona.add(student4);

        ZeleniKarton student5 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "Engleski jezik", "Sandra Stefanovic", 7);

        nizZelenihKartona.add(student5);

        ZeleniKarton student6 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "CAD/CAM", "Predrag Marjanovic", 4);

        nizZelenihKartona.add(student6);

        ZeleniKarton student7 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "Transportni sistemi", "Rodoljub Vujanac", 7);

        nizZelenihKartona.add(student7);

        ZeleniKarton student8 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "Mehanicki prenosnici", "Blaza Stojanovic", 5);

        nizZelenihKartona.add(student8);

        ZeleniKarton student9 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "Tribologija", "Blaza Stojanovic", 10);

        nizZelenihKartona.add(student9);

        ZeleniKarton student10 = new ZeleniKarton("Lazar Kostic", "161/2013",
                "Industrijski menadzment", "Dejan Tadic", 10);

        nizZelenihKartona.add(student10);

        double prosecnaOcena = 0;
        double suma = 0;
        double prosecnaOcenaPolozenih = 0;
        double sumaPolozenihispita = 0;
        int brojac = 0;


        for (int i = 0; i < nizZelenihKartona.size(); i++) {

            ZeleniKarton sviIspiti = nizZelenihKartona.get(i);

            sviIspiti.stampa();

            suma = suma + nizZelenihKartona.get(i).getOcena();

            if (nizZelenihKartona.get(i).getOcena() > 5 ){

                sumaPolozenihispita = sumaPolozenihispita + nizZelenihKartona.get(i).getOcena();
                brojac ++;
            }
        }

        prosecnaOcena = suma / nizZelenihKartona.size();
        System.out.println("Prosecna ocena svih ispita je " + prosecnaOcena + ".");

        prosecnaOcenaPolozenih = sumaPolozenihispita / brojac;
        System.out.println("Prosecna ocena polozenih ispita je " + prosecnaOcenaPolozenih + ".");
    }
}
