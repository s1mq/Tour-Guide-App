package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Fra Mare restoran \"Bergfeldt\"","Ranna tee 2, Haapsalu 90403 | (+372) 472 4605", R.drawable.bergfeldt ));
        attractions.add(new Attraction("Kohvik Hapsal Dietrich","Karja tänav 10, Haapsalu 90503 | (+372) 509 4549", R.drawable.dietrich ));
        attractions.add(new Attraction("Kärme Küülik","Karja tänav 5, Haapsalu 90502 | (+372) 510 5396", R.drawable.k__lik ));
        attractions.add(new Attraction("Kreeka restoran Margot Food & Style","Posti tänav 37, Haapsalu 90502 | (+372) 473 5003", R.drawable.margot ));
        attractions.add(new Attraction("Müüriääre Pagar","Karja tänav 7, Haapsalu 90502 | (+372) 506 0924", R.drawable.m__ri__re ));
        attractions.add(new Attraction("Pizza Grande","Karja tn 6, Haapsalu 90503 | (+372) 473 7200", R.drawable.pizza_grande ));
        attractions.add(new Attraction("Taksi Pubi","Posti tänav 29, Haapsalu 90502 | (+372) 504 7428", R.drawable.taksi_pubi ));
        attractions.add(new Attraction("Talumehe kõrts","Karja tn 2, Haapsalu 90503 | (+372) 530 62755", R.drawable.talumehe ));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
