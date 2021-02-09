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

public class ReynaSnds extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
        PlaceholderFragment.setX(16);
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
            R.raw.reyna1, R.raw.reyna2, R.raw.reyna3, R.raw.reyna4, R.raw.reyna5, R.raw.reyna6, R.raw.reyna7,
            R.raw.reyna8, R.raw.reyna9, R.raw.reyna10, R.raw.reyna11, R.raw.reyna12, R.raw.reyna13, R.raw.reyna14, R.raw.reyna15};
    int[] abilities = {
            R.raw.reyna_a1, R.raw.reyna_a2, R.raw.reyna_a3, R.raw.reynault};


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    MediaPlayer mp;

    public void play1(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[0]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play2(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[1]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play3(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[2]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play4(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[3]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play5(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[4]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play6(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[5]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play7(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[6]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play8(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[7]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play9(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[8]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play10(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[9]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play11(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[10]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play12(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[11]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play13(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[12]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play14(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[13]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play15(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, voice[14]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }
    
    //ABILITIES
    
    public void playab1(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, abilities[0]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab2(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, abilities[1]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }


    public void playab3(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, abilities[2]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }


    public void playult(View view) {
        mp = MediaPlayer.create(ReynaSnds.this, abilities[3]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

}