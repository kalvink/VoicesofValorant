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

import java.io.IOException;

public class SovaSnds extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
        PlaceholderFragment.setX(33);
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
            R.raw.sova1, R.raw.sova2, R.raw.sova3, R.raw.sova4, R.raw.sova5, R.raw.sova6, R.raw.sova7, R.raw.sova8, R.raw.sova9, R.raw.sova10, R.raw.sova11, R.raw.sova12, R.raw.sova13, R.raw.sova14, R.raw.sova15};
    int[] abilities = {
            R.raw.sova_ab1, R.raw.sova_ab2, R.raw.sova_ab3, R.raw.sova_ab3v2, R.raw.sovault};


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

    public void play10(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[9]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play11(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[10]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play12(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[11]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play13(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[12]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play14(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[13]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });
    }

    public void play15(View view) {
        mp = MediaPlayer.create(SovaSnds.this, voice[14]);
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
    //Voice wheel (play from server)
    public void playLink(String link) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(link);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                                                  public void onPrepared(MediaPlayer mp) {
                                                      mp.start();
                                                  }
                                              }
            );
            mediaPlayer.prepareAsync();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //wheel1
    public void w1(View v) {
        playLink("https://raw.githubusercontent.com/kalvink/VoicesofValorant/main/sounds/sova/commend.ogg");
    }
    public void w2(View v) {
        playLink("https://raw.githubusercontent.com/kalvink/VoicesofValorant/main/sounds/sova/ily.ogg");
    }
    public void w3(View v) {
        playLink("https://raw.githubusercontent.com/kalvink/VoicesofValorant/main/sounds/sova/quiet.ogg");
    }
    public void w4(View v) {
        playLink("https://raw.githubusercontent.com/kalvink/VoicesofValorant/main/sounds/sova/yes.ogg");
    }
    public void w5(View v) {
        playLink("https://raw.githubusercontent.com/kalvink/VoicesofValorant/main/sounds/sova/ultalmost.ogg");
    }
    public void w6(View v) {
        playLink("https://raw.githubusercontent.com/kalvink/VoicesofValorant/main/sounds/sova/thx.ogg");
    }
    public void w7(View v) {
        playLink("https://raw.githubusercontent.com/kalvink/VoicesofValorant/main/sounds/sova/sry.ogg");
    }

}