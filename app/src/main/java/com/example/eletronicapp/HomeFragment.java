package com.example.eletronicapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.widget.Button;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {




    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View fview = inflater.inflate(R.layout.fragment_home, container, false);

    final Button btnAnalog = fview.findViewById(R.id.buttonMenuAnalog);
    btnAnalog.setOnClickListener(fview12 -> Navigation.findNavController(fview12).navigate(R.id.action_homeFragment_to_menuAnalogFragment));

    final Button btnSobre = fview.findViewById(R.id.buttonMenuSobre);
    btnSobre.setOnClickListener(fview13 -> Navigation.findNavController(fview13).navigate(R.id.action_homeFragment_to_sobreFragment));

    final Button btnDigital = fview.findViewById(R.id.buttonMenuDigital);
        btnDigital.setOnClickListener(fview1 -> Navigation.findNavController(fview1).navigate(R.id.action_homeFragment_to_menuDigitalFragment));



    return fview;
    }



}