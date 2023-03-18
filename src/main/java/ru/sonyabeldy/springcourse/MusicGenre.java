package ru.sonyabeldy.springcourse;

public enum MusicGenre {
    CLASSICAL("ROCK"),
    ROCK("CLASSICAL");

    private final String name;
    MusicGenre(String name) {
        this.name = name;
    }
}
