package com.example.notedriod.model;

import java.util.Date;

public class Note {
    private String title, description;
    private Date dateCreated;

    public Note(String title, String description, Date dateCreated) {
        this.title = title;
        this.description = description;
        this.dateCreated = dateCreated;
    }
    //alt + insert > constructor en getters
    public Note() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}