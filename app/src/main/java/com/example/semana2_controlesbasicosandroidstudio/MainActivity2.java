package com.example.semana2_controlesbasicosandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText eNombre =
                (EditText)findViewById(R.id.etNombre2);
        final EditText eEdad = (EditText)findViewById(R.id.etApellido);
        Button bEnviar = (Button)findViewById(R.id.btEnviarDatosfinal);
        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText().toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("pNombre",nombre);
                pasarDatos.putString("pEdad",edad);
                Intent siga = new
                        Intent(MainActivity2.this,MainActivity3.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);
            }
        });
    }
}