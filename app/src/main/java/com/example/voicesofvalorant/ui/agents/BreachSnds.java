package com.example.voicesofvalorant.ui.agents;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.voicesofvalorant.R;
import com.example.voicesofvalorant.ui.agents.ui.main.PlaceholderFragment;
import com.google.android.material.tabs.TabLayout;

import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.voicesofvalorant.ui.agents.ui.main.SectionsPagerAdapter;

public class BreachSnds extends AppCompatActivity {

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


        // Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void play1(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br1);
        mp.start();
    }
    public void play2(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br2);
        mp.start();
    }
    public void play3(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br3);
        mp.start();
    }
    public void play4(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br4);
        mp.start();
    }
    public void play5(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br5);
        mp.start();
    }
    public void play6(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br6);
        mp.start();
    }
    public void play7(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br7);
        mp.start();
    }
    public void play8(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br8);
        mp.start();
    }
    public void play9(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br9);
        mp.start();
    }
    public void play10(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br10);
        mp.start();
    }
    public void play11(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br11);
        mp.start();
    }
    public void play12(View view) {
        MediaPlayer mp = MediaPlayer.create(BreachSnds.this, R.raw.br12);
        mp.start();
    }
}