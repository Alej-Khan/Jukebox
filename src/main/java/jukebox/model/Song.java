package jukebox.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Song {

    private String name;
    private String autor;
    private int durationSeconds;
    private Genre genre;

    Song(String name, String autor, int durationSeconds, Genre genre) {
        this.name = name;
        this.autor = autor;
        this.durationSeconds = durationSeconds;
        this.genre = genre;
        System.out.println(String.format("Canción '%s' por '%s' agregada", name, autor));
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void play() {

        System.out.println("Reproduciendo: " + name);

    }

    public void addSong() {
        
    }

}

