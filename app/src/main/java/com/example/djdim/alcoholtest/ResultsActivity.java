package com.example.djdim.alcoholtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        //Accepting data from other activity
        Bundle data = getIntent().getExtras();
        if (data == null){
            return;
        }
        int datamsg1 = data.getInt("Form1_editText1");
        int datamsg2 = data.getInt("Form1_editText2");

        //String datamsg4 = data.getString("radioGroup1");
        //String datamsg6 = data.getString("spinner1");

        final TextView textViewR1 = (TextView) findViewById(R.id.textViewR1);
        textViewR1.setText(datamsg1);

        //int BAC = (0.2*A × 5.14/W*0.5 × r) - .015;

    }
}
