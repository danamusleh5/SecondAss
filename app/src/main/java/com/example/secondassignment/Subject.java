package com.example.secondassignment;

public class Subject {
    private String name;
    private int imageID;

    public static final Subject[] subjects = {
            new Subject("Languages", R.drawable.langs),
            new Subject("Math", R.drawable.math2),
            new Subject("Philosophy", R.drawable.philo),
            new Subject("Biology", R.drawable.bio),
            new Subject("Chemistry", R.drawable.chem),
            new Subject("Physics", R.drawable.phy),

    };
    private Subject(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}


    }
