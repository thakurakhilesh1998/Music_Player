package com.example.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.musicplayer.Modal.SongListModal;

import java.util.ArrayList;

public class SongsListAdapter extends ArrayAdapter<SongListModal> {
    ArrayList<SongListModal> songList;
    Context context;


    public SongsListAdapter(@NonNull Context context, @NonNull ArrayList<SongListModal> songList) {
        super(context, 0, songList);
        this.context = context;
        this.songList = songList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListView = convertView;
        ListView = LayoutInflater.from(context).inflate(R.layout.songlistitem, parent, false);
        ImageButton btn = ListView.findViewById(R.id.btn);
        TextView title = ListView.findViewById(R.id.tvTitle);
        TextView singer = ListView.findViewById(R.id.tvSinger);
        LinearLayout llsongs;
        llsongs = ListView.findViewById(R.id.llsongs);
        title.setText(songList.get(position).getsongsTitle());
        singer.setText(songList.get(position).getArtist());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("postion", String.valueOf(position));
                Intent i = new Intent(context, playmusic.class);
                i.putExtra("title", songList.get(position).getsongsTitle());
                i.putExtra("artist", songList.get(position).getArtist());
                context.startActivity(i);
            }
        });

        return ListView;
    }
}
