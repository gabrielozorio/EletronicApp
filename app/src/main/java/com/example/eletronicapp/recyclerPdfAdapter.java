package com.example.eletronicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerPdfAdapter extends RecyclerView.Adapter<recyclerPdfAdapter.MyViewHolder> {

    String s1[], s2[];
    Context context;
    public recyclerPdfAdapter(Context ct,String nomes[], String descr[]) {
        context = ct;
        s1 = nomes;
        s2 = descr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.texto1.setText(s2[position]);
    }

    @Override
    public int getItemCount() {
        return s1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView texto1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            texto1 = itemView.findViewById(R.id.topCard);
        }
    }
}
