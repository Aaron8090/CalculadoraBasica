package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btNUm0, btNUm1, btNUm2, btNUm3, btNUm4, btNUm5, btNUm6, btNUm7, btNUm8, btNUm9, btAC, btCambiodeSigno, Porcentaje, Divicion, btMultiplicacion, btResta, btSuma, btPunto, btIgual;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNUm0 = findViewById(R.id.btNum0);
        btNUm1 = findViewById(R.id.btNum1);
        btNUm2 = findViewById(R.id.btNum2);
        btNUm3 = findViewById(R.id.btNum3);
        btNUm4 = findViewById(R.id.btNum4);
        btNUm5 = findViewById(R.id.btNum5);
        btNUm6 = findViewById(R.id.btNum6);
        btNUm7 = findViewById(R.id.btNum7);
        btNUm8 = findViewById(R.id.btNum8);
        btNUm9 = findViewById(R.id.btNum9);
        btAC = findViewById(R.id.btAC);
        btCambiodeSigno = findViewById(R.id.btCambiodeSigno);
        Porcentaje = findViewById(R.id.Porcentaje);
        Divicion = findViewById(R.id.Division);
        btMultiplicacion = findViewById(R.id.btMultiplicacion);
        btResta = findViewById(R.id.btResta);
        btSuma = findViewById(R.id.btSuma);
        btPunto = findViewById(R.id.btPunto);
        btIgual = findViewById(R.id.btIgual);
        tvResultado = findViewById(R.id.tvResultado);

    }

}