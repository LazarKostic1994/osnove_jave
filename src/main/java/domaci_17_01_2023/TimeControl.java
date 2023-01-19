package domaci_17_01_2023;

public class TimeControl extends Control {
//Kreirati klasu TimeControl koja nasledjuje klasu Control i:
//konstruktore
//ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa.
//Veoma je bitno da se ne izadje van granica videa.
    private boolean pomeranjeVremenaVidea;

    public TimeControl(boolean pomeranjeVremenaVidea) {
        this.pomeranjeVremenaVidea = pomeranjeVremenaVidea;
    }

    public boolean getPomeranjeVremenaVidea() {
        return pomeranjeVremenaVidea;
    }

    public void setPomeranjeVremenaVidea(boolean pomeranjeVremenaVidea) {
        this.pomeranjeVremenaVidea = pomeranjeVremenaVidea;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double time = 0;
        if (this.pomeranjeVremenaVidea || videoPlayer.getTrenutnoVremeVidea() + 15 < videoPlayer.getDuzinaVidea()){
            time = videoPlayer.getTrenutnoVremeVidea() + 15;
            videoPlayer.setTrenutnoVremeVidea(time);
        } else if (this.pomeranjeVremenaVidea || videoPlayer.getTrenutnoVremeVidea() + 15 > videoPlayer.getDuzinaVidea()) {
            videoPlayer.setTrenutnoVremeVidea(videoPlayer.getDuzinaVidea());
        } else if (!this.pomeranjeVremenaVidea || videoPlayer.getTrenutnoVremeVidea() - 15 > 0){
            time = videoPlayer.getTrenutnoVremeVidea() - 15;
            videoPlayer.setTrenutnoVremeVidea(time);
        } else if (!this.pomeranjeVremenaVidea || videoPlayer.getTrenutnoVremeVidea() - 15 < 0) {
            videoPlayer.setTrenutnoVremeVidea(0);
        }
    }
}
