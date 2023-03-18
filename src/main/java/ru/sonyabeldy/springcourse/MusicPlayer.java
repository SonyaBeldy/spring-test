package ru.sonyabeldy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();
        int musicGenreInd = random.nextInt(musicList.size());
        return String.format("Playing: (%s) %s", musicList.get(musicGenreInd).getClass().getSimpleName(), musicList.get(musicGenreInd).getSong());
//        return "Playing: (" + musicList.get(musicGenreInd).getClass().getSimpleName() + ") " + musicList.get(musicGenreInd).getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
