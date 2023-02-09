package com.example.bienvenida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etNombre;
    private TextView tvMensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=findViewById(R.id.etNombre);
        tvMensaje=findViewById(R.id.tvMensaje);
    }
    public void ShowMessage(View View){
        String Mensaje ="Bienvenido,";
        String Nombre = etNombre.getText().toString();
        Mensaje= Mensaje + Nombre;
        tvMensaje.setText(Mensaje);
    }
}