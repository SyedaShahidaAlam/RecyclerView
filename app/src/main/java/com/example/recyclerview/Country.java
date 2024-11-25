package com.example.recyclerview;

public class Country {
    private String name;
    private int imageResId;

    public Country(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}
