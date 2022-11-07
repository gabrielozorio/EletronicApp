package com.example.eletronicapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerActivity extends AppCompatActivity {

    RecyclerView Lista;
    String nomePdfs[], descrPdfs[];
    int modo;
/* Ainda falta:
*  Passar parametro que seleciona os vetores adequados
*  Switch case escolhendo os vetores certos a partir do parametro recebido */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_activity);
        Lista = findViewById(R.id.Lista);

        getData();
        switch (modo){
            case 0:
                nomePdfs = getResources().getStringArray(R.array.teoAnalog);
              //  descrPdfs = getResources().getStringArray(R.array.exe_analog);
            break;
            case 1:
                nomePdfs = getResources().getStringArray(R.array.exeAnalog);
                //descrPdfs = getResources().getStringArray(R.array.exe_analog);
            break;
            case 2:
                nomePdfs = getResources().getStringArray(R.array.teoDig);
                //descrPdfs = getResources().getStringArray(R.array.exe_dig);
            break;
            case 3:
                nomePdfs = getResources().getStringArray(R.array.exeDig);
                //descrPdfs = getResources().getStringArray(R.array.arq_dig);
            break;
        }

        // nomePdfs = getResources().getStringArray(R.array.arq_dig);

        RecyclerAdapter adaptador = new RecyclerAdapter(this, nomePdfs, descrPdfs);
        Lista.setAdapter(adaptador);
        Lista.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData()
    {
        if(getIntent().hasExtra("opcao"))
        {

            modo = getIntent().getIntExtra("opcao",modo);
        }
        else
        {

            Toast.makeText(this,"no data.",Toast.LENGTH_SHORT).show();
        }
    }

}
