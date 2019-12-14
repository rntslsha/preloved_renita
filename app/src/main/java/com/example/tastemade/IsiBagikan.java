package com.example.tastemade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class IsiBagikan extends AppCompatActivity implements View.OnClickListener {
    private CardView s,d,t,e,l,enm,tjh,lpn,sml,spl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_bagikan);

        s= findViewById(R.id.b1);
        s.setOnClickListener(this);

        d= findViewById(R.id.b2);
        d.setOnClickListener(this);

        t= findViewById(R.id.b3);
        t.setOnClickListener(this);

        e= findViewById(R.id.b4);
        e.setOnClickListener(this);

        l= findViewById(R.id.b5);
        l.setOnClickListener(this);

        enm= findViewById(R.id.b6);
        enm.setOnClickListener(this);

        tjh= findViewById(R.id.b7);
        tjh.setOnClickListener(this);

        lpn= findViewById(R.id.b8);
        lpn.setOnClickListener(this);

        sml= findViewById(R.id.b9);
        sml.setOnClickListener(this);

        spl= findViewById(R.id.b10);
        spl.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.b1:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.b2:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.b3:
                startActivity(new Intent(this,Pembayaran.class));
                break;


            case R.id.b4:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.b5:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.b6:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.b7:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.b8:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.b9:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.b10:
                startActivity(new Intent(this,Pembayaran.class));
                break;




        }

    }
}
