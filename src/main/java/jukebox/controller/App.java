package jukebox.controller;

import jukebox.model.Genre;
import jukebox.model.PlayList;
import jukebox.model.Song;
import java.util.ArrayList;

import javax.swing.*;
import java.util.List;

public class App {
    public static void main(String[] args) {


        List<Song> songList = List.of(new Song("Time", "Pink Floyd", 450, Genre.ROCK),
                new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK),
                new Song("Billie Jean", "Michael Jackson", 294, Genre.POP),
                new Song("Smells Like Teen Spirit", "Nirvana", 301, Genre.ROCK),
                new Song("Imagine", "John Lennon", 183, Genre.POP),
                new Song("Lose Yourself", "Eminem", 326, Genre.HIPHOP),
                new Song("Clocks", "Coldplay", 307, Genre.ALTERNATIVE),
                new Song("One More Time", "Daft Punk", 320, Genre.ELECTRONIC));

        List<Song> rock = new ArrayList<>();

        for (Song s: songList) {
            if (s.getGenre() == Genre.ROCK){
                rock.add(s);
            }
        }

        PlayList rockList = new PlayList("rock", rock);

        Song cancionUno = new Song("One", "Metallica", 600, Genre.ROCK);

        rockList.addSong(cancionUno);
        System.out.println(rockList);

        rockList.deleteSong(cancionUno);
        System.out.println(rockList);
    }

}
