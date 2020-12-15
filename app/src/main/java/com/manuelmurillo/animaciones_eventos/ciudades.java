package com.manuelmurillo.animaciones_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ciudades extends AppCompatActivity {

    View fondo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudades);
        this.setTitle("Ciudades");
        fondo2 = (View)findViewById(R.id.activityciudades);
    }

    public void funcioncerrarciudades(View view) {
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("miprograma","ciudades - on start, el programa se recupera de segundo plano, y todavía no es visible para el usuario. Cargo base de datos");
        fondo2.setBackgroundColor(Color.RED);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("miprograma","ciudades  - on resume, Programa visible al usuario, cargo animaciones");
        fondo2.setBackgroundColor(Color.CYAN);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("miprograma","ciudades  - on pause, Programa visible al usuario, cargo animaciones");
        fondo2.setBackgroundColor(Color.MAGENTA);
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("miprograma","ciudades  - on stop, Programa visible al usuario, cargo animaciones");
        fondo2.setBackgroundColor(Color.YELLOW);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("miprograma","ciudades  - on destroy, saco el activity de memoria");

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "no es posible volver", Toast.LENGTH_SHORT).show();

    }
}
