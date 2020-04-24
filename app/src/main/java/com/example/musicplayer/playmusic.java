package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.musicplayer.Data.SongsData;
import com.example.musicplayer.Modal.SongListModal;

public class playmusic extends AppCompatActivity {
    TextView tvSongName;
    TextView tvArtistName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playmusic);
        Intent intent = getIntent();
        int index=intent.getIntExtra("position",0);
        tvSongName=findViewById(R.id.tvSongName);
        tvSongName.setText(new SongsData().getData().get(index).getsongsTitle());
        tvArtistName=findViewById(R.id.tvArtistName);
        tvArtistName.setText(new SongsData().getData().get(index).getArtist());

    }
}
