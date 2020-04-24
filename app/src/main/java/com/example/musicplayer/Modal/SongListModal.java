package com.example.musicplayer.Modal;

public class SongListModal {

    String songsTitle;
    String imageUrl;
    String artist;

    public SongListModal(String songsTitle, String imageUrl, String artist) {
        this.songsTitle = songsTitle;
        this.imageUrl = imageUrl;
        this.artist = artist;
    }

    public String getsongsTitle() {
        return songsTitle;
    }

    public void setsongsTitle(String songsTitle) {
        this.songsTitle = songsTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}
