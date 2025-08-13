package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private SongList songs;
    private String name;
    private String artist;

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList(ArrayList<Song> songs) {
            this.songs = songs;
        }

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if(findSong(song.getTitle()) == null) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
               if(song.getTitle().equals(title)) {
               return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if ((songs.size() >= trackNumber) && (trackNumber > 0)) {
                return songs.get(trackNumber - 1);
            }
            return null;
        }
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song song = songs.findSong(trackNumber);
        if(song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = songs.findSong(title);
        if(song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
}
