package com.example.voicesofvalorant.ui.agents;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.voicesofvalorant.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Weapons extends Fragment {
    private AdView mAdView;
    MediaPlayer mp = new MediaPlayer();
    int[] sounds = {
            R.raw.classic_equip, R.raw.classic_spray, R.raw.classic_reload, R.raw.shortyequip, R.raw.shortyspray, R.raw.shortyreload, R.raw.frenzyequip, R.raw.frenzyspray, R.raw.frenzyreload,
            R.raw.ghostequip, R.raw.ghostspray, R.raw.ghostreload, R.raw.sheriffequip, R.raw.sheriffspray, R.raw.sheriffreload, R.raw.stingerequip, R.raw.stingerspray, R.raw.stingerreload,
            R.raw.spectreequip, R.raw.spectrespray, R.raw.spectrereload, R.raw.bucky_equip, R.raw.bucky_spray, R.raw.bucky_reload, R.raw.judgeequip, R.raw.judgespray, R.raw.judgereload,
            R.raw.bulldog_equip, R.raw.bulldog_spray, R.raw.bulldog_reload, R.raw.guardianequip, R.raw.guardianspray, R.raw.guardianreload, R.raw.phantom_equip, R.raw.phantomspray, R.raw.phantomreload,
            R.raw.vandalequip, R.raw.vandalspray, R.raw.vandalreload, R.raw.marshalequip, R.raw.marshalspray, R.raw.marshalreload, R.raw.operatorequip, R.raw.operatorspray, R.raw.operatorreload,
            R.raw.ares_equip, R.raw.ares_spray, R.raw.ares_reload, R.raw.odinequip, R.raw.odinspray, R.raw.odinreload, R.raw.knifeequip, R.raw.knifeswing, R.raw.knifebackstab};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_weapon, container, false);


        View ce = root.findViewById(R.id.classicequip);
        View cs = root.findViewById(R.id.classicshoot);
        View cr = root.findViewById(R.id.classicreload);
        View se = root.findViewById(R.id.shortyequip);
        View ss = root.findViewById(R.id.shortyshoot);
        View sr = root.findViewById(R.id.shortyreload);
        View fe = root.findViewById(R.id.fequip);
        View fs = root.findViewById(R.id.fshoot);
        View fr = root.findViewById(R.id.freload);
        View ge = root.findViewById(R.id.gequip);
        View gs = root.findViewById(R.id.gshoot);
        View gr = root.findViewById(R.id.greload);
        View sheriffe = root.findViewById(R.id.sheriffe);
        View sheriffs = root.findViewById(R.id.sheriffs);
        View sheriffr = root.findViewById(R.id.sheriffr);
        View stingere = root.findViewById(R.id.stingere);
        View stingers = root.findViewById(R.id.stingers);
        View stingerr = root.findViewById(R.id.stingerr);
        View spectree = root.findViewById(R.id.spectree);
        View spectres = root.findViewById(R.id.spectres);
        View spectrer = root.findViewById(R.id.spectrer);
        View buckye = root.findViewById(R.id.buckye);
        View buckys = root.findViewById(R.id.buckys);
        View buckyr = root.findViewById(R.id.buckyr);
        View judgee = root.findViewById(R.id.judgee);
        View judges = root.findViewById(R.id.judges);
        View judger = root.findViewById(R.id.judger);
        View bulldoge = root.findViewById(R.id.bulldoge);
        View bulldogs = root.findViewById(R.id.bulldogs);
        View bulldogr = root.findViewById(R.id.bulldogr);
        View guardiane = root.findViewById(R.id.guardiane);
        View guardians = root.findViewById(R.id.guardians);
        View guardianr = root.findViewById(R.id.guardianr);
        View phantome = root.findViewById(R.id.phantome);
        View phantoms = root.findViewById(R.id.phantoms);
        View phantomr = root.findViewById(R.id.phantomr);
        View vandale = root.findViewById(R.id.vandale);
        View vandals = root.findViewById(R.id.vandals);
        View vandalr = root.findViewById(R.id.vandalr);
        View marshale = root.findViewById(R.id.marshale);
        View marshals = root.findViewById(R.id.marshals);
        View marshalr = root.findViewById(R.id.marshalr);
        View operatore = root.findViewById(R.id.operatore);
        View operators = root.findViewById(R.id.operators);
        View operatorr = root.findViewById(R.id.operatorr);
        View arese = root.findViewById(R.id.arese);
        View aress = root.findViewById(R.id.aress);
        View aresr = root.findViewById(R.id.aresr);
        View odine = root.findViewById(R.id.odine);
        View odins = root.findViewById(R.id.odins);
        View odinr = root.findViewById(R.id.odinr);
        View knifee = root.findViewById(R.id.knifee);
        View knifeswing = root.findViewById(R.id.knifeswing);
        View knifestab = root.findViewById(R.id.knifestab);

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[0]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[1]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[2]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[3]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[4]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[5]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[6]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        fs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[7]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[8]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        ge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[9]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[10]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        gr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[11]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });


        sheriffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[12]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        sheriffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[13]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        sheriffr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[14]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        stingere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[15]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        stingers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[16]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        stingerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[17]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        spectree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[18]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        spectres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[19]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        spectrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[20]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });


        buckye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[21]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        buckys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[22]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        buckyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[23]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        judgee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[24]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        judges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[25]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        judger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[26]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });


        bulldoge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[27]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        bulldogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[28]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        bulldogr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[29]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        guardiane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[30]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        guardians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[31]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        guardianr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[32]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        phantome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[33]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        phantoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[34]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        phantomr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[35]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        vandale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[36]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        vandals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[37]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        vandalr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[38]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        marshale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[39]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        marshals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[40]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        marshalr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[41]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        operatore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[42]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[43]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        operatorr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[44]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        arese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[45]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        aress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[46]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        aresr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[47]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        odine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[48]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        odins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[49]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        odinr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[50]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        knifee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[51]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        knifeswing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[52]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });
        knifestab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[53]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }

                    ;
                });
            }
        });

        // MOBILE ADS
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = (AdView) root.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        return root;
    }


}