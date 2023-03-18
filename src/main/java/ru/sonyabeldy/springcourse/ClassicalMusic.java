package ru.sonyabeldy.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    List<String> songs;
    public ClassicalMusic() {
        songs = new ArrayList<>();
        addSongs();
    }

    private void addSongs() {
        songs.add("Hungarian Rhapsody");
        songs.add("Flight of the Bumblebee");
        songs.add("The Lark");
    }

    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(0, songs.size()));
    }
}
