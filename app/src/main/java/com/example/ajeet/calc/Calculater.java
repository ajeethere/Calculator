package com.example.ajeet.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculater extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,equalsBtn,clear,back,plusBtn,subBtn,multiBtn,divBtn;
    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);
        one=(Button) findViewById(R.id.one);
        two=(Button) findViewById(R.id.two);
        three=(Button) findViewById(R.id.three);
        four=(Button) findViewById(R.id.four);
        five=(Button) findViewById(R.id.five);
        six=(Button) findViewById(R.id.six);
        seven=(Button) findViewById(R.id.seven);
        eight=(Button) findViewById(R.id.eight);
        nine=(Button) findViewById(R.id.nine);
        zero=(Button) findViewById(R.id.zero);
        equalsBtn=(Button) findViewById(R.id.equals);
        txt=(EditText) findViewById(R.id.txt);
        clear=(Button) findViewById(R.id.clr);
        back=(Button) findViewById(R.id.back);
        plusBtn=(Button)findViewById(R.id.plus);
        subBtn=(Button)findViewById(R.id.sub);
        multiBtn=(Button)findViewById(R.id.multi);
        divBtn=(Button)findViewById(R.id.div);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a="1";
                txt.setText(txt.getText().toString()+a);
            }
        });
        two.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a="2";
                txt.setText(txt.getText().toString()+a);
            }
        });
        three.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a="3";
                txt.setText(txt.getText().toString()+a);
            }
        });
        four.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a="4";
                txt.setText(txt.getText().toString()+a);
            }
        });
        five.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a="5";
                txt.setText(txt.getText().toString()+a);
            }
        });
        six.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a="6";
                txt.setText(txt.getText().toString()+a);
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a="7";
                txt.setText(txt.getText().toString()+a);
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a="8";
                txt.setText(txt.getText().toString()+a);
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a="9";
                txt.setText(txt.getText().toString()+a);
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a="0";
                txt.setText(txt.getText().toString()+a);
            }
        });
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=txt.getText().toString();
                String b="";
                txt.setText(b);
            }
        });





        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c=txt.getText().toString();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a="";
                txt.setText(a);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=txt.getText().toString();
                if (str.length() >=1 ) {
                    str = str.substring(0, str.length() - 1);
                    txt.setText(str);
                }
            }
        });

    }
}
