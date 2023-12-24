package com.example.increment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int quantity =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view){
        quantity ++;
        display(quantity);
    }
    public void decrement(View view){
        quantity --;
        display(quantity);
    }
    public void display (int number){
        TextView quantityTextView =(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }

}