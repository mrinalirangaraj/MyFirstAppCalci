package com.myfirstapp.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.editTextNumber3);
        num2 = (EditText) findViewById(R.id.editTextNumber4);
        add = (Button) findViewById(R.id.button3);
        sub = (Button) findViewById(R.id.button2);
        answer = (TextView) findViewById(R.id.textView5);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                answer.setText("The answer is " + String.valueOf(sum));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sub = number1 - number2;
                answer.setText("The answer is " + String.valueOf(sub));
            }
        });

    }
}