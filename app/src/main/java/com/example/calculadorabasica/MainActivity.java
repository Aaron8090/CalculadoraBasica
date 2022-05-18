package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public Button btNUm0, btNUm1, btNUm2, btNUm3, btNUm4, btNUm5, btNUm6, btNUm7, btNUm8, btNUm9, btAC, btCambiodeSigno, Porcentaje, Divicion, btMultiplicacion, btResta, btSuma, btPunto, btIgual;
    TextView tvResultado, tvOperacion;
    double n1;
    double n2;
    double total = 0;
    char opera;

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
        tvOperacion = findViewById(R.id.tvOperacion);

    }

    public void btNUM7(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"7";
        tvResultado.setText(btn);
    }

    public void btNUM8(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"8";
        tvResultado.setText(btn);
    }

    public void btNUM9(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"9";
        tvResultado.setText(btn);
    }

    public void btNUM4(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"4";
        tvResultado.setText(btn);
    }

    public void btNUM5(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"5";
        tvResultado.setText(btn);
    }

    public void btNUM6(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"6";
        tvResultado.setText(btn);
    }

    public void btNUM1(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"1";
        tvResultado.setText(btn);
    }

    public void btNUM2(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"2";
        tvResultado.setText(btn);
    }

    public void btNUM3(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"3";
        tvResultado.setText(btn);
    }

    public void btNUM0(View view) {
        String btn = tvResultado.getText().toString();
        btn = btn+"0";
        tvResultado.setText(btn);
    }

    public void tvREsultado(View view) {
    }

    public void btDivicion(View view) {
        if(tvResultado.getText().toString() != "") {
            n1 = Double.parseDouble(tvResultado.getText().toString());
            opera = '/';
            tvResultado.setText("");
        }
    }

    public void btREsta(View view) {
        if(tvResultado.getText().toString() != "") {
            n1 = Double.parseDouble(tvResultado.getText().toString());
            opera = '-';
            tvResultado.setText("");
        }
    }

    public void btMUltiplicacion(View view) {
        if(tvResultado.getText().toString() != "") {
            n1 = Double.parseDouble(tvResultado.getText().toString());
            opera = '*';
            tvResultado.setText("");
        }
    }

    public void btSUma(View view) {
        if(tvResultado.getText().toString() != "") {
            n1 = Double.parseDouble(tvResultado.getText().toString());
            opera = '+';
            tvResultado.setText("");
        }
    }

    public void btPUnto(View view) {
        String btn = tvResultado.getText().toString();
        if(!btn.contains(".")) {
            btn = btn+".";
        }
        tvResultado.setText(btn);
    }

    public void btIGual(View view) {
        if (tvResultado.getText().toString() != "") {
            n2 = Double.parseDouble(tvResultado.getText().toString());
            if (opera == '+') {
                total = n1 + n2;
            } else if (opera == '-') {
                total = n1 - n2;
            } else if (opera == '*') {
                total = n1 * n2;
            } else {
                total = n1 / n2;
            }
            tvResultado.setText(Double.toString(total));
            n1 = 0.0;
            n2 = 0.0;
        }
    }

    public void btAC(View view) {
        tvResultado.setText("");
        total = 0;
    }
}