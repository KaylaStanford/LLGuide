package com.example.android.llguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_item, container, false);
        ListView listView = rootView.findViewById(R.id.list);
        ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(R.drawable.cac ,R.string.community_arts_center,  R.string.community_arts_description));
        sites.add(new Site(R.drawable.hiawatha, R.string.hiawatha,  R.string.hiawatha_description));
        sites.add(new Site(R.drawable.littleleaguemuseum, R.string.llws_museum,  R.string.llws_museum_description));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites);

        listView.setAdapter(adapter);

        return rootView;
    }

}