package domaci_27_12_2022.Zadatak_1;

public class Proizvod {
        public String nazivProizvoda;
        public double cenaProizvoda;
        public double tezinaProizvoda;
        public String jedinica;


        public void stampaj (){
        System.out.println("Naziv proizvoda: " + this.nazivProizvoda + ", " + "Cena proizvoda: " + this.cenaProizvoda + " " + "Tezina: " + this.tezinaProizvoda);
         }

        public double konvertuj(String jedinica) {
            if (jedinica.equals("kg")) {
                tezinaProizvoda = tezinaProizvoda / 1000;
                return tezinaProizvoda;
            } else if (jedinica.equals("t")) {
                tezinaProizvoda = tezinaProizvoda / 1000000;
                return tezinaProizvoda;
            }
            else {
                System.out.println("Nije uneta validna jedinica");
            }
            return 0;
        }

}

