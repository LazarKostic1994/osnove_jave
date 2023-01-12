package domaci_10_01_2023.Zadatak_1;

public class Knjiga {
    private int isbn;
    private String naziv;
    private int godina;
    private Autor autor;

    public Knjiga(int isbn, String naziv, int godina, Autor autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godina = godina;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void stampaj (){
        System.out.println("Knjizni broj: " + this.isbn);
        System.out.println("Naziv knjige je :" + this.naziv + " - " + "godina izdanja je: " + godina);
        System.out.println("Ime i prezime autora je: " + autor.getIme() + " " + autor.getPrezime());
        System.out.println();
    }
}
