package com.bluesoft.litecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.internal.ContextUtils;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    TextView textInput, textOutput;
    Button btn_ac, btn_c, btn_module, btn_divide, btn_7, btn_8, btn_9, btn_6, btn_5, btn_4, btn_3, btn_2, btn_1, btn_0, btn_equal, btn_multiplication, btn_minus, btn_plus, btn_dot;
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
        btn_c = findViewById(R.id.btn_c);
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


        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+".");
            }
        });


        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"÷");
            }
        });


        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInput.setText(null);
                textOutput.setText(null);
            }
        });


        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              data = textInput.getText().toString();
              data = data.substring(0,data.length()-1);
              textInput.setText(data);
            }
        });


        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"+");
            }
        });


        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"-");
            }
        });



        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"%");
            }
        });




        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textInput.getText().toString();
                textInput.setText(data+"×");
            }
        });


        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=textInput.getText().toString();
                Toast.makeText(getApplicationContext(), ""+data, Toast.LENGTH_SHORT).show();
            data=data.replaceAll("×","*");
            data=data.replaceAll("%","/100");
            data=data.replaceAll("÷","/");

                Context rhino=Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                Scriptable scriptable= rhino.initStandardObjects();
                finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();

                textOutput.setText(finalResult);

            }
        });

        //------------- Click Event End --------------//
    }
}