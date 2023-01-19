package domaci_17_01_2023;

import domaci_17_01_2023.Control;
import domaci_17_01_2023.VideoPlayer;

public class AudioControl extends Control {
//Kreirati klasu AudioControl koja nasledjuje klasu Control i
//gettere, settere i konstruktore
//ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
    private boolean promenaJacineZvuka;

    public AudioControl(boolean promenaJacineZvuka) {
        this.promenaJacineZvuka = promenaJacineZvuka;
    }

    public boolean isPromenaJacineZvuka() {
        return promenaJacineZvuka;
    }

    public void setPromenaJacineZvuka(boolean promenaJacineZvuka) {
        this.promenaJacineZvuka = promenaJacineZvuka;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double x = 0;
        if (this.promenaJacineZvuka && videoPlayer.getJacinaZvuka() + 1 <= 100) {
            x = videoPlayer.getJacinaZvuka() + 1;
            videoPlayer.setJacinaZvuka(x);
        } else if (videoPlayer.getJacinaZvuka() + 1 > 100) {
            videoPlayer.setJacinaZvuka(100);
        } else if (!this.promenaJacineZvuka && videoPlayer.getJacinaZvuka() - 1 > 0) {
            x = videoPlayer.getJacinaZvuka() - 1;
            videoPlayer.setJacinaZvuka(x);
        } else if (videoPlayer.getJacinaZvuka() - 1 <= 0) {
            videoPlayer.setJacinaZvuka(0);
        }
    }
}
