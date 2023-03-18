package ru.sonyabeldy.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class RockMusic implements Music {

    List<String> songs;

    public RockMusic() {
        songs = new ArrayList<>();
        addSongs();
    }

    private void addSongs() {
        songs.add("Back Tn Black");
        songs.add("Voices In My Head");
        songs.add("Rock Believer");
    }
    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}
