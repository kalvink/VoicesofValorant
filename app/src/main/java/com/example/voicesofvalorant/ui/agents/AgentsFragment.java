package com.example.voicesofvalorant.ui.agents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.voicesofvalorant.R;

public class AgentsFragment extends Fragment {

    private AgentsViewModel agentsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        agentsViewModel =
                ViewModelProviders.of(this).get(AgentsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_agents, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        agentsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}