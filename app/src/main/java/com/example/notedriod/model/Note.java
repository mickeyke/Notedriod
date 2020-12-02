package com.example.notedriod.model;

import java.io.Serializable;
import java.util.Date;

//Serializable is nodig om data door te geven tussen schermen.
public class Note implements Serializable {
    private String title, description;
   // private Date dateCreated;


    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Note() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
