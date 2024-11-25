package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{
    private List<Country> countryList;
    private Context context;

    // Constructor to accept data and context
    public ItemAdapter(List<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country = countryList.get(position);

        // Bind data to the views
        holder.itemTextView.setText(country.getName());
        holder.itemImageView.setImageResource(country.getImageResId());

        // Set a click listener for each item
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, CountryDetailActivity.class);
            intent.putExtra("countryName", country.getName());
            intent.putExtra("countryImageResId", country.getImageResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTextView;
        ImageView itemImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.countryName);
            itemImageView = itemView.findViewById(R.id.countryImage);
        }
    }
}
