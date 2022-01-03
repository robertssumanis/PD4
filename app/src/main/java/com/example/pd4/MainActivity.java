package com.example.pd4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, divide, multiply, isEqual, delete;
    private TextView result, control;
    private Double value1 = Double.NaN, value2;
    private char ACTION;
    private final char PLUS = '+', MINUS = '-', DIVIDE = '/', MULTIPLY = '*', EQUAL = '0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIDs();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                ACTION = PLUS;
                result.setText(String.valueOf(value1) + "+");
                control.setText(null);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                ACTION = MINUS;
                result.setText(String.valueOf(value1) + "-");
                control.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                ACTION = MULTIPLY;
                result.setText(String.valueOf(value1) + "*");
                control.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                ACTION = DIVIDE;
                result.setText(String.valueOf(value1) + "/");
                control.setText(null);
            }
        });

        isEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                ACTION = EQUAL;
                result.setText(String.valueOf(value1));
                control.setText(null);
                value1 = Double.NaN;
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(null);
                result.setText(null);
            }
        });
    }

    private void calculate(){
        if(!Double.isNaN(value1)){
            value2 = Double.parseDouble(control.getText().toString());

            switch(ACTION){
                case EQUAL:
                    break;
                case PLUS: value1 = value1 + value2;
                    break;
                case MINUS: value1 = value1 - value2;
                    break;
                case DIVIDE: value1 = value1 / value2;
                    break;
                case MULTIPLY: value1 = value1 * value2;
                    break;
            }
        } else {
            value1 = Double.parseDouble(control.getText().toString());
        }
    }

    private void buttonIDs (){

        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        zero = (Button)findViewById(R.id.zero);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        divide = (Button)findViewById(R.id.divide);
        multiply = (Button)findViewById(R.id.multiply);
        isEqual = (Button)findViewById(R.id.isEqual);
        delete = (Button)findViewById(R.id.delete);
        result = (TextView)findViewById(R.id.result);
        control = (TextView)findViewById(R.id.control);
    }

}