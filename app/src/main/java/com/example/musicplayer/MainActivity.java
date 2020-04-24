package com.example.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musicplayer.Data.SongsData;

public class MainActivity extends AppCompatActivity {
    ListView songsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songsList = findViewById(R.id.lvSongs);
        SongsData songsData = new SongsData();
        SongsListAdapter adapter = new SongsListAdapter(this, songsData.getData());
        songsList.setAdapter(adapter);
    }
}
