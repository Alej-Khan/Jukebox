package jukebox.model;

import java.util.ArrayList;
import java.util.List;

public class PlayHistory {

    List<Song> playedSongs = new ArrayList<>();

    public PlayHistory(List<Song> playedSongs) {
        this.playedSongs = playedSongs;
    }

    public List<Song> getPlayedSongs() {
        return playedSongs;
    }

    public void setPlayedSongs(List<Song> playedSongs) {
        this.playedSongs = playedSongs;
    }
}
