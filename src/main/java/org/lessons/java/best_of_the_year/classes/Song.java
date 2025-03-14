package org.lessons.java.best_of_the_year.classes;

import java.util.Random;

public class Song {
    private int id;
    private String title;

    public Song(){};

    public Song(int id, String title){
        this.id = id;
        this.title = title;
    }

    // getter e setter
    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
}
