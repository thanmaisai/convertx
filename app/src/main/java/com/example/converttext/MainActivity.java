package com.example.converttext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.math.*;

public class MainActivity extends AppCompatActivity
{

    public void btnclick(View view)
    {
        //
        EditText dolleramount = (EditText) findViewById(R.id.doller_amount);
        // input amount in the form of string from the user
        String dollers = dolleramount.getText().toString();
        // convert the input amount to double
        Double doubleDollers = Double.parseDouble(dollers);
        // multiply the doller rate to india currency
        Double doubleinr = 75.52 * doubleDollers;
        // rounding off the decimal palces
        Double rounddoller = Double.valueOf(Math.round(doubleinr*100)/100);
        // output format to be displayed
        String toasttext = "= "+ rounddoller.toString()+" INR";
        //provides a simple popup message to display show the conveted amount
        Toast.makeText(this, toasttext, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

