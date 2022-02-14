package com.example.semana2_controlesbasicosandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        siguiente = (Button)findViewById(R.id.btCambiaPantalla);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent (MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

        final EditText tNombre = (EditText)this.findViewById(R.id.etNombre);
        final EditText tApellido = (EditText)this.findViewById(R.id.etApellido);
        Button bDatos = (Button)this.findViewById(R.id.btEnviarDatos);

        bDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();

                Toast.makeText(getApplicationContext(),"Tu nombre es: "+nom+"  "+ape,Toast.LENGTH_LONG).show();

            }
        });
    }
}

