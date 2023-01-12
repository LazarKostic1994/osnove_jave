package domaci_10_01_2023.Zadatak_2;

public class ClanskaKarta {
    private double popust;
    private String broj;

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public ClanskaKarta(double popust, String broj) {
        this.popust = popust;
        this.broj = broj;
    }
}
