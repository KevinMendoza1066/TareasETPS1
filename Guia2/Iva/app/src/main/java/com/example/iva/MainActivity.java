package com.example.iva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNumero;
    TextView tvIva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumero=findViewById(R.id.etNumero);
        tvIva=findViewById(R.id.tvIva);
    }
    public void CalcularIva(View view){
        Double Iva = 0.134;
        Double Monto = Double.parseDouble(etNumero.getText().toString());
        Double PrecioIva = Monto + (Monto * Iva);

        tvIva.setText("El precio con IVA es de : " + PrecioIva);
    }
}