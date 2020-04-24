package com.example.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.musicplayer.Modal.SongListModal;

import java.util.ArrayList;

public class SongsListAdapter extends ArrayAdapter<SongListModal> implements View.OnClickListener {
    ArrayList<SongListModal>  songList;
    Context context;
    int pos=0;

    public SongsListAdapter(@NonNull Context context,@NonNull ArrayList<SongListModal> songList) {
        super(context, 0,songList);
        this.context=context;
        this.songList=songList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        pos=position;
        View ListView=convertView;
        ListView= LayoutInflater.from(context).inflate(R.layout.songlistitem,parent,false);
        ImageButton btn= ListView.findViewById(R.id.btn);
        TextView title=ListView.findViewById(R.id.tvTitle);
        TextView singer=ListView.findViewById(R.id.tvSinger);
        LinearLayout llsongs;
        llsongs=ListView.findViewById(R.id.llsongs);
        title.setText(songList.get(0).getsongsTitle());
        singer.setText(songList.get(0).getArtist());
        btn.setOnClickListener(this);
        llsongs.setOnClickListener(this);
        return ListView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn:
                Intent i=new Intent(context,playmusic.class);
                i.putExtra("position",pos);
                context.startActivity(i);
            Toast.makeText(context,"Your click a button",Toast.LENGTH_SHORT).show();
            break;
            case R.id.llsongs:
            Toast.makeText(context,"Main layout clicked",Toast.LENGTH_SHORT).show();
            break;
        }

    }
}
