package com.example.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CountryDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_country_detail);

        TextView countryName = findViewById(R.id.detailCountryName);
        ImageView countryImage = findViewById(R.id.detailCountryImage);

        // Get data from intent
        String name = getIntent().getStringExtra("countryName");
        int imageResId = getIntent().getIntExtra("countryImageResId", 0);

        // Set data
        countryName.setText(name);
        countryImage.setImageResource(imageResId);

    }
}