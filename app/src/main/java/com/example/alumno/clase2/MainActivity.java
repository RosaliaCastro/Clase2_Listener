package com.example.alumno.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto = (TextView) findViewById(R.id.texto);
        texto.setText("cambio el texto");

        Button bot1 = (Button) findViewById(R.id.boton1);
        bot1.setText("Cancelar");
        View.OnClickListener listener = new MyListener();
        bot1.setOnClickListener(listener);

    }
}
