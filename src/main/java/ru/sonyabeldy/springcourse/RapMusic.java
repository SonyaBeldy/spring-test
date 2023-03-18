package ru.sonyabeldy.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class RapMusic implements Music {

    List<String> songs;

    public RapMusic() {
        songs = new ArrayList<>();
        addSongs();
    }

    private void addSongs() {
        songs.add("Ungrateful");
        songs.add("Tia Tamera");
        songs.add("Tyler Hero");
    }
    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}
