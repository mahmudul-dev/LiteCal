package com.bluesoft.litecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textInput, textOutput;
    ImageView btn_ac, btn_start_bracket, btn_end_bracket, btn_module, btn_divide, btn_7, btn_8, btn_9, btn_6, btn_5, btn_4, btn_3, btn_2, btn_1, btn_0, btn_equal, btn_multiplication, btn_minus, btn_plus, btn_dot;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //----------- Initilization ---------//

        textInput = findViewById(R.id.textInput);
        textOutput = findViewById(R.id.textOutput);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_ac = findViewById(R.id.btn_ac);
        btn_equal = findViewById(R.id.btn_equal);
        btn_start_bracket = findViewById(R.id.btn_start_bracket);
        btn_end_bracket = findViewById(R.id.btn_end_bracket);
        btn_minus = findViewById(R.id.btn_minus);
        btn_plus = findViewById(R.id.btn_plus);
        btn_multiplication = findViewById(R.id.btn_multiplication);
        btn_module = findViewById(R.id.btn_module);
        btn_dot = findViewById(R.id.btn_dot);
        btn_divide = findViewById(R.id.btn_divide);

        //----------- Initilization ---------//




        //------------ Click Event Start -------------//

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"0");
            }
        });



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"1");
            }
        });



        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"2");
            }
        });



        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"3");
            }
        });



        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"4");
            }
        });



        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"5");
            }
        });



        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"6");
            }
        });



        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"7");
            }
        });



        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"8");
            }
        });



        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"9");
            }
        });

        //------------- Click Event End --------------//
    }
}