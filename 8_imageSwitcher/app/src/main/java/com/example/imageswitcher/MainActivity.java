package com.example.imageswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    ImageView iv;
    boolean flag;
    int images[]={R.drawable.pushpa,R.drawable.rocky};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.imageView);
        b1 = (Button) findViewById(R.id.swap);

        flag = true;

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                iv.setImageResource(images[i]);
                i++;
                if(i==2)
                    i=0;
            }
        });
    }
}