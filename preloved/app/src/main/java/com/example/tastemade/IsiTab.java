package com.example.tastemade;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class IsiTab extends AppCompatActivity {
private static final String TAG = "ISI TAB";
private SectionsPagerAdapter mSectionsPagrAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_tab);
        Log.d(TAG,"onCreate Starting");

        mSectionsPagrAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager=(ViewPager) findViewById(R.id.kontener);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }

    private void setupViewPager (ViewPager viewPager){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(),"Home");
        adapter.addFragment(new Tab3Fragment(),"Account");
        viewPager.setAdapter(adapter);


    }




}