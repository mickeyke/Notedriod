package com.example.notedriod.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class NoteViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Note>> notes;

    public NoteViewModel(){

    }
    // dit komt later vanuit een database ... .
    public MutableLiveData<ArrayList<Note>> getNotes() {
        if(notes == null){
            notes = new MutableLiveData<>();
            ArrayList<Note> tempNotes = new ArrayList<>();
            tempNotes.add(new Note("Aanmaken Project","hier gaan we een project aamken voor andriod development"));
            tempNotes.add(new Note("list opmaken","lijst maken van alle notties"));

        }
        return notes;
    }
}
