package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        Log.i("info", "convert: pressed");

        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);
        String amountInPound = editText.getText().toString();
        double doubleAmountInPound = Double.parseDouble(amountInPound);

        double doubleAmountInDollar = doubleAmountInPound * 1.22;

        //String stringAmountInDollar = Double.toString(doubleAmountInDollar);
        String stringAmountInDollar = String.format("%.2f",doubleAmountInDollar);


        Log.i("Amount in Dollar ", stringAmountInDollar);

        Toast.makeText(this, "the amount is: "+ stringAmountInDollar, Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}