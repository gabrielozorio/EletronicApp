package com.example.eletronicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerActivity extends AppCompatActivity {

    RecyclerView Lista;
    String nomePdfs[], descrPdfs[];
/* Ainda falta:
*  Passar parametro que seleciona os vetores adequados
*  Switch case escolhendo os vetores certos a partir do parametro recebido */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_activity);
        Lista = findViewById(R.id.ListaTeoAnalog);
        nomePdfs = getResources().getStringArray(R.array.arq_dig);

        RecyclerAdapter adaptador = new RecyclerAdapter(this, nomePdfs, descrPdfs);
        Lista.setAdapter(adaptador);
        Lista.setLayoutManager(new LinearLayoutManager(this));
    }
}
