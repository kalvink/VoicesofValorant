package com.example.voicesofvalorant.ui.weapon;

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

public class WeaponFragment extends Fragment {

    private WeaponViewModel weaponViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        weaponViewModel =
                ViewModelProviders.of(this).get(WeaponViewModel.class);
        View root = inflater.inflate(R.layout.fragment_weapon, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        weaponViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}