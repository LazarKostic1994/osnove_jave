package domaci_29_12_2022.Zadatak_1;

public class Proizvod {
        public String naziv;
        public double cena;
        public double tezina;

        public void stampaj() {
            System.out.println("Proizvod je " + "''" +this.naziv + "''" +", cija je cena " + this.cena + "RSD" +
                    " i tezina " + this.tezina + "g");
        }
        public void povecajCenu (double povecanje) {
            cena = cena + povecanje;
        }
        public double vratiCenuSaPopustom (double popust){
            return cena - (cena * popust)/100;
        }
        public double racunajPostarinu (){
            double postarina = 0;
            if (tezina <= 100){
                postarina = 200;
                return  postarina;
            } else if (tezina > 100 && tezina <= 500){
                postarina = 400;
                return postarina;
            }else {
                postarina = 1000;
                return postarina;
            }
        }
}
