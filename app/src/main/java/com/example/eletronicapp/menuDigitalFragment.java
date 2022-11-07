package com.example.eletronicapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class menuDigitalFragment extends Fragment {



    public menuDigitalFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static menuDigitalFragment newInstance() {
        menuDigitalFragment fragment = new menuDigitalFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fview = inflater.inflate(R.layout.fragment_menu_digital, container, false);


        final Button btnVoltar = (Button)fview.findViewById(R.id.buttonVolt2);
        btnVoltar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Navigation.findNavController(fview).navigate(R.id.action_menuDigitalFragment_to_homeFragment);
            }
        });

        final Button btnTeoria = (Button)fview.findViewById(R.id.buttonTeoDigital);
        btnTeoria.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Context ct = fview.getContext();
                Intent recycler = new Intent(ct, RecyclerActivity.class);
                recycler.putExtra("opcao",2);
                ct.startActivity(recycler);
            }
        });

        final Button btnExe = (Button)fview.findViewById(R.id.buttonExeDigital);
        btnExe.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Context ct = fview.getContext();
                Intent recycler = new Intent(ct, RecyclerActivity.class);
                recycler.putExtra("opcao",3);
                ct.startActivity(recycler);
            }
        });

        /*final Button btnVoltar = (Button)fview.findViewById(R.id.buttonVolt2);
        btnVoltar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Navigation.findNavController(fview).navigate(R.id.action_menuDigitalFragment_to_homeFragment);
            }
        });*/
        // Inflate the layout for this fragment
        return fview;
    }
}