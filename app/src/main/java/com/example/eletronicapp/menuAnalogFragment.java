package com.example.eletronicapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class menuAnalogFragment extends Fragment {



    public menuAnalogFragment() {
        // Required empty public constructor
    }

    public static menuAnalogFragment newInstance() {
        menuAnalogFragment fragment = new menuAnalogFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View fview = inflater.inflate(R.layout.fragment_menu_analog, container, false);

        final Button btnVoltar = (Button)fview.findViewById(R.id.buttonVolt1);
        btnVoltar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Navigation.findNavController(fview).navigate(R.id.action_menuAnalogFragment_to_homeFragment);
            }
        });

/*
        final Button btnTeoAnalog = (Button)fview.findViewById(R.id.buttonTeoAnalog);
        btnTeoAnalog.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Navigation.findNavController(fview).navigate(R.id.action_menuAnalogFragment_to_teoAnalogFragment);
            }
        });
*/
        final Button btnTeoAnalog = (Button)fview.findViewById(R.id.buttonTeoAnalog);
        btnTeoAnalog.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Navigation.findNavController(fview).navigate(R.id.action_menuAnalogFragment_to_pdfActivity3);
            }
        });

        final Button btnExeAnalog = (Button)fview.findViewById(R.id.buttonExeAnalog);
        btnExeAnalog.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Navigation.findNavController(fview).navigate(R.id.action_menuAnalogFragment_to_exeAnalogFragment);
            }
        });
        /* Escrever a parte do simulador */
    return fview;
    }
}