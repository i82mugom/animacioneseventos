package com.manuelmurillo.animaciones_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View fondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("miprograma","on create, main activity, el activity se prepara, cargo string y datos");
        fondo = (View)findViewById(R.id.activityprincipal);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("miprograma","on start, el programa se recupera de segundo plano, y todavía no es visible para el usuario. Cargo base de datos");
        fondo.setBackgroundColor(Color.RED);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("miprograma","on resume, Programa visible al usuario, cargo animaciones");
        fondo.setBackgroundColor(Color.GREEN);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("miprograma","on pause, Programa visible al usuario, cargo animaciones");
        fondo.setBackgroundColor(Color.GRAY);
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("miprograma","on stop, Programa visible al usuario, cargo animaciones");
        fondo.setBackgroundColor(Color.YELLOW);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("miprograma","informacion - on destroy, saco el activity de memoria");

    }

    public void funcionirainformacion(View view) {

        Intent cargarinformacion = new Intent(this, informacion.class);
        startActivity(cargarinformacion);

    }

    public void funcioniraciudad(View view) {
        Intent cargarciudades = new Intent(this, ciudades.class);
        startActivity(cargarciudades);

    }
}
