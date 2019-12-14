package com.example.tastemade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Minuman extends AppCompatActivity implements View.OnClickListener{
    private CardView sei1,sei2,sei3,sel4,sei5,sei6,sei7,sei8,sei9,sei10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        sei1= findViewById(R.id.pan1);
        sei1.setOnClickListener(this);

        sei2= findViewById(R.id.pan2);
        sei2.setOnClickListener(this);

        sei3= findViewById(R.id.pan3);
        sei3.setOnClickListener(this);

        sel4= findViewById(R.id.pan4);
        sel4.setOnClickListener(this);

        sei5= findViewById(R.id.pan5);
        sei5.setOnClickListener(this);

        sei6= findViewById(R.id.pan6);
        sei6.setOnClickListener(this);

        sei7= findViewById(R.id.pan7);
        sei7.setOnClickListener(this);

        sei8= findViewById(R.id.pan8);
        sei8.setOnClickListener(this);

        sei9= findViewById(R.id.pan9);
        sei9.setOnClickListener(this);

        sei10= findViewById(R.id.pan10);
        sei10.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pan1:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.pan2:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.pan3:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.pan4:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.pan5:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.pan6:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.pan7:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.pan8:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.pan9:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.pan10:
                startActivity(new Intent(this,Pembayaran.class));
                break;





        }

    }
}
