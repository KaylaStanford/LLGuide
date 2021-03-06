package com.example.android.llguide;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SiteAdapter extends ArrayAdapter<Site> {

    public  SiteAdapter(Context context, ArrayList<Site> sites){
        super(context,0, sites);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.site_list, parent,false);
        }

        Site currentSite = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.siteImage);
        imageView.setImageResource(currentSite.getSiteImage());

        TextView titleTextView = listItemView.findViewById(R.id.titleTextView);
        titleTextView.setText(currentSite.getTitleId());

        TextView descriptionTextView = listItemView.findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(currentSite.getDescriptionId());


        return listItemView;

    }


}
