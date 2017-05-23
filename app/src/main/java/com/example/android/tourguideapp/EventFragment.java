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
public class EventFragment extends Fragment {


    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Muuseumiöö", "20.05"));
        attractions.add(new Attraction("Haapsalu Kuursaali hooaja avapidu", "20.05"));
        attractions.add(new Attraction("Graafilise disaini festival", "27.05 - 25.06"));
        attractions.add(new Attraction("Muinasjutukonverents", "1.06"));
        attractions.add(new Attraction("Itaalia veinipäevad", "2.06 - 3.06"));
        attractions.add(new Attraction("Al Bano Carrisi kontsert", "3.06"));
        attractions.add(new Attraction("Eesti lipu päev", "4.06"));
        attractions.add(new Attraction("Nargenfestival Kreegi päevad", "10.06 - 11.06"));
        attractions.add(new Attraction("Öökontsert Vaiko Eplik ja ELIIT", "15.06"));
        attractions.add(new Attraction("Haapsalu Jaanituli", "23.06 - 24.06"));
        attractions.add(new Attraction("Tšaikovski Haapsalu", "28.06 - 1.07"));
        attractions.add(new Attraction("Haapsalu vanamuusika festival", "5.07 - 9.07"));
        attractions.add(new Attraction("Suvelavastus \"Saabastega kass\"", "5.07 - 23-07"));
        attractions.add(new Attraction("Muhu Väina Regatt", "7.07"));
        attractions.add(new Attraction("American Beauty Car Show", "14.07 - 16.07"));
        attractions.add(new Attraction("Joogafestival", "21.07 - 23.07"));
        attractions.add(new Attraction("Rock in Haapsalu", "28.07 - 29.07"));
        attractions.add(new Attraction("Augustibluus", "4.08 - 6.08"));
        attractions.add(new Attraction("Valge Daami Aeg", "11.08 - 13.08"));
        attractions.add(new Attraction("Akordioni ja lõõtspillifestival \"Rannalõõts\"", "12.08"));
        attractions.add(new Attraction("Haapsalu pitsipäev", "13.08"));
        attractions.add(new Attraction("Maitsete promenaad", "19.08"));
        attractions.add(new Attraction("Belinda Carlisle and Shanon", "19.08"));
        attractions.add(new Attraction("Nostalgiapäevad", "8.09 - 10.09"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
