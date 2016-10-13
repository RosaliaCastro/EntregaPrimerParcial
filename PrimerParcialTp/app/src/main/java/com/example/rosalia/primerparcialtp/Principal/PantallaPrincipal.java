package com.example.rosalia.primerparcialtp.Principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rosalia.primerparcialtp.MiDialogo;
import com.example.rosalia.primerparcialtp.R;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        MiDialogo miDialogo = new MiDialogo();
        ModeloPrincipal modeloPrincipal = new ModeloPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(modeloPrincipal,this, miDialogo);
        VistaPrincpal vistaPrincpal = new VistaPrincpal(modeloPrincipal,this,controladorPrincipal);
        miDialogo.show(getFragmentManager(), "");



        }


}
