package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add, sub, mul, div, c, ce, bs, equal;
    Button neg;
    TextView textView;
    Double var1 = 0.0, var2, result;
    Boolean addition = false, subtract = false, multiply = false, divide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b0 = (Button) findViewById(R.id.button_0);
        b1 = findViewById(R.id.button_1);
        b2 = findViewById(R.id.button_2);
        b3 = findViewById(R.id.button_3);
        b4 = findViewById(R.id.button_4);
        b5 = findViewById(R.id.button_5);
        b6 = findViewById(R.id.button_6);
        b7 = findViewById(R.id.button_7);
        b8 = findViewById(R.id.button_8);
        b9 = findViewById(R.id.button_9);
        add = findViewById(R.id.button_add);
        sub = findViewById(R.id.button_sub);
        mul = findViewById(R.id.button_mul);
        div = findViewById(R.id.button_div);
        equal = findViewById(R.id.button_equal);
        c = findViewById(R.id.button_C);
        ce = findViewById(R.id.button_CE);
        bs = findViewById(R.id.button_BS);
        neg= findViewById(R.id.button_negative);

        textView = findViewById(R.id.textview);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"digital-7.ttf");
        textView.setTypeface(typeface);
        textView.setTextColor(Color.BLACK);
        textView.setText("0");
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("0");
                }
                else
                    textView.setText(textView.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("1");
                }
                else
                textView.setText(textView.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("2");
                }
                else
                textView.setText(textView.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("3");
                }
                else
                textView.setText(textView.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("4");
                }
                else
                textView.setText(textView.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("5");
                }
                else
                textView.setText(textView.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("6");
                }
                else
                textView.setText(textView.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("7");
                }
                else
                textView.setText(textView.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("8");
                }
                else
                textView.setText(textView.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() == "0") {
                    textView.setText("9");
                }
                else
                textView.setText(textView.getText() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText() == "") {
                    textView.setText("");
                }
                else {
                    var1 = Double.parseDouble(textView.getText().toString());
                    buttonFalse();
                    addition = true;
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText() == "") {
                    textView.setText("");
                }
                else {
                    var1 = Double.parseDouble(textView.getText().toString());
                    buttonFalse();
                    subtract = true;
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText() == "") {
                    textView.setText("");
                }
                else {
                    var1 = Double.parseDouble(textView.getText().toString());
                    buttonFalse();
                    multiply = true;
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText() == "") {
                    textView.setText("");
                }
                else {
                    var1 = Double.parseDouble(textView.getText().toString());
                    buttonFalse();
                    divide = true;
                }
            }
        });

        neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textView.getText().toString();
                if(text == "0" || text == "") {
                    textView.setText("-");
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equal.setEnabled(true);
                sub.setEnabled(true);
                mul.setEnabled(true);
                div.setEnabled(true);
                add.setEnabled(true);
                ce.setEnabled(true);
                bs.setEnabled(true);
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                neg.setEnabled(true);

                addition = false;
                subtract = false;
                multiply = false;
                divide = false;

                var1 = 0.0;

                textView.setText("0");
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textView.setText("0");
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = textView.getText().toString();

                if(text1.length() == 1)
                    textView.setText("0");
                else {
                    String text2 = "";
                    for(int i = 0; i < text1.length() - 1; i++) {
                        text2 += text1.charAt(i);
                    }
                    textView.setText(text2);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText() == "") {
                    textView.setText("");
                }
                else {
                    var2 = Double.parseDouble(textView.getText().toString());
                    if(addition){
                        result = var1 + var2;
                    } else if (subtract){
                        result = var1 - var2;
                    } else if (multiply){
                        result = var1 * var2;
                    } else if (divide){
                        result = var1 / var2;
                    } else {
                        result = var1;
                    }
                    textView.setText(result.toString());
                    equal.setEnabled(false);
                    b0.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    ce.setEnabled(false);
                    bs.setEnabled(false);
                    neg.setEnabled(false);
                }

            }
        });
    }


    public void buttonFalse(){
        sub.setEnabled(false);
        mul.setEnabled(false);
        div.setEnabled(false);
        add.setEnabled(false);
        textView.setText("");
    }

}


