package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


//    private TextView textSample;
//    private Button secondButton;

    private TextView text_hw3;
    private Button two_button18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.first_layout);
//        setContentView(R.layout.second_layout);
//        setContentView(R.layout.home_work2_layout);
//        setContentView(R.layout.lianer_iayout_2);
//        setContentView(R.layout.table_layout);
//        setContentView(R.layout.frame_layout);
//        setContentView(R.layout.scroll_view);
//        setContentView(R.layout.third_layout);
        setContentView(R.layout.home_work3btn_layout);

        text_hw3 = findViewById(R.id.text_hw3);
        two_button18 = findViewById(R.id.two_button18);

        two_button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_hw3.setText("ХОРОШО!!!");

            }
        });


         //   @Override


//        textSample = findViewById(R.id.textSample);
//        secondButton = findViewById(R.id.secondButton);

//        secondButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textSample.setText("Новое приветствие");
//                textSample.setTextSize(40);
//            }
//        });
//
    }
    public void greeting(View view) {
        text_hw3.setText("Всё будет");
    }



    }
//    public void sayHello (View view) {
//        textSample.setText("Привет");
//
//    }
