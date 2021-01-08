package com.example.voicesofvalorant.ui.agents;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.voicesofvalorant.R;
import com.example.voicesofvalorant.ui.agents.ui.main.PlaceholderFragment;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.tabs.TabLayout;

import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.voicesofvalorant.ui.agents.ui.main.SectionsPagerAdapter;

public class BreachSnds extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
        PlaceholderFragment.setX(0);
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

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    int[] voice = {
            R.raw.br1, R.raw.br2, R.raw.br3, R.raw.br4, R.raw.br5, R.raw.br6, R.raw.br7, R.raw.br8, R.raw.br9, R.raw.br10, R.raw.br11, R.raw.br12};
    int[] abilities = {
            R.raw.br_a1, R.raw.br_a2, R.raw.br_a2_2, R.raw.br_a3, R.raw.br_a3_2, R.raw.br_ult, R.raw.br_ult2};

    MediaPlayer mp;

    public void play1(View view) {
        mp = MediaPlayer.create(this, voice[0]);
        mp.start();
    }

    public void play2(View view) {
        mp = MediaPlayer.create(this, voice[1]);
        mp.start();
    }

    public void play3(View view) {
        mp = MediaPlayer.create(this, voice[2]);
        mp.start();
    }

    public void play4(View view) {
        mp = MediaPlayer.create(this, voice[3]);
        mp.start();
    }

    public void play5(View view) {
        mp = MediaPlayer.create(this, voice[4]);
        mp.start();
    }

    public void play6(View view) {
        mp = MediaPlayer.create(this, voice[5]);
        mp.start();
    }

    public void play7(View view) {
        mp = MediaPlayer.create(this, voice[6]);
        mp.start();
    }

    public void play8(View view) {
        mp = MediaPlayer.create(this, voice[7]);
        mp.start();
    }

    public void play9(View view) {
        mp = MediaPlayer.create(this, voice[8]);
        mp.start();
    }

    public void play10(View view) {
        mp = MediaPlayer.create(this, voice[9]);
        mp.start();
    }

    public void play11(View view) {
        mp = MediaPlayer.create(this, voice[10]);
        mp.start();
    }

    public void play12(View view) {
        mp = MediaPlayer.create(this, voice[11]);
        mp.start();
    }

    public void playab1(View view) {
        mp = MediaPlayer.create(this, abilities[0]);
        mp.start();
    }

    public void playab2(View view) {
        mp = MediaPlayer.create(this, abilities[1]);
        mp.start();
    }

    public void playab2_2(View view) {
        mp = MediaPlayer.create(this, abilities[2]);
        mp.start();
    }

    public void playab3(View view) {
        mp = MediaPlayer.create(this, abilities[3]);
        mp.start();
    }

    public void playab3_2(View view) {
        mp = MediaPlayer.create(this, abilities[4]);
        mp.start();
    }

    public void playult(View view) {
        mp = MediaPlayer.create(this, abilities[5]);
        mp.start();
    }

    public void playult2(View view) {
        mp = MediaPlayer.create(this, abilities[6]);
        mp.start();
    }
}