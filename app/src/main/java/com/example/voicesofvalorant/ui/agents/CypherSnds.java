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

public class CypherSnds extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
        PlaceholderFragment.setX(4);
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
            R.raw.cypher1, R.raw.cypher2, R.raw.cypher3, R.raw.cypher4, R.raw.cypher5, R.raw.cypher6, R.raw.cypher7, R.raw.cypher8, R.raw.cypher9, R.raw.cypher10, R.raw.cypher11, R.raw.cypher12, R.raw.cypher13, R.raw.cypher14};

    MediaPlayer mp;

    public void play1(View view) {
        mp = MediaPlayer.create(this, voice[0]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play2(View view) {
        mp = MediaPlayer.create(this, voice[1]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play3(View view) {
        mp = MediaPlayer.create(this, voice[2]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play4(View view) {
        mp = MediaPlayer.create(this, voice[3]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play5(View view) {
        mp = MediaPlayer.create(this, voice[4]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play6(View view) {
        mp = MediaPlayer.create(this, voice[5]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play7(View view) {
        mp = MediaPlayer.create(this, voice[6]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play8(View view) {
        mp = MediaPlayer.create(this, voice[7]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play9(View view) {
        mp = MediaPlayer.create(this, voice[8]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play10(View view) {
        mp = MediaPlayer.create(this, voice[9]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play11(View view) {
        mp = MediaPlayer.create(this, voice[10]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play12(View view) {
        mp = MediaPlayer.create(this, voice[11]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play13(View view) {
        mp = MediaPlayer.create(this, voice[12]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play14(View view) {
        mp = MediaPlayer.create(this, voice[13]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }


    int[] abilities = {
            R.raw.cypher_ab1, R.raw.cypher_ab1v2, R.raw.cypher_ab2, R.raw.cypher_ab2v2, R.raw.cypher_ab3, R.raw.cypher_ab3v2, R.raw.cypherult};

    public void playab1(View view) {
        mp = MediaPlayer.create(this, abilities[0]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab1v2(View view) {
        mp = MediaPlayer.create(this, abilities[1]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab2(View view) {
        mp = MediaPlayer.create(this, abilities[2]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab2v2(View view) {
        mp = MediaPlayer.create(this, abilities[3]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab3(View view) {
        mp = MediaPlayer.create(this, abilities[4]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab3v2(View view) {
        mp = MediaPlayer.create(this, abilities[5]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playult(View view) {
        mp = MediaPlayer.create(this, abilities[6]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }


}