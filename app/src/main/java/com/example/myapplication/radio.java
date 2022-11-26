package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class radio extends AppCompatActivity {

    public void onRadioButtonClicked(View view){
        //buttonnya di check?
        boolean checked = ((RadioButton) view).isChecked();

        TextView text = (TextView)findViewById(R.id.text);

        //Check Radio button yang mana di klik
        switch (view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    text.setText("pirates");
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    text.setText("ninjaaa");
                    break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
    }
}