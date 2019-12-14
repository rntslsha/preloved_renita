package com.example.tastemade;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tastemade.ui.main.Makan;

public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Frafment";
    private ImageView dst,fdd,mnm,koe,buahh,bagikann;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.tab1_fragment, container, false);

        dst=(ImageView) View.findViewById(R.id.deset);
        dst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(getActivity(),IsiDeset.class));
            }
        });

        fdd=(ImageView) View.findViewById(R.id.makanan);
        fdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(getActivity(), Makan.class));
            }
        });

        mnm=(ImageView) View.findViewById(R.id.minuman);
        mnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(getActivity(), Minuman.class));
            }
        });
        koe=(ImageView) View.findViewById(R.id.kue);
        koe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(getActivity(), Kuee.class));
            }
        });

        buahh=(ImageView) View.findViewById(R.id.buah);
        buahh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(getActivity(),IsiBuah.class));
            }
        });

        bagikann=(ImageView) View.findViewById(R.id.bagikan);
        bagikann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(getActivity(),IsiBagikan.class));
            }
        });





        return View;





    }









}

