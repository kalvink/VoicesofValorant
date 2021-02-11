package com.vov.voicesofvalorant.ui.agents;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.vov.voicesofvalorant.R;
import com.vov.voicesofvalorant.ui.agents.main.PlaceholderFragment;
import com.vov.voicesofvalorant.ui.agents.main.SectionsPagerAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.tabs.TabLayout;

public class KillSnds extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
        PlaceholderFragment.setX(8);
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
            R.raw.kill1, R.raw.kill2, R.raw.kill3, R.raw.kill4, R.raw.kill5, R.raw.kill6, R.raw.kill7, R.raw.kill8,
            R.raw.kill9, R.raw.kill10, R.raw.kill11, R.raw.kill12, R.raw.kill13, R.raw.kill14, R.raw.kill15};
    int[] abilities = {
            R.raw.kill_a1, R.raw.kill_a2, R.raw.kill_a3, R.raw.killult};


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        Animatoo.animateSlideRight(this); //fire the slide right animation
        return true;
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSlideRight(this); //fire the slide left animation
    }


    MediaPlayer mp;

    // Voices

    public void play1(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[0]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play2(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[1]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play3(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[2]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play4(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[3]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play5(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[4]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play6(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[5]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }
    public void play7(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[6]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play8(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[7]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play9(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[8]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play10(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[9]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play11(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[10]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play12(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[11]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play13(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[12]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play14(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[13]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play15(View view) {
        mp = MediaPlayer.create(KillSnds.this, voice[14]);
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
        mp = MediaPlayer.create(KillSnds.this, abilities[0]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab2(View view) {
        mp = MediaPlayer.create(KillSnds.this, abilities[1]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playab3(View view) {
        mp = MediaPlayer.create(KillSnds.this, abilities[2]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void playult(View view) {
        mp = MediaPlayer.create(KillSnds.this, abilities[3]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

}