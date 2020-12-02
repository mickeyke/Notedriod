package com.example.notedriod.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.notedriod.R;
import com.example.notedriod.model.Note;
import com.example.notedriod.model.NoteViewModel;
import com.example.notedriod.util.NoteAdapter;

import java.util.ArrayList;

public class NoteListFragment extends Fragment {

    NoteAdapter noteAdapter;

    public NoteListFragment() {
        // Required empty public constructor
    }


    public static NoteListFragment newInstance() {
        return new NoteListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_note_list, container, false);

        //verwijzen naar user interface
        final RecyclerView rvNotes = rootView.findViewById(R.id.rv_Notes);
        noteAdapter = new NoteAdapter();
        rvNotes.setAdapter(noteAdapter);

        //dataopvragen -> view model
        NoteViewModel model = new ViewModelProvider(this).get(NoteViewModel.class);
        model.getNotes().observeForever(new Observer<ArrayList<Note>>() {
            @Override
            public void onChanged(ArrayList<Note> notes) {
                noteAdapter.addNotes(notes);
                

            }
        });

        //layout manager instellen , welke layout gaan we gebruiken
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        //linair layout , verticaal scrollen en laatste item eerst plaatsen
        rvNotes.setLayoutManager(manager);
        return rootView;
    }
}