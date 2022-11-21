package com.example.lodge.iu;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lodge.R;
import com.example.lodge.databinding.FragmentSplashBinding;

public class SplashFragment extends Fragment {
    final int WAIT_TIME=2000;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {


          return inflater.inflate(R.layout.fragment_splash, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();
        MainActivity mainActivity = (MainActivity) getActivity();

        mainActivity.Gone();


        // Se puede hacer lambda con alt+intro
        //new Handler().postDelayed(() -> NavHostFragment.findNavController(SplashFragment.this).navigate(R.id.loginFragment),WAIT_TIME);
        new Handler().postDelayed(new Runnable() { // Se puede hacer lambda con alt+intro
            @Override
            public void run() {
                NavHostFragment.findNavController(SplashFragment.this).navigate(R.id.loginFragment);
            }
        },WAIT_TIME);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();



    }

    @Override
    public void onResume() {
        super.onResume();

    }
}