package com.example.terminator.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int q = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */


    public void display(int n) {
        TextView view1 = (TextView) findViewById(R.id.quantity_text_view);
        TextView view2 = (TextView) findViewById(R.id.price_text_view);
        view1.setText("" + q);
        view2.setText("Total : $" + 5 * q);
    }

    public void plus(View view) {
        q++;
        display(q);
    }

    public void minus(View view) {
        if (q > 0) {
            q--;
        }
        display(q);

    }
    Switch on_off = (Switch)findViewById(R.id.choco_chk);
    on_off.
    public void submitOrder(View view) {
        display(1);
    }


}
