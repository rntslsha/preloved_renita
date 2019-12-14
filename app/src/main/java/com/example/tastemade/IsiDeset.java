package com.example.tastemade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class IsiDeset extends AppCompatActivity implements View.OnClickListener {
    public CardView satu,dua,tiga,empat,lima,enam,tujuh,del,sem,sep;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_deset);

        satu= findViewById(R.id.gm1);
        satu.setOnClickListener(this);

        dua= findViewById(R.id.gm2);
        dua.setOnClickListener(this);

        tiga= findViewById(R.id.gm3);
        tiga.setOnClickListener(this);

        empat= findViewById(R.id.gm4);
        empat.setOnClickListener(this);

        lima= findViewById(R.id.gm5);
        lima.setOnClickListener(this);

        enam= findViewById(R.id.gm6);
        enam.setOnClickListener(this);

        tujuh= findViewById(R.id.gm7);
        tujuh.setOnClickListener(this);

        del= findViewById(R.id.gm8);
        del.setOnClickListener(this);

        del= findViewById(R.id.gm8);
        del.setOnClickListener(this);

        sem= findViewById(R.id.gm9);
        sem.setOnClickListener(this);

        sep= findViewById(R.id.gm10);
        sep.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.gm1:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.gm2:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.gm3:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.gm4:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.gm5:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.gm6:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.gm7:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.gm8:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.gm9:
                startActivity(new Intent(this,Pembayaran.class));
                break;

            case R.id.gm10:
                startActivity(new Intent(this,Pembayaran.class));
                break;





        }

    }
}
