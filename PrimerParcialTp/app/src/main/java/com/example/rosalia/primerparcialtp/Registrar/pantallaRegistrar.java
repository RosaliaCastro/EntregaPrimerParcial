package com.example.rosalia.primerparcialtp.Registrar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.rosalia.primerparcialtp.Categoria.Categoria;
import com.example.rosalia.primerparcialtp.Categoria.ListaDeCategorias;
import com.example.rosalia.primerparcialtp.R;

public class pantallaRegistrar extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.opcion1) {
            Log.d("Menu", "Opcion1");
            finishAffinity();
            return true;}
        else
        if (id == R.id.opcion2){
            Log.d("Menu", "Opcion2");
            return true;}
        else
        if (id == R.id.opcion3){
            Log.d("Menu", "Opcion3");
            Intent intent3 = new Intent(this,ListaDeCategorias.class);
            startActivity(intent3);
            return true;}
        else
        if (id == R.id.opcion4){
            Log.d("Menu", "Opcion4");
            return true;}

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registrar);
        ModeloRegistrar modeloRegistrar = new  ModeloRegistrar();
        ControladorRegistrar controladorRegistrar= new ControladorRegistrar(modeloRegistrar,this);
        VistaRegistrar vistaRegistrar = new VistaRegistrar(modeloRegistrar,  this, controladorRegistrar);
    }
}
