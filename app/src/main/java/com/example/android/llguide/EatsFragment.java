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
public class EatsFragment extends Fragment {


    public EatsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ListView listView = rootView.findViewById(R.id.list);
        ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(R.drawable.butterybiscuit, R.string.the_buttery_biscuit,  R.string.buttery_description));
        sites.add(new Site(R.drawable.donpatron, R.string.don_patron,  R.string.don_patron_description));
        sites.add(new Site( R.drawable.brickyard, R.string.brickyard, R.string.brickyard_description));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites);


        listView.setAdapter(adapter);

        return rootView;
    }

}

