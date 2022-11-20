package com.example.lodge.iu.grupo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.lodge.R;
import com.example.lodge.databinding.FragmentAddGroupBinding;
import com.example.lodge.databinding.FragmentEditGroupBinding;

import java.util.Arrays;

public class EditGroupFragment extends Fragment {

private FragmentEditGroupBinding binding;

    public EditGroupFragment() {
        // Required empty public constructor
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEditGroupBinding.inflate(inflater, container, false);
        ArrayAdapter<String> tipo=new ArrayAdapter<String>(getContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        tipo.setDropDownViewResource(R.layout.spinner_dropdown_item);

        tipo.addAll(Arrays.asList("Público","Privado"));
        binding.spinner.setAdapter(tipo);
        binding.btnCrearGrupo.setOnClickListener(view ->
                NavHostFragment.findNavController(this).navigateUp());
        return binding.getRoot();  }
}