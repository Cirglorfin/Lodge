package com.example.lodge.iu.amigo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lodge.databinding.FragmentAddContactBinding;
import com.example.lodge.viewmodel.AddContactViewModel;
import com.example.lodge.viewmodel.AddContactResult;


public class AddContactFragment extends Fragment {
private FragmentAddContactBinding binding;
    private AddContactViewModel viewModel;


    public AddContactFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddContactBinding.inflate(inflater, container, false);

        binding.btnCrearContacto.setOnClickListener(view ->
                NavHostFragment.findNavController(AddContactFragment.this).navigateUp());

        return binding.getRoot();
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel=new ViewModelProvider(this).get(AddContactViewModel.class);
        //IMPORTANTE ESTAS DOS LiNEAS
        binding.setViewmodel(viewModel);
        binding.setLifecycleOwner(this);
        viewModel.getResult().observe(getViewLifecycleOwner(), new Observer<AddContactResult>() {
            @Override
            public void onChanged(AddContactResult value) {
                switch (value)
                {
                    case USEREMPTY:
                        setUserErrorEmpty();//Método que mostrará el error en TextInputLayout
                        break;
                    case USERNOTFOUND:
                        setUserErrorNotFound();//Método que mostrará el error en TextInputLayout
                        break;
                    default:
                        break;

                }
                     }
        });

    }

    /**
     * Establecer el error en el TextInputLayout Email
     */
    private void setUserErrorEmpty() {
        binding.tilUser.setError("Introduce el usuario");
        binding.tilUser.requestFocus();
        //binding.tilEmail.setError("El email no puede estar vacío");
       // binding.tilEmail.requestFocus();
    }
    private void setUserErrorNotFound() {
        binding.tilUser.setError("No se encontró el usuario");
        binding.tilUser.requestFocus();
        //binding.tilEmail.setError("El email no puede estar vacío");
        // binding.tilEmail.requestFocus();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}