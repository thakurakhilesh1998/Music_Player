package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class playmusic extends AppCompatActivity {
    TextView tvSongName;
    TextView tvArtistName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playmusic);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String artist = intent.getStringExtra("artist");
        tvSongName = findViewById(R.id.tvSongName);
        tvSongName.setText(title);
        tvArtistName = findViewById(R.id.tvArtistName);
        tvArtistName.setText(artist);

    }
}
