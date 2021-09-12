package com.vov.voicesofvalorant.ui.agents.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.vov.voicesofvalorant.R;


import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProviders;


public class PlaceholderFragment extends Fragment {

    private static int x;
    private static final String ARG_SECTION_NUMBER = "section_number";

    private SectionsPagerAdapter sectionsPagerAdapter;
    public static int[] tab_fragments = {

            //AGENTS
            //0-2
            R.layout.fragment_sndbreach, R.layout.fragment_sndbreach2, R.layout.fragment_sndbreach3,
            //3-5
            R.layout.fragment_sndbrim, R.layout.fragment_sndbrim2, R.layout.fragment_sndbrim3,
            //6-8
            R.layout.fragment_sndcypher, R.layout.fragment_sndcypher2, R.layout.fragment_sndcypher3,
            //9-11
            R.layout.fragment_sndjett, R.layout.fragment_sndjett2, R.layout.fragment_sndjett3,
            //12-14
            R.layout.fragment_sndkill, R.layout.fragment_sndkill2, R.layout.fragment_sndkill3,
            //15-17
            R.layout.fragment_sndomen, R.layout.fragment_sndomen2, R.layout.fragment_sndomen3,
            //18-20
            R.layout.fragment_sndphoenix, R.layout.fragment_sndphoenix2, R.layout.fragment_sndphoenix3,
            //21-23
            R.layout.fragment_sndraze, R.layout.fragment_sndraze2, R.layout.fragment_sndraze3,
            //24-26
            R.layout.fragment_sndreyna, R.layout.fragment_sndreyna2, R.layout.fragment_sndreyna3,
            //27-29
            R.layout.fragment_sndsage, R.layout.fragment_sndsage2, R.layout.fragment_sndsage3,
            //30-32
            R.layout.fragment_sndskye, R.layout.fragment_sndskye2, R.layout.fragment_sndskye3,
            //33-35
            R.layout.fragment_sndsova, R.layout.fragment_sndsova2, R.layout.fragment_sndsova3,
            //36-38
            R.layout.fragment_sndviper, R.layout.fragment_sndviper2, R.layout.fragment_sndviper3,
            //39-41
            R.layout.fragment_sndyoru, R.layout.fragment_sndyoru2, R.layout.fragment_sndyoru3,
            //42-44
            R.layout.fragment_sndastra, R.layout.fragment_sndastra2, R.layout.fragment_sndastra3,
            //45-47
            R.layout.fragment_sndkayo, R.layout.fragment_sndkayo2, R.layout.fragment_sndkayo3
            //48-50

    };


    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    View root;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 1: {
                root = inflater.inflate(tab_fragments[x], container, false);
                break;
            }
            case 2: {
                root = inflater.inflate(tab_fragments[x + 1], container, false);
                break;
            }
            case 3: {
                root = inflater.inflate(tab_fragments[x + 2], container, false);
                break;
            }
        }

        return root;
    }

    public static void setX(int num) {
        x = num;
    }


}

