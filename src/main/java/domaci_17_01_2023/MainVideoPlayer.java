package domaci_17_01_2023;

import java.sql.Time;

public class MainVideoPlayer {
//U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
    public static void main(String[] args) {

        VideoPlayer dvd = new VideoPlayer(100, 70, 99, 1080);

        TimeControl time = new TimeControl(true);
        AudioControl volume = new AudioControl(true);
        QualityOptimizerControl qc = new QualityOptimizerControl(50);

        dvd.stampaj();

        time.izvrsiAkciju(dvd);
        time.izvrsiAkciju(dvd);

        qc.izvrsiAkciju(dvd);

        volume.izvrsiAkciju(dvd);
        volume.izvrsiAkciju(dvd);

        dvd.stampaj();

    }
}
