package com.example.voicesofvalorant.ui.agents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.voicesofvalorant.R;

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
                Log.i("A", "test");
            }
        });
        cypher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        kill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        omen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        phoenix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        raze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        reyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        skye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        sova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        viper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("A", "test");
            }
        });
        return root;
    }
}