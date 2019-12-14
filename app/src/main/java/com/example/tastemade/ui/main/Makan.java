package com.example.tastemade.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.tastemade.Pembayaran;
import com.example.tastemade.R;

public class Makan extends AppCompatActivity implements View.OnClickListener {
    private CardView women1,women2,women3,women4,women5,women6,women7,women8,women9,women10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makan);


        women1= findViewById(R.id.wmn1);
        women1.setOnClickListener(this);

        women2= findViewById(R.id.wmn2);
        women2.setOnClickListener(this);

        women3= findViewById(R.id.wmn3);
        women3.setOnClickListener(this);

        women4= findViewById(R.id.wmn4);
        women4.setOnClickListener(this);

        women5= findViewById(R.id.wmn5);
        women5.setOnClickListener(this);

        women6= findViewById(R.id.wmn6);
        women6.setOnClickListener(this);

        women7= findViewById(R.id.wmn7);
        women7.setOnClickListener(this);

        women8= findViewById(R.id.wmn8);
        women8.setOnClickListener(this);

        women9= findViewById(R.id.wmn9);
        women9.setOnClickListener(this);

        women10= findViewById(R.id.wmn10);
        women10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.wmn1:
                startActivity(new Intent(this, Pembayaran.class));
                break;

            case R.id.wmn2:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wmn3:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wmn4:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wmn5:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wmn6:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wmn7:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wmn8:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wmn9:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.wmn10:
                startActivity(new Intent(this,Pembayaran.class));
                break;
        }

    }
}
