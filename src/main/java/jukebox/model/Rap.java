package jukebox.model;

public class Rap extends Song{

    public Rap(String name, String autor, int durationSeconds) {
        super(name, autor, durationSeconds, Genre.RAP);
    }
}
