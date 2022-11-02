package com.example.eletronicapp;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class PdfActivity extends AppCompatActivity {

    RecyclerView Lista;
    String nomePdfs[], descrPdfs[];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_activity);
        Lista = findViewById(R.id.ListaTeoAnalog);
        nomePdfs = getResources().getStringArray(R.array.arq_dig);

        recyclerPdfAdapter adaptador = new recyclerPdfAdapter(this, nomePdfs, descrPdfs);
        Lista.setAdapter(adaptador);
        Lista.setLayoutManager(new LinearLayoutManager(this));
    }
}
