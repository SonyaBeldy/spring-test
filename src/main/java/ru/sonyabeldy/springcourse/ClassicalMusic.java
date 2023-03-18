package ru.sonyabeldy.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    List<String> songs;
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }
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
