package com.example.partiel_rezquellah_hiba.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.partiel_rezquellah_hiba.R;
import com.example.partiel_rezquellah_hiba.model.Pilote;

import java.util.List;

public class ListPiloteAdapter extends RecyclerView.Adapter<ListPiloteAdapter.ViewHolder>{
    private final List<Pilote> items;

    public ListPiloteAdapter(List<Pilote> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ListPiloteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View piloteView = layoutInflater.inflate(R.layout.item_pilote,parent,false);
        return new ViewHolder(piloteView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPiloteAdapter.ViewHolder holder, int position) {
        Pilote pilote = items.get(position);
        TextView name = holder.name;
        name.setText(pilote.getName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name;

        public ViewHolder(View itemView){
            super(itemView);

            name = itemView.findViewById(R.id.name);
        }
    }
}
