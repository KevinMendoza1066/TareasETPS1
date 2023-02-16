package com.example.varentera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

TextView var;
EditText Numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Numero=findViewById(R.id.etNumero);

        var = findViewById(R.id.textView3);
    }
    public void Procesar(View view){
        int N = Integer.valueOf( Numero.getText().toString());
        var.setText("");
        var.append("Valor inicial de N = "+N+"\n");
        N=N+77;
        var.append("N + 77 = "+N +"\n");
        N=N-3;
        var.append("N - 3 = "+N+"\n");
        N=N*2;
        var.append("N * 2 = "+N+"\n");

    }
}