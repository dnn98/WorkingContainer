package com.example.workingcontainer;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_radiobutton extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
    }
    public void radioButtonGreen(View view){
        TextView txtcolor = findViewById(R.id.textView6);
        txtcolor.setBackgroundColor(Color.GREEN);
    }
    public void radioButtonBlue(View view){
        TextView txtcolor = findViewById(R.id.textView6);
        txtcolor.setBackgroundColor(Color.BLUE);
    }
    public void radioButtonRed(View view){
        TextView txtcolor = findViewById(R.id.textView6);
        txtcolor.setBackgroundColor(Color.RED);
    }
}
