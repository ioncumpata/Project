package com.hfad.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

import java.util.Scanner;

public class AnagramConvert extends AppCompatActivity {

    private TextView textView;
    private EditText text, filter;
    private Button convert;

    Scanner sc = new Scanner(System.in);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void convert(View view) {
        textView = (TextView) findViewById(R.id.textAnagram);
        text = (EditText) findViewById(R.id.text);
        String first = String.valueOf(text);
        filter = (EditText) findViewById(R.id.filter);
        String second = String.valueOf(filter);
        convert = (Button) findViewById(R.id.convert);



        first = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        for (int i = 0; i < firstArray.length; i++) {
            int j = sc.nextInt(firstArray.length);
            char tmp = firstArray[i];
            firstArray[i] = firstArray[j];
            firstArray[j] = tmp;
        }

            for (char c : secondArray) {  //check whether each character of secondArray is present in first string
                int index = first.indexOf(c);
            }
            String w = String.valueOf(firstArray);
            textView.setText(w);

    }





}












