package com.example.tastemade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tastemade.ui.main.SaranKomentar;

public class Paswodd extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Taste Made","Apakah anda belum mempunyai akun?" ,"Apakah anda lupa password?","Silahkan masukan saran dan komentar"};
    String mDescription[] = {"Taste Made adalah multi platform food-focused digital media\n yang membahas mengenai resep,tutorial,tips dan trik memasak",
            "Silahkan melakukan pendaftaran akun", "Silahkan melakukan mengganti password", "Masukkan saran dan komentar anda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paswodd);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(Paswodd.this, "Facebook Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(),Signup.class);
                    intent.putExtra("postion",id);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(),LupaPaswod.class);
                    intent.putExtra("postion",id);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), SaranKomentar.class);
                    intent.putExtra("postion",id);
                    startActivity(intent);



                }

            }
        });

    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];

        MyAdapter (Context c, String title[], String description[]){
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }

}
