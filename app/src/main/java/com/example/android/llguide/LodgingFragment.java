package com.example.android.llguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LodgingFragment extends Fragment {


    public LodgingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_item, container, false);
        ListView listView = rootView.findViewById(R.id.list);

        ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(R.string.red_roof_inn, R.drawable.red, R.string.red_roof_description));
        sites.add(new Site(R.string.genetti, R.drawable.genetti, R.string.genetti_description));
        sites.add(new Site(R.string.city_hall_grand_hotel, R.drawable.city, R.string.city_hall_description));
        sites.add(new Site(R.string.hampton_inn, R.drawable.hampton, R.string.hampton_description));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites);


        listView.setAdapter(adapter);


        return rootView;
    }

}

