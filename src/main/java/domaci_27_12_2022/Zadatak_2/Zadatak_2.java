package domaci_27_12_2022.Zadatak_2;

public class Zadatak_2 {
    public static void main(String[] args) {

        SmartAirConditioning samsung = new SmartAirConditioning();
        samsung.marka = "Samsung";
        samsung.tKlime = 22;
        samsung.mod = "greje";
        samsung.tNapolju = 22;


        samsung.temperatura(samsung.tNapolju);
        samsung.stampaj();
    }
}
