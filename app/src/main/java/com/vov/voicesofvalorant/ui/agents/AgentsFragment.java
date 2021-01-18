package com.vov.voicesofvalorant.ui.agents;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.vov.voicesofvalorant.R;

public class AgentsFragment extends Fragment {

    private AgentsViewModel agentsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        agentsViewModel =
                ViewModelProviders.of(this).get(AgentsViewModel.class);
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

        breach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), BreachSnds.class));
            }
        });
        brim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), BrimSnds.class));
            }
        });
        cypher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), CypherSnds.class));
            }
        });

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), JettSnds.class));
            }
        });
        kill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), KillSnds.class));
            }
        });
        omen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), OmenSnds.class));
            }
        });
        phoenix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), PhoenixSnds.class));
            }
        });
        raze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), RazeSnds.class));
            }
        });
        reyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), ReynaSnds.class));
            }
        });
        sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), SageSnds.class));
            }
        });
        skye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), SkyeSnds.class));
            }
        });
        sova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), SovaSnds.class));
            }
        });
        viper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), ViperSnds.class));
            }
        });
        return root;
    }
}