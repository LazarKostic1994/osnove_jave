package domaci_29_12_2022.Zadatak_2;

public class Zadatak_2 {
//    Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na
// tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//gettere za sve atribute
//settere za sve atribute osim broja lajkova i broja deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

    public static void main(String[] args) {

        FacebookPost opomena = new FacebookPost();
        opomena.setImeIPrezime("Lazar Kostic");
        opomena.setImePostProfila("Petar Petrovic");
        opomena.setText("Necete shvatiti");
        opomena.like();
        opomena.like();
        opomena.like();
        opomena.like();
        opomena.dislike();
        opomena.share();
        opomena.print();

        System.out.println();

        FacebookPost obavestenje = new FacebookPost();
        obavestenje.setImeIPrezime("Dragan Jovanovic");
        obavestenje.setImePostProfila("Nikola Nikolic");
        obavestenje.setText("Rakija connecting people.");
        obavestenje.like();
        obavestenje.like();
        obavestenje.like();
        obavestenje.like();
        obavestenje.like();
        obavestenje.dislike();
        obavestenje.share();
        obavestenje.share();
        obavestenje.print();
    }
}
