package com.example.tastemade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class IsiDeset extends AppCompatActivity implements View.OnClickListener {
    private ImageView gam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_deset);
        gam = findViewById(R.id.gambarsatu);
        gam.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.gambarsatu:
            startActivity(new Intent(this,Makan1.class));
            break;
        }

    }
}
