package com.hfad.task1;

import static com.hfad.task1.Revers.reverse;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

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


        if(savedInstanceState != null){
           builder = (StringBuilder) savedInstanceState.getCharSequence("build");
            textAnagram.setText(builder);
        }

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
        reverse(fi);
        String rav = new String(fi);
        builder.append(rav);

        textAnagram.setText(builder);


    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putCharSequence("build", builder);
    }
}






































