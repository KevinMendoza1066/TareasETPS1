package com.example.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvResult;
EditText etNum,etNum2;
RadioButton rbSuma,rbResta,rbMultiplicacion,rbDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum =findViewById(R.id.etNumero);
        etNum2 =findViewById(R.id.etNumero2);
        rbSuma =findViewById(R.id.rbSuma);
        rbResta =findViewById(R.id.rbResta);
        rbMultiplicacion =findViewById(R.id.rbMultiplicacion);
        rbDivision =findViewById(R.id.rbDivision);

    }

    public void Mostrar(View view){
        double num1 = Double.parseDouble(etNum.getText().toString());
        double num2 = Double.parseDouble(etNum2.getText().toString());
        double Valor;
        if(rbSuma.isChecked()){
            Valor = num1+num2;
        }else if (rbResta.isChecked()){
            Valor = num1-num2;
        }else if(rbMultiplicacion.isChecked()){
            Valor = num1*num2;
        }else {
            Valor = num1/num2;
        }
        MostrarAlerta(Valor);

    }
    public void MostrarAlerta(double valor){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("El valor  es : " + valor)
                .setTitle("Resultado");
        AlertDialog dialog = builder.create();
        dialog.show();
    }


}