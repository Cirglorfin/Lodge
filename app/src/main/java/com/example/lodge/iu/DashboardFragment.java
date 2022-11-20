package com.example.lodge.iu;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lodge.R;
import com.example.lodge.databinding.FragmentDashboardBinding;



public class DashboardFragment extends Fragment {
FragmentDashboardBinding binding;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);

          return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnEditContact.setOnClickListener(v ->NavHostFragment.findNavController(this).navigate(R.id.editContactFragment));
        binding.btnAddContacto.setOnClickListener(v ->NavHostFragment.findNavController(this).navigate(R.id.addContactFragment));
        binding.btnEditGrupo.setOnClickListener(v ->NavHostFragment.findNavController(this).navigate(R.id.editGroupFragment));
       binding.btnAddGrupo.setOnClickListener(v ->NavHostFragment.findNavController(this).navigate(R.id.addGroupFragment));
       // binding.imgDependency.setOnClickListener(v ->NavHostFragment.findNavController(this).navigate(R.id.dependencyListFragment));
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}