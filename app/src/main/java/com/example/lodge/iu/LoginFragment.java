package com.example.lodge.iu;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lodge.R;
import com.example.lodge.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;

    @Override
    public void onStart() {
        super.onStart();
        MainActivity mainActivity = (MainActivity) getActivity();

        mainActivity.Visible();
        mainActivity.Flecha();
        mainActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
      binding = FragmentLoginBinding.inflate(inflater, container, false);
        binding.btnLogin.setOnClickListener(view ->
                NavHostFragment.findNavController(this).navigate(R.id.dashboardFragment));

        binding.btnRegistrar.setOnClickListener(view ->
                NavHostFragment.findNavController(this).navigate(R.id.action_loginFragment_to_singUpFragment));
         return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        binding = null;
    }

}