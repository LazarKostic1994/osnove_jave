package domaci_27_12_2022.Zadatak_2;

public class SmartAirConditioning {
    public String marka;
    public int tKlime;
    public String mod;
    public int tNapolju;


    public void stampaj (){
        System.out.println("Marka klime je " + marka + " koja sluzi da " + mod + " prostoriju");
    }
    public void temperatura (int tNapolju){
        if (tNapolju > tKlime){
            System.out.println("Spoljasnja temperatura je veca od postavljene temperature klime.");
        } else if (tNapolju < tKlime) {
            System.out.println("Spoljasnja temperatura je manja od postavljene temperature klime.");
        }else {
            System.out.println("Spoljasnja temperatura i temperatura klime je jednaka.");
        }
    }
}
