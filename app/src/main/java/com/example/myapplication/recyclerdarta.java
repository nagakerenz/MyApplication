package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerdarta extends RecyclerView.Adapter<recyclerdarta.MyViewHolder>{
    private ArrayList<list> listsData;
    private RecyclerViewClickListener listener;

    public recyclerdarta(ArrayList<list> listsData, RecyclerViewClickListener listener){
        this.listsData = listsData;
        this.listener = listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        private TextView nameTxt;

        public MyViewHolder(final View view){
            super(view);
            nameTxt = view.findViewById(R.id.button);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());

        }
    }

    @NonNull
    @Override
    public recyclerdarta.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerdarta.MyViewHolder holder, int position) {
        String name = listsData.get(position).getLists();
        holder.nameTxt.setText(name);
    }

    @Override
    public int getItemCount() {
        return listsData.size();
    }
    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }
}
