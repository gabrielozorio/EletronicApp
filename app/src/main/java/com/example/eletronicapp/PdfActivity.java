package com.example.eletronicapp;

import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;
import android.os.Bundle;
import android.widget.Toast;

public class PdfActivity extends AppCompatActivity {

    PDFView novoPdf;
    String tituloArq;
    int modo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);


        getData();
        novoPdf = findViewById(R.id.novopdf);
        setData();

    }

    private void getData()
    {
        if(getIntent().hasExtra("nomArq"))
        {
            tituloArq = getIntent().getStringExtra("nomArq");


        }
        else
        {
            Toast.makeText(this,"no data.",Toast.LENGTH_SHORT).show();
        }
    }

    private void setData()
    {
        novoPdf.fromAsset(tituloArq).load();

    }
}