package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.songs = new ArrayList<Song>();
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            Song song = new Song(title, duration);
            songs.add(song);
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if(song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if ((songs.size() >= trackNumber) && (trackNumber > 0)) {
            playlist.add(findSong(songs.get(trackNumber - 1).getTitle()));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        if (findSong(title) == null) {
            return false;
        } else {
            playlist.add(findSong(title));
            return true;
        }
    }
}
