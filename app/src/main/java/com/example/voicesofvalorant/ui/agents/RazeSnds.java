package com.example.voicesofvalorant.ui.agents;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.voicesofvalorant.R;
import com.example.voicesofvalorant.ui.agents.ui.main.PlaceholderFragment;
import com.example.voicesofvalorant.ui.agents.ui.main.SectionsPagerAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.tabs.TabLayout;

public class RazeSnds extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
        PlaceholderFragment.setX(14);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);


        // Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        // Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }


    int[] voice = {
            R.raw.raze1, R.raw.raze2, R.raw.raze3, R.raw.raze4, R.raw.raze5, R.raw.raze6, R.raw.raze7, R.raw.raze8, R.raw.raze9, R.raw.raze10,R.raw.raze11 ,R.raw.raze12};
    int[] abilities = {
            R.raw.raze_ab1, R.raw.raze_ab1v2, R.raw.raze_ab2, R.raw.raze_ab3, R.raw.razeult};


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    MediaPlayer mp;

    public void play1(View view) {
        mp = MediaPlayer.create(RazeSnds.this, voice[0]);
        mp.start();
    }

    public void play2(View view) {
        mp = MediaPlayer.create(RazeSnds.this, voice[1]);
        mp.start();
    }

    public void play3(View view) {
        mp = MediaPlayer.create(RazeSnds.this, voice[2]);
        mp.start();
    }

    public void play4(View view) {
        mp = MediaPlayer.create(RazeSnds.this, voice[3]);
        mp.start();
    }

    public void play5(View view) {
        mp = MediaPlayer.create(RazeSnds.this, voice[4]);
        mp.start();
    }

    public void play6(View view) {
        mp = MediaPlayer.create(RazeSnds.this, voice[5]);
        mp.start();
    }

    public void play7(View view) {
        mp = MediaPlayer.create(RazeSnds.this, voice[6]);
        mp.start();
    }

    public void play8(View view) {
        mp = MediaPlayer.create(RazeSnds.this, voice[7]);
        mp.start();
    }

    public void play9(View view) {
        mp = MediaPlayer.create(RazeSnds.this, voice[8]);
        mp.start();
    }

    public void playab1(View view) {
        mp = MediaPlayer.create(RazeSnds.this, abilities[0]);
        mp.start();
    }

    public void playab2(View view) {
        mp = MediaPlayer.create(RazeSnds.this, abilities[1]);
        mp.start();
    }

    public void playab2_2(View view) {
        mp = MediaPlayer.create(RazeSnds.this, abilities[2]);
        mp.start();
    }

    public void playab3(View view) {
        mp = MediaPlayer.create(RazeSnds.this, abilities[3]);
        mp.start();
    }

    public void playab3_2(View view) {
        mp = MediaPlayer.create(RazeSnds.this, abilities[4]);
        mp.start();
    }

    public void playult(View view) {
        mp = MediaPlayer.create(RazeSnds.this, abilities[5]);
        mp.start();
    }

    public void playult2(View view) {
        mp = MediaPlayer.create(RazeSnds.this, R.raw.br_ult2);
        mp.start();
    }
}