package jukebox.model;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private List<Song> allSongs = new ArrayList<>();

    public PlayList(List<Song> allSongs) {
        this.allSongs = allSongs;
    }

    public List<Song> getAllSongs() {
        return allSongs;
    }
}
