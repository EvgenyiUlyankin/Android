package com.example.first;

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

public class MainActivity2 extends AppCompatActivity {

//    private TextView result;
//    private EditText num1, num2;
//    private Button button;

    private EditText num1, num2;
    private Button plus, minus, multiply, divide;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
        setContentView(R.layout.home_work4calc_layout);

//        result = findViewById(R.id.result);
//        num1 = findViewById(R.id.editNumber1);
//        num2 = findViewById(R.id.editNumber2);
//        button = findViewById(R.id.calcSum);

        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        result = findViewById(R.id.equals);


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Integer number1 = Integer.parseInt(num1.getText().toString());
//                Integer number2 = Integer.parseInt(num2.getText().toString());
//
//                result.setText(String.valueOf(number1 + number2));
//
//            }
//        });


        plus.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Float number1 = Float.parseFloat(num1.getText().toString());
                Float number2 = Float.parseFloat(num2.getText().toString());
    //            Integer number2 = Integer.parseInt(num2.getText().toString());

                result.setText("Результат: "  + number1 + "+" + number2 + " = " + String.valueOf(number1 + number2));

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float number1 = Float.parseFloat(num1.getText().toString());
                Float number2 = Float.parseFloat(num2.getText().toString());

                result.setText("Результат: " + number1 + "-" + number2 + " = " + String.valueOf(number1 - number2));
            }

        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float number1 = Float.parseFloat(num1.getText().toString());
                Float number2 = Float.parseFloat(num2.getText().toString());
                result.setText("Результат: " + number1 + "*" + number2 + " = " + String.valueOf(number1 * number2));

            }

        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float number1 = Float.parseFloat(num1.getText().toString());
                Float number2 = Float.parseFloat(num2.getText().toString());
                result.setText("Результат: " + number1 + "/" + number2 + " = " + String.valueOf(number1 / number2));

            }

        });

    }
}