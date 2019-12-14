package com.example.tastemade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class IsiBuah extends AppCompatActivity implements View.OnClickListener{
    public CardView st,dw,tg,ep,lm,en,tj,lp,sm,sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_buah);

        st= findViewById(R.id.se1);
        st.setOnClickListener(this);

        dw= findViewById(R.id.se2);
        dw.setOnClickListener(this);

        tg= findViewById(R.id.se3);
        tg.setOnClickListener(this);

        ep= findViewById(R.id.se4);
        ep.setOnClickListener(this);

        lm= findViewById(R.id.se5);
        lm.setOnClickListener(this);

        en= findViewById(R.id.se6);
        en.setOnClickListener(this);

        tj= findViewById(R.id.se7);
        tj.setOnClickListener(this);

        lp= findViewById(R.id.se8);
        lp.setOnClickListener(this);

        sm= findViewById(R.id.se9);
        sm.setOnClickListener(this);

        sp= findViewById(R.id.se10);
        sp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.se1:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.se2:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.se3:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.se4:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.se5:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.se6:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.se7:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.se8:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.se9:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.se10:
                startActivity(new Intent(this,Pembayaran.class));
                break;



        }

    }
}
