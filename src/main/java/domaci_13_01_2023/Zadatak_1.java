package domaci_13_01_2023;

public class Zadatak_1 {
    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("Mehanika 2", 8,"Radovan Slavkovic");
        Ispit ispit2 = new Ispit("Masinski materijali", 9,"Dragan Adamovic");
        Ispit ispit3 = new Ispit("Tribologija", 10,"Blaza Stojanovic");
        Ispit ispit4 = new Ispit("Tehnicko crtaze", 6,"Lozica Ivanovic");


        Student student1 = new Student("161/2013", "Lazar Kostic",
                "Master akademske studije");

        student1.dodajIspit(ispit1);
        student1.dodajIspit(ispit2);
        student1.dodajIspit(ispit3);
        student1.dodajIspit(ispit4);
        student1.stampa();
    }
}
