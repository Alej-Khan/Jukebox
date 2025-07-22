package jukebox.controller;

import jukebox.model.Rap;
import jukebox.model.Song;

public class JukeboxApp {
    public static void main(String[] args) {

        Song songOne = new Rap("Lose Yourself", "Eminem", 321);
        songOne.play();
    }
}
