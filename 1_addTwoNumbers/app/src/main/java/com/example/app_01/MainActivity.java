package com.example.app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button Add;
    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        num2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        Add = (Button) findViewById(R.id.button3);
        it = new Intent(this, MainActivity2.class);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());

                int sum = a + b;

                it.putExtra("a",Integer.toString(a));
                it.putExtra("b",Integer.toString(b));
                it.putExtra("abc",Integer.toString(sum));
                startActivity(it);
            }
        });
    }
}