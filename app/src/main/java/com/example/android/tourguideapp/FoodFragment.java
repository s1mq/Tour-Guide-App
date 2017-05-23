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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Fra Mare restoran \"Bergfeldt\"","Ranna tee 2, Haapsalu 90403 | (+372) 472 4605", R.drawable.bergfeldt ));
        attractions.add(new Attraction("Kohvik Hapsal Dietrich","Karja tänav 10, Haapsalu 90503 | (+372) 509 4549", R.drawable.dietrich ));
        attractions.add(new Attraction("Kärme Küülik","Karja tänav 5, Haapsalu 90502 | (+372) 510 5396", R.drawable.k__lik ));
        attractions.add(new Attraction("Kreeka restoran Margot Food & Style","Posti tänav 37, Haapsalu 90502 | (+372) 473 5003", R.drawable.margot ));
        attractions.add(new Attraction("Müüriääre Pagar","Karja tänav 7, Haapsalu 90502 | (+372) 506 0924", R.drawable.m__ri__re ));
        attractions.add(new Attraction("Pizza Grande","Karja tn 6, Haapsalu 90503 | (+372) 473 7200", R.drawable.pizza_grande ));
        attractions.add(new Attraction("Taksi Pubi","Posti tänav 29, Haapsalu 90502 | (+372) 504 7428", R.drawable.taksi_pubi ));
        attractions.add(new Attraction("Talumehe kõrts","Karja tn 2, Haapsalu 90503 | (+372) 530 62755", R.drawable.talumehe ));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
