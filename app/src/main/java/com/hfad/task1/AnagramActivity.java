package com.hfad.task1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kotlin.text.Regex;

public class AnagramActivity extends Activity implements View.OnClickListener {

    Revers ion = new Revers();
    StringBuilder builder = new StringBuilder();

    private TextView textAnagram;
    private EditText text, filter;
    private Button convert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert = (Button) findViewById(R.id.convert);
        convert.setOnClickListener(this::onClick);


    }


    @Override
    public void onClick(View view) {
        textAnagram = (TextView) findViewById(R.id.textAnagram);
        text = (EditText) findViewById(R.id.text);
        String first = text.getText().toString();
        filter = (EditText) findViewById(R.id.filter);
        String second = filter.getText().toString();


        char[] fi = first.toCharArray();
        char[] se = second.toCharArray();
        ion.reverse(fi);
        String rav = new String(fi);
        builder.append(rav);

        textAnagram.setText(builder);







        }


    }



































