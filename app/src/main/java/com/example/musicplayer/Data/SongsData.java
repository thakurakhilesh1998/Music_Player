package com.example.musicplayer.Data;

import com.example.musicplayer.Modal.SongListModal;

import java.util.ArrayList;

public class SongsData {

    public ArrayList<SongListModal> getData() {
        ArrayList<SongListModal> dummyData = new ArrayList<>();
        dummyData.add(new SongListModal("Shallow", "Baba Ji", "A Star is Born"));
        dummyData.add(new SongListModal("Tennessee Whiskey", "Baba Ji", "Chris Stapleton"));
        dummyData.add(new SongListModal("Sweet Caroline", "Baba Ji", " Neil Diamond\n"));
        dummyData.add(new SongListModal("Take Me Home, Country Roads", "Baba Ji", "John Denver"));
        dummyData.add(new SongListModal("Can't Help Falling In Love", "Baba Ji", " Elvis Presley"));
        dummyData.add(new SongListModal("Dance Monkey", "Baba Ji", " Tones and I"));
        dummyData.add(new SongListModal("Bohemian Rhapsody", "Baba Ji", "Queen"));
        dummyData.add(new SongListModal("Folsom Prison Blues", "Baba Ji", "Johnny Cash"));
        dummyData.add(new SongListModal("Don't Stop Believing ", "Baba Ji", "Image url"));
        dummyData.add(new SongListModal("Jai bholenath", "Baba Ji", "Baba Ji"));
        dummyData.add(new SongListModal("Girl Crush", "Baba Ji", "Little Big Town"));
        dummyData.add(new SongListModal("Someone You Loved", "Baba Ji", " Lewis Capaldi"));
        return dummyData;
    }
}
