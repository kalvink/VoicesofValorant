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

public class ViperSnds extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
        PlaceholderFragment.setX(22);
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
            R.raw.viper1, R.raw.viper2, R.raw.viper3, R.raw.viper4, R.raw.viper5, R.raw.viper6, R.raw.viper7, R.raw.viper8};
    int[] abilities = {
            R.raw.viper_ab1, R.raw.viper_ab2, R.raw.viper_ab3, R.raw.viper_ab3v2, R.raw.viperult};


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    MediaPlayer mp;

    public void play1(View view) {
        mp = MediaPlayer.create(ViperSnds.this, voice[0]);
        mp.start();
    }

    public void play2(View view) {
        mp = MediaPlayer.create(ViperSnds.this, voice[1]);
        mp.start();
    }

    public void play3(View view) {
        mp = MediaPlayer.create(ViperSnds.this, voice[2]);
        mp.start();
    }

    public void play4(View view) {
        mp = MediaPlayer.create(ViperSnds.this, voice[3]);
        mp.start();
    }

    public void play5(View view) {
        mp = MediaPlayer.create(ViperSnds.this, voice[4]);
        mp.start();
    }

    public void play6(View view) {
        mp = MediaPlayer.create(ViperSnds.this, voice[5]);
        mp.start();
    }

    public void play7(View view) {
        mp = MediaPlayer.create(ViperSnds.this, voice[6]);
        mp.start();
    }

    public void play8(View view) {
        mp = MediaPlayer.create(ViperSnds.this, voice[7]);
        mp.start();
    }

    public void play9(View view) {
        mp = MediaPlayer.create(ViperSnds.this, voice[8]);
        mp.start();
    }

    public void playab1(View view) {
        mp = MediaPlayer.create(ViperSnds.this, abilities[0]);
        mp.start();
    }

    public void playab2(View view) {
        mp = MediaPlayer.create(ViperSnds.this, abilities[1]);
        mp.start();
    }

    public void playab2_2(View view) {
        mp = MediaPlayer.create(ViperSnds.this, abilities[2]);
        mp.start();
    }

    public void playab3(View view) {
        mp = MediaPlayer.create(ViperSnds.this, abilities[3]);
        mp.start();
    }

    public void playab3_2(View view) {
        mp = MediaPlayer.create(ViperSnds.this, abilities[4]);
        mp.start();
    }

    public void playult(View view) {
        mp = MediaPlayer.create(ViperSnds.this, abilities[5]);
        mp.start();
    }

    public void playult2(View view) {
        mp = MediaPlayer.create(ViperSnds.this, R.raw.br_ult2);
        mp.start();
    }
}