package com.raulcorvo.serviciomusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button arrancar = (Button) findViewById(R.id.boton_arrancar);
        arrancar.setOnClickListener(this);
        Button detener = (Button) findViewById(R.id.boton_detener);
        detener.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ServicioMusica.class);
        switch (v.getId()){
            case R.id.boton_arrancar:
                startService(intent);
                break;
            case R.id.boton_detener:
                stopService(intent);
                break;
        }
    }
}
