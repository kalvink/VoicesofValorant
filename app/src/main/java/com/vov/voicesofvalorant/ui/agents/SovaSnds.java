package com.vov.voicesofvalorant.ui.agents;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.vov.voicesofvalorant.R;
import com.vov.voicesofvalorant.ui.agents.main.PlaceholderFragment;
import com.vov.voicesofvalorant.ui.agents.main.SectionsPagerAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.tabs.TabLayout;

public class SovaSnds extends AppCompatActivity {
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
            R.raw.sova1, R.raw.sova2, R.raw.sova3, R.raw.sova4, R.raw.sova5, R.raw.sova6, R.raw.sova7};
    int[] abilities = {
            R.raw.sova_ab1, R.raw.sova_ab2, R.raw.sova_ab3, R.raw.sova_ab3v2, R.raw.sovault};


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    MediaPlayer mp;

    public void play1(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[0]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play2(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[1]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play3(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[2]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play4(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[3]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play5(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[4]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play6(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[5]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play7(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[6]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play8(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[7]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play9(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[8]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab1(View view) {
        mp = MediaPlayer.create(SovaSnds.this, abilities[0]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab2(View view) {
        mp = MediaPlayer.create(SovaSnds.this, abilities[1]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab3(View view) {
        mp = MediaPlayer.create(SovaSnds.this, abilities[2]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab3_2(View view) {
        mp = MediaPlayer.create(SovaSnds.this, abilities[3]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playult(View view) {
        mp = MediaPlayer.create(SovaSnds.this, abilities[4]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

}