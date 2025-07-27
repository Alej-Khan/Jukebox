package jukebox.model;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private String playListName;
    List<Song> songs = new ArrayList<>();

    public PlayList(String playListName, List<Song> songs) {
        this.playListName = playListName;
        this.songs = songs;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void deleteSong(Song song) {
        songs.remove(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getPlayListName() {
        return playListName;
    }

    public String toString() {
        return songs.toString();
    }

}
