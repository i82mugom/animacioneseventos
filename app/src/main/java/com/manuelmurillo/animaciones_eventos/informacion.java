package com.manuelmurillo.animaciones_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class informacion extends AppCompatActivity {
    View fondo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        this.setTitle("Información");
        fondo2 = (View)findViewById(R.id.activityinformacion);
    }

    public void funcioncerrarinformacion(View view) {
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("miprograma","informacion - on start, el programa se recupera de segundo plano, y todavía no es visible para el usuario. Cargo base de datos");
        fondo2.setBackgroundColor(Color.RED);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("miprograma","informacion - on resume, Programa visible al usuario, cargo animaciones");
        fondo2.setBackgroundColor(Color.GREEN);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("miprograma","informacion - on pause, Programa visible al usuario, cargo animaciones");
        fondo2.setBackgroundColor(Color.GRAY);
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("miprograma","informacion - on stop, Programa visible al usuario, cargo animaciones");
        fondo2.setBackgroundColor(Color.YELLOW);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("miprograma","informacion - on destroy, saco el activity de memoria");

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "no es posible volver", Toast.LENGTH_SHORT).show();
    }
}
