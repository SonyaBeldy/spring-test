package ru.sonyabeldy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
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

}
