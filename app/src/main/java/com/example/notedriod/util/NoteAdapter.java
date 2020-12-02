package com.example.notedriod.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notedriod.R;
import com.example.notedriod.model.Note;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {

    //inner class > wordt toch enkel binnen de adapter gebruikt
    //classe binnen een andere classe

    class NoteViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;
        final Button btnDescription;


        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.card_tv_title);
            btnDescription = itemView.findViewById(R.id.card_btn_details);
        }
    }

    //array list van notes nodig
    private ArrayList<Note> items;

    public NoteAdapter() {
        this.items = new ArrayList<>();
    }

    public void addNotes(ArrayList<Note> newNotes){
        items= newNotes;
        //adapter zeggen dat er nieuwe data is:
        notifyDataSetChanged();
    }

    //Tekenen een eerste zichtbare rij , sla op in holder
    // holder wordt gerecycleerd voor volgende rijen die zichtbaar worden
    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //create view
        //in welke context komt alles ( activity )
        Context mContext = parent.getContext();
        //bepaal ik de inflater , haal deze uit de context
        LayoutInflater mLayoutInflater = LayoutInflater.from(mContext);
        //build card
        View card = mLayoutInflater.inflate(R.layout.notes_card,parent,false);

        return new NoteViewHolder(card);
    }
    //vul de rij op, maak gebruik van holder om te verwijzen naar componeten in de rij
    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        Note currentNote = items.get(position);
        holder.tvTitle.setText(currentNote.getTitle());

    }
    //hoeveel rijden zijn er nodig
    @Override
    public int getItemCount() {
        return items.size();
    }
}
