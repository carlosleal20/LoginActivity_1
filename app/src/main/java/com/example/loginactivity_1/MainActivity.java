package com.example.loginactivity_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private Button btnRadio;
    private ProgressBar pbCargando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRadio = findViewById(R.id.btn_radio);
        pbCargando = findViewById(R.id.pb_cargando);


        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbCargando.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        pbCargando.setVisibility(View.GONE);
                    }
                }, 5000);
            }
        });
    }
    public void ingresar(View v) {
        Intent ingresar = new Intent(this, radioButton.class);
        startActivity(ingresar);
    }
}