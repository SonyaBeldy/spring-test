package ru.sonyabeldy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicGenre genre) {
        switch (genre) {
            case CLASSICAL -> { return classicalMusic.getSong(); }
            case ROCK -> { return rockMusic.getSong(); }
        }
        return "There no songs of this genre";
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
