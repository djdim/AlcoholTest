package com.example.djdim.alcoholtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class InsertDataActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);

        editText1 = (EditText) findViewById(R.id.Form1_editText1);
        editText2 = (EditText) findViewById(R.id.Form1_editText2);
        editText3 = (EditText) findViewById(R.id.Form1_editText3);
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Button Button_Calculate = (Button) findViewById(R.id.Button_Calculate);


        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.drinks_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.num_drinks_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);

    }

    //Create event to open new Intent and transfer data
    public void onClick(View view){
        Intent i = new Intent(this, ResultsActivity.class);
        final EditText Form1_editText1 = (EditText) findViewById(R.id.Form1_editText1);
        final EditText Form1_editText2 = (EditText) findViewById(R.id.Form1_editText2);
        final EditText Form1_editText3 = (EditText) findViewById(R.id.Form1_editText3);
        //final RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);

        //final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        //final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        int msg1 = Integer.parseInt(Form1_editText1.getText().toString());
        int msg2 = Integer.parseInt(Form1_editText2.getText().toString());
        int msg3 = Integer.parseInt(Form1_editText3.getText().toString());
        //String msg4 = ((RadioButton)findViewById(radioGroup1.getCheckedRadioButtonId())).getText().toString();

        //String msg6 = spinner1.getSelectedItem().toString();

        //transfer string data to the new event
        Bundle extras = new Bundle();
        extras.putInt("Form1_editText1",msg1);
        extras.putInt("Form1_editText2",msg2);
        extras.putInt("Form1_editText2", msg3);
        //extras.putString("radioGroup1", msg4);
        //extras.putString("spinner1", msg6);
        //i.putExtras(extras);
        startActivity(i);
    }
}
