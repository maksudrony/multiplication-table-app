package com.example.multiplicationtableofagivennumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    TextView text2;
    Button button;
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text2= findViewById(R.id.text2);
        button= findViewById(R.id.button);
        number= findViewById(R.id.number);
    }
    public void calculate(View view){

        StringBuffer buffer= new StringBuffer();
        String s= number.getText().toString();
        int k= Integer.parseInt(s);
        //text2.nextLine();
        for (int i=1; i<=10; i++){
            int result= k * i;
            buffer.append(s +"*" + i + "=" + result + "\n\n");

        }
        text2.setText(buffer);
    }
}