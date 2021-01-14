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

public class Other extends Fragment {

    MediaPlayer mp = new MediaPlayer();
    int[] sounds = {
            R.raw.firstkill, R.raw.secondkill, R.raw.thirdkill, R.raw.fourthkill, R.raw.ace, R.raw.clutch, R.raw.victory, R.raw.defeat};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_other, container, false);


        View first = root.findViewById(R.id.firstkill);
        View second = root.findViewById(R.id.secondkill);
        View third = root.findViewById(R.id.thirdkill);
        View fourth = root.findViewById(R.id.fourthkill);
        View ace = root.findViewById(R.id.fifthkill);
        View clutch = root.findViewById(R.id.clutch);
        View victory = root.findViewById(R.id.victory);
        View defeat = root.findViewById(R.id.defeat);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[0]);
                mp.start();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[1]);
                mp.start();
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[2]);
                mp.start();
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[3]);
                mp.start();
            }
        });

        ace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[4]);
                mp.start();
            }
        });
        clutch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[5]);
                mp.start();
            }
        });
        victory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[6]);
                mp.start();
            }
        });
        defeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(getContext(), sounds[7]);
                mp.start();
            }
        });
        return root;
    }


}