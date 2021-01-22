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

    private PageViewModel pageViewModel;
    private SectionsPagerAdapter sectionsPagerAdapter;
    public static int[] tab_fragments = {

            //AGENTS
            //0-1
            R.layout.fragment_sndbreach, R.layout.fragment_sndbreach2,
            //2-3
            R.layout.fragment_sndbrim, R.layout.fragment_sndbrim2,
            //4-5
            R.layout.fragment_sndcypher, R.layout.fragment_sndcypher2,
            //6-7
            R.layout.fragment_sndjett, R.layout.fragment_sndjett2,
            //8-9
            R.layout.fragment_sndkill, R.layout.fragment_sndkill2,
            //10-11
            R.layout.fragment_sndomen, R.layout.fragment_sndomen2,
            //12-13
            R.layout.fragment_sndphoenix, R.layout.fragment_sndphoenix2,
            //14-15
            R.layout.fragment_sndraze, R.layout.fragment_sndraze2,
            //16-17
            R.layout.fragment_sndreyna, R.layout.fragment_sndreyna2,
            //18-19
            R.layout.fragment_sndsage, R.layout.fragment_sndsage2,
            //20-21
            R.layout.fragment_sndskye, R.layout.fragment_sndskye2,
            //22-23
            R.layout.fragment_sndsova, R.layout.fragment_sndsova2,
            //24-25
            R.layout.fragment_sndviper, R.layout.fragment_sndviper2,
            //26-27
            R.layout.fragment_sndyoru, R.layout.fragment_sndyoru2
            //28
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
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
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

            /*
            case 3: {
                root = inflater.inflate(tab_fragments[x + 2], container, false);
                break;
            }*/
        }

        return root;
    }

    public static void setX(int num) {
        x = num;
    }


}

