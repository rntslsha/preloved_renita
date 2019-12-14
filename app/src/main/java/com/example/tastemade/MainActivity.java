package com.example.tastemade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button lgn,hlp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lgn = findViewById(R.id.btn_login);
        lgn.setOnClickListener(this);

        hlp = findViewById(R.id.btn_help);
        hlp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                startActivity(new Intent(this,Login.class));
                break;

            case R.id.btn_help:
                startActivity(new Intent(this,Paswodd.class));
        }


    }
}
