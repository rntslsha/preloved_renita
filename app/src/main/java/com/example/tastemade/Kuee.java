package com.example.tastemade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
public class Kuee extends AppCompatActivity implements View.OnClickListener{
    private CardView sani1,sani2,sani3,sani4,sani5,sani6,sani7,sani8,sani9,sani10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuee);

        sani9= findViewById(R.id.wpn1);
        sani9.setOnClickListener(this);

        sani8= findViewById(R.id.wpn2);
        sani8.setOnClickListener(this);

        sani7= findViewById(R.id.wpn3);
        sani7.setOnClickListener(this);

        sani6= findViewById(R.id.wpn4);
        sani6.setOnClickListener(this);

        sani5= findViewById(R.id.wpn5);
        sani5.setOnClickListener(this);

        sani4= findViewById(R.id.wpn6);
        sani4.setOnClickListener(this);

        sani10= findViewById(R.id.wpn7);
        sani10.setOnClickListener(this);

        sani3= findViewById(R.id.wpn8);
        sani3.setOnClickListener(this);

        sani2= findViewById(R.id.wpn9);
        sani2.setOnClickListener(this);

        sani1= findViewById(R.id.wpn10);
        sani1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.wpn1:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wpn2:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wpn3:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wpn4:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wpn5:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wpn6:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wpn7:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wpn8:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wpn9:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wpn10:
                startActivity(new Intent(this,Pembayaran.class));
                break;




        }

    }
}
