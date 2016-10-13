package com.example.rosalia.primerparcialtp.Principal;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


import com.example.rosalia.primerparcialtp.Categoria.Categoria;
import com.example.rosalia.primerparcialtp.Categoria.ListaDeCategorias;
import com.example.rosalia.primerparcialtp.MiDialogo;
import com.example.rosalia.primerparcialtp.R;
import com.example.rosalia.primerparcialtp.Registrar.pantallaRegistrar;

/**
 * Created by Jona on 28/09/2016.
 */
public class ControladorPrincipal implements View.OnClickListener {
    private ModeloPrincipal miModelo;
    private VistaPrincpal miVista;
    private Activity miActivity;
    private MiDialogo dialogo;

    public ControladorPrincipal(ModeloPrincipal modelo, Activity actividad, MiDialogo miDialogo){
        miModelo= modelo;
        miActivity= actividad;
        dialogo=miDialogo;
    }
    public Boolean ValidarUsuario(String miClave, String miUsuario){
        Boolean res=false;
        if (miClave==miModelo.getMiClave().toString() || miUsuario==miModelo.getMiUsuario().toString())
        {
            res=true;

        }

        return res;

    }
    private void startActivity(Intent intent){
        miActivity.startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnRegistrarse) {
            Intent intent = new Intent(miActivity, pantallaRegistrar.class);
            startActivity(intent);
        } else if (view.getId() == R.id.btnIngresar) {

            //String clave;
            //String usuario;
            //clave = miVista.traerClave();
            //usuario = miVista.traerUsuario();
            // if (ValidarUsuario(clave, usuario) == false )
            //{
            dialogo.show(getFragmentManager(), "dialogo");
            // miVista.setTextView();

            //}
            //else{
            //Intent intent2 = new Intent(miActivity, Categoria.class);
            //startActivity(intent2);
            // }
            // }
        }
    }

    private FragmentManager getFragmentManager() {
        return null;
    }


}
