package com.example.workingcontainer;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

public class activity_checkbox extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        CheckBox cb = findViewById(R.id.checkBox2);
        cb.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
        if (isChecked) {
            cb.setText("This checkbox is: checked");
        }else{
            cb.setText("This checkbox is: unchecked");
        }
    }
}