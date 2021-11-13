package com.practica.intentimplicito02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText latitud, longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        latitud = (EditText) findViewById(R.id.editText_latitud);
        longitud = (EditText) findViewById(R.id.editTextText_longitud);
    }

    public void googleMaps(View view) {

        String coordenadas = "geo:";
        String lat = latitud.getText().toString();
        String longi = longitud.getText().toString();

        coordenadas = coordenadas.concat(lat + "," + longi);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(coordenadas));

        startActivity(intent);
    }
}

































