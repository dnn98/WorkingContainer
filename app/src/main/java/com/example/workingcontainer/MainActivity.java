package com.example.workingcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeToActivity1(View view) {
        Intent intent = new Intent(this, activity_full.class);
        startActivity(intent);
    }

    public void changeToActivity2(View view) {
        Intent intent = new Intent(this, activity_text.class);
        startActivity(intent);
    }

    public void changeToActivity3(View view) {
        Intent intent = new Intent(this, activity_button.class);
        startActivity(intent);
    }
    public void changeToActivity4(View view) {
        Intent intent = new Intent(this, activity_image.class);
        startActivity(intent);
    }
    public void changeToActivity5(View view) {
        Intent intent = new Intent(this, activity_checkbox.class);
        startActivity(intent);
    }
    public void changeToActivity6(View view) {
        Intent intent = new Intent(this, activity_radiobutton.class);
        startActivity(intent);
    }

}
