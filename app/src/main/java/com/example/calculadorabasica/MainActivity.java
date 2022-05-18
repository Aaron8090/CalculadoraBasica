package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Float> Operacion = new ArrayList<Float>();
    String num;
    Button btNUm0, btNUm1, btNUm2, btNUm3, btNUm4, btNUm5, btNUm6, btNUm7, btNUm8, btNUm9, btAC, btCambiodeSigno, Porcentaje, Divicion, btMultiplicacion, btResta, btSuma, btPunto, btIgual;
    TextView tvResultado, tvOperacion;

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

        btNUm0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"0");
                num = num + "0";
            }
        });
        btNUm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"1");
                num = num + "1";
            }
        });
        btNUm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"2");
                num = num + "2";
            }
        });
        btNUm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"3");
                num = num + "3";
            }
        });
        btNUm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"4");
                num = num + "4";
            }
        });
        btNUm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"5");
                num = num + "5";
            }
        });
        btNUm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"6");
                num = num + "6";
            }
        });
        btNUm7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"7");
                num = num + "7";
            }
        });
        btNUm8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"8");
                num = num + "8";
            }
        });
        btNUm9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"9");
                num = num + "9";
            }
        });
        btAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText("");
                tvOperacion.setText("");

            }
        });

        Porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+"+");
            }
        });

        Divicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText("");
                tvOperacion.setText(tvOperacion.getText() + num + "/");
                num = "";
            }
        });

        btMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText("");
                tvOperacion.setText(tvOperacion.getText() + num + "*");
                num = "";
            }
        });

        btResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText("");
                tvOperacion.setText(tvOperacion.getText() + num + "-");
                num = "";
            }
        });

        btSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText("");
                tvOperacion.setText(tvOperacion.getText() + num + "+");
                num = "";
            }
        });

        btPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado.getText()+".");
            }
        });

        btIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }

}