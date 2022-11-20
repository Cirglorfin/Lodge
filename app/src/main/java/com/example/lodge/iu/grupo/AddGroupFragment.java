package com.example.lodge.iu.grupo;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.lodge.R;

import com.example.lodge.databinding.FragmentAddGroupBinding;
import com.example.lodge.databinding.FragmentLoginBinding;
import com.example.lodge.iu.MainActivity;

import java.util.Arrays;

public class AddGroupFragment extends Fragment {
    private FragmentAddGroupBinding binding;


    public AddGroupFragment() {
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
        // Inflate the layout for this fragment
        binding = FragmentAddGroupBinding.inflate(inflater, container, false);
        ArrayAdapter<String> tipo=new ArrayAdapter<String>(getContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
       tipo.setDropDownViewResource(R.layout.spinner_dropdown_item);

        tipo.addAll(Arrays.asList("Público","Privado"));
        binding.spinner.setAdapter(tipo);
        binding.btnCrearGrupo.setOnClickListener(view ->
                NavHostFragment.findNavController(this).navigateUp());
        return binding.getRoot();
    }
}