package com.example.lodge.viewmodel;

import android.text.TextUtils;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.lodge.data.repository.Usuarios;

public class AddContactViewModel extends ViewModel {
    public MutableLiveData<String> usuario=new MutableLiveData<>();
    public MutableLiveData<String> contacto=new MutableLiveData<>();
    //Los siguientes LiveData tendrán observadores en la Activity/Fragment y
    //se debe implementar un método de obtención
    private MutableLiveData<AddContactResult> result;
    private MutableLiveData<Enum> errorEmailFormat=new MutableLiveData<>();
    /**
     * Este método es el encargado de comprobar que todas las reglas de negocio se cumplen.
     * Si es correcto->consulta al repositorio.
     */
    public void validateCredentials(){
        Usuarios lista=new Usuarios();
        if(TextUtils.isEmpty(usuario.getValue()))
        {
            result.setValue(AddContactResult.USEREMPTY);
        }

        else if(!lista.getInstance().getNombresUsuarios().contains(usuario.getValue()))
        {
            result.setValue(AddContactResult.USERNOTFOUND);
        }

    }
    public MutableLiveData<AddContactResult> getResult()
    {
        if(result==null)
        {result=new MutableLiveData<>();

        }
        return result;
    }

}
