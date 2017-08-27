package com.example.fatimajannat.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.fatimajannat.musicapp.Model.Track;

import java.util.List;

/**
 * Created by ASUS on 2017-08-27.
 */

public class TrackListAdapter  extends ArrayAdapter<Track> {
    private Activity context;
    List<Track>trackList;


    public TrackListAdapter(Activity context, List<Track> trackList) {
        super(context, R.layout.item_track_list,trackList);
        this.context = context;
        this.trackList = trackList;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.item_track_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewRating = (TextView) listViewItem.findViewById(R.id.textViewRating);

        Track track = trackList.get(position);
        textViewName.setText(track.getTrackName());
        textViewRating.setText(String.valueOf(track.getRating()));

        return listViewItem;

    }
}
