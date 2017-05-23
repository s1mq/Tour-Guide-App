package com.example.android.tourguideapp;


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
public class AccomodationFragment extends Fragment {


    public AccomodationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Fra Mare Thalasso SPA","Ranna tee 2, Haapsalu | (+372) 472 4600", R.drawable.framare ));
        attractions.add(new Attraction("Sunset Dream Apartment","Suur-Liiva tänav 15, Haapsalu | (+372) 604 2204", R.drawable.sunset ));
        attractions.add(new Attraction("Baltic Hotel Promenaadi","Sadama tänav 22, Haapsalu | (+372) 473 7250", R.drawable.promenaadi_hotell ));
        attractions.add(new Attraction("Marienholm Villa","Väike-Viigi tänav 10, Haapsalu | (+372) 563 91671", R.drawable.villa_marienholm ));
        attractions.add(new Attraction("Hotel Päeva Villa","Lai tänav 7, Haapsalu | (+372) 534 88222", R.drawable.hotell_p2eva_villa ));
        attractions.add(new Attraction("Reta's House Accommodation","Posti tänav 25, Haapsalu | (+372) 566 87802", R.drawable.reta_majutus ));
        attractions.add(new Attraction("Supeluse Guesthouse", "Supeluse tänav 4, Haapsalu | (+372) 564 66880", R.drawable.supeluse_guesthouse ));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
