package com.centec.appprova3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    EditText etEtanol, etGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        etEtanol = findViewById(R.id.etEtanol);
        etGasolina = findViewById(R.id.etGasolina);
    }

    public void calcular(View view){
        String etanol=etEtanol.getText().toString();
        String gasolina=etGasolina.getText().toString();

        double precoE=Double.parseDouble(etanol);
        double precoG=Double.parseDouble(gasolina);

        double resultado = precoE/precoG;

        if(resultado<=0.7){
            tvResultado.setText(String.format("Resultado: Etanol é melhor."));
        }else{
            tvResultado.setText(String.format("Resultado: Gasolina é melhor."));
        }



    }
}