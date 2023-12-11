package com.example.loginactivity_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class radioButton extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = findViewById(R.id.radioGroup);
    }

    public void validardatos(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        CheckBox checkBox = findViewById(R.id.cb_uno);
        TextView resultTextView = findViewById(R.id.textView2);


        if (selectedId == -1 && !checkBox.isChecked()) {
            Toast.makeText(this, "No ha seleccionado", Toast.LENGTH_SHORT).show();
            resultTextView.setText("No ha seleccionado");
        } else {
            StringBuilder result = new StringBuilder("Resultado: ");

            if (selectedId != -1) {
                radioButton = findViewById(selectedId);
                result.append(radioButton.getText()).append(" ");
            }

            if (checkBox.isChecked()) {
                result.append("CheckBox seleccionado");
            }

            Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();
            resultTextView.setText(result.toString());
        }
    }
    public void home(View v) {
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }
}