package com.example.rosalia.primerparcialtp.Registrar;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.example.rosalia.primerparcialtp.Categoria.ListaDeCategorias;
import com.example.rosalia.primerparcialtp.R;

/**
 * Created by Jona on 05/10/2016.
 */
public class ControladorRegistrar implements View.OnClickListener {
    ModeloRegistrar miModelo;
    Activity miActivity;

    public ControladorRegistrar(ModeloRegistrar mod, Activity actividad){
        miModelo = mod;
        miActivity= actividad;
    }

    private void startActivity(Intent intent){
        miActivity.startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.btnNuevo){

            Intent intent3 = new Intent(miActivity, ListaDeCategorias.class);
            startActivity(intent3);
        }

    }
}

