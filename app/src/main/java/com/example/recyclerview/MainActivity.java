package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CountryAdapter adapter;
    private List<Country> countryList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        // Prepare data
        countryList = new ArrayList<>();
        countryList.add(new Country("Bangladesh", R.drawable.bangladesh));
        countryList.add(new Country("Pakistan", R.drawable.pakistan));
        countryList.add(new Country("Nepal", R.drawable.nepal));
        countryList.add(new Country("China", R.drawable.china));

        // Set adapter
        adapter = new CountryAdapter(countryList, this);
        recyclerView.setAdapter(adapter);

    }
}



