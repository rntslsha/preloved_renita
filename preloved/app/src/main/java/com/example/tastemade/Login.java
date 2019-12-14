package com.example.tastemade;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private TextView sgp,loginn;
    private Button fb,em;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sgp=findViewById(R.id.signup);
        sgp.setOnClickListener(this);

        loginn=findViewById(R.id.login1);
        loginn.setOnClickListener(this);


        Button fb =findViewById((R.id.fesbuk));
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://facebook.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.instagram.android");
                try {
                    Toast.makeText(Login.this,"Instagram",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://facebook.com")));

                }
            }
        });


    }

    public void email (View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"fitriyyahs17@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari aplikasi android");

        try {
            startActivity(Intent.createChooser(intent, "ingin kirim email?"));
        } catch (android.content.ActivityNotFoundException ex) {
        }
    }






    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.signup:
                startActivity(new Intent(this,Signup.class));
                break;

            case R.id.login1:
                startActivity(new Intent(this,IsiTab.class));
                break;


        }

    }
}
