package com.example.eletronicapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.widget.Button;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
  /*  private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";*/

  /*  // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2; */

    public HomeFragment() {
        // Required empty public constructor
    }
/*
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */

    // TODO: Rename and change types and number of parameters
    /*
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    } */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View fview = inflater.inflate(R.layout.fragment_home, container, false);

    final Button btnAnalog = (Button)fview.findViewById(R.id.buttonMenuAnalog);
    btnAnalog.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Navigation.findNavController(fview).navigate(R.id.action_homeFragment_to_menuAnalogFragment);
            }
        });

    final Button btnSobre = (Button)fview.findViewById(R.id.buttonMenuSobre);
    btnSobre.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Navigation.findNavController(fview).navigate(R.id.action_homeFragment_to_sobreFragment);
            }
        });

    final Button btnDigital = (Button)fview.findViewById(R.id.buttonMenuDigital);
        btnDigital.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View fview) {
                Navigation.findNavController(fview).navigate(R.id.action_homeFragment_to_menuDigitalFragment);
            }
        });

    return fview;
    }



}