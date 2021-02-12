package com.vov.voicesofvalorant.ui.agents;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.vov.voicesofvalorant.R;

public class AgentsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AgentsViewModel agentsViewModel = ViewModelProviders.of(this).get(AgentsViewModel.class);

        View root = inflater.inflate(R.layout.fragment_agents, container, false);

        View breach = root.findViewById(R.id.breachcv);
        View brim = root.findViewById(R.id.brimcv);
        View cypher = root.findViewById(R.id.cyphercv);
        View jett = root.findViewById(R.id.jettcv);
        View kill = root.findViewById(R.id.killcv);
        View omen = root.findViewById(R.id.omencv);
        View phoenix = root.findViewById(R.id.phoenixcv);
        View raze = root.findViewById(R.id.razecv);
        View reyna = root.findViewById(R.id.reynacv);
        View sage = root.findViewById(R.id.sagecv);
        View skye = root.findViewById(R.id.skyecv);
        View sova = root.findViewById(R.id.sovacv);
        View viper = root.findViewById(R.id.vipercv);
        View yoru = root.findViewById(R.id.yorucv);

        breach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), BreachSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation
            }
        });
        brim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), BrimSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        cypher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), CypherSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), JettSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        kill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), KillSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        omen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), OmenSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        phoenix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), PhoenixSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        raze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), RazeSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        reyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), ReynaSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), SageSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        skye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), SkyeSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        sova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), SovaSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation

            }
        });
        viper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), ViperSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation
            }
        });
        yoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), YoruSnds.class));
                Animatoo.animateSlideLeft(view.getContext());  //fire the slide animation
            }
        });
        return root;
    }
}