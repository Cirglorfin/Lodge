package com.example.lodge.iu.amigo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.lodge.R;
import com.example.lodge.databinding.FragmentEditContactBinding;
import com.example.lodge.databinding.FragmentEditGroupBinding;

import java.util.Arrays;


public class EditContactFragment extends Fragment {

    private FragmentEditContactBinding binding;



    public EditContactFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEditContactBinding.inflate(inflater, container, false);

        binding.btnEditarContacto.setOnClickListener(view ->
                NavHostFragment.findNavController(this).navigateUp());
        return binding.getRoot();
    }
}