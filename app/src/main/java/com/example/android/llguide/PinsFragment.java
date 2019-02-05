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
public class PinsFragment extends Fragment {


    public PinsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);
        ListView listView = rootView.findViewById(R.id.list);
        ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(R.string.genetti_pins, R.drawable.genettipin, R.string.genetti_pins_description));
        sites.add(new Site(R.string.bullfrog, R.drawable.bullfrogpin, R.string.bullfrog_description));
        sites.add(new Site(R.string.many_more, R.drawable.otherpin, R.string.many_more_description));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites);

        listView.setAdapter(adapter);

        return rootView;
    }

}
