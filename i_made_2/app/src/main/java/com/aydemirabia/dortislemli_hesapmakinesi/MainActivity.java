package com.aydemirabia.dortislemli_hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Number1EditText1;
    EditText Number2EditText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1EditText1 = findViewById(R.id.editText1);
        Number2EditText = findViewById(R.id.editText2);
        resultTextView = findViewById(R.id.resultText);
    }

    public void btnPlus(View view){
        if(Number1EditText1.getText().toString().matches("") || Number2EditText.getText().toString().matches("")){
            resultTextView.setText("Please, Enter Number!");
        }
        else{
            int num1 = Integer.parseInt(Number1EditText1.getText().toString());
            int num2 = Integer.parseInt(Number2EditText.getText().toString());

            int result = num1 + num2;
            resultTextView.setText("Result : " + result);
        }
    }
    public void btnMinus(View view){
        if(Number1EditText1.getText().toString().matches("") || Number2EditText.getText().toString().matches("")){
            resultTextView.setText("Please, Enter Number");
        }
        else{
            int num1 = Integer.parseInt(Number1EditText1.getText().toString());
            int num2 = Integer.parseInt(Number2EditText.getText().toString());

            int result = num1 - num2;
            resultTextView.setText("Result : " + result);
        }
    }
    public void btnImpact(View view){
        if(Number1EditText1.getText().toString().matches("") || Number2EditText.getText().toString().matches("")){
            resultTextView.setText("Please, Enter Number");
        }
        else{
            int num1 = Integer.parseInt(Number1EditText1.getText().toString());
            int num2 = Integer.parseInt(Number2EditText.getText().toString());

            int result = num1 * num2;
            resultTextView.setText("Result : " + result);
        }
    }
    public void btnSection(View view){
        if(Number1EditText1.getText().toString().matches("") || Number2EditText.getText().toString().matches("")){
            resultTextView.setText("Please, Enter Number");
        }
        else{
            int num1 = Integer.parseInt(Number1EditText1.getText().toString());
            int num2 = Integer.parseInt(Number2EditText.getText().toString());

            int result = num1 / num2;
            resultTextView.setText("Result : " + result);
        }
    }
}