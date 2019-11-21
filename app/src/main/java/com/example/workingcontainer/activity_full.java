package com.example.workingcontainer;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class activity_full extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);

        CheckBox cb = findViewById(R.id.checkBox);
        cb.setOnCheckedChangeListener(this);
    }

    public void setDate(View view){
        Button date_button = findViewById(R.id.button8);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        date_button.setBackgroundColor(Color.RED);
        date_button.setText(dateFormat.format(date));
    }
    public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
        if (isChecked) {
            cb.setText("This checkbox is: checked");
        }else{
            cb.setText("This checkbox is: unchecked");
        }
    }

    public void radioButtonGreen(View view){
        TextView txtcolor = findViewById(R.id.textView4);
        txtcolor.setBackgroundColor(Color.GREEN);
    }
    public void radioButtonBlue(View view){
        TextView txtcolor = findViewById(R.id.textView4);
        txtcolor.setBackgroundColor(Color.BLUE);
    }
    public void radioButtonRed(View view){
        TextView txtcolor = findViewById(R.id.textView4);
        txtcolor.setBackgroundColor(Color.RED);
    }
    public void changeText(View view){
        TextView txt = findViewById(R.id.textView2);
        TextView txt_editable = findViewById(R.id.textView3);
        txt.setText(txt_editable.getText());

    }
}

/*
public class CheckBoxDemo extends Activity
  implements CompoundButton.OnCheckedChangeListener {
  CheckBox cb;

  @Override
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    setContentView(R.layout.main);

    cb=(CheckBox)findViewById(R.id.check);
    cb.setOnCheckedChangeListener(this);
  }

  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
      cb.setText("This checkbox is: checked");
    }else{
      cb.setText("This checkbox is: unchecked");
    }
  }
}
 */