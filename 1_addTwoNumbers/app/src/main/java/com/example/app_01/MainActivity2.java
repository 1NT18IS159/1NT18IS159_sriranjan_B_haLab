package com.example.app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    TextView tv5;
    TextView tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent it = getIntent();
        String res = it.getStringExtra("abc");
        String a = it.getStringExtra("a");
        String b = it.getStringExtra("b");
        Log.d("MainActivity2", "onCreate: "+res);
        tv=findViewById(R.id.tv1);
        tv5=findViewById(R.id.textView2);
        tv6=findViewById(R.id.textView3);
        tv.setText("Result is:"+res);
        tv5.setText("A is: "+a);
        tv6.setText("B is: "+b);
    }
}