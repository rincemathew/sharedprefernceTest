package com.example.rincemathew.sharedpreferncetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    Button minus,plus,next;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.valuex);
        minus=findViewById(R.id.buttonminus);
        plus=findViewById(R.id.buttonplus);
        next=findViewById(R.id.buttonnext);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
    private void plus() {
        x=x+1;
        textView.setText(x);
    }

    private void minus() {
        x=x-1;
        textView.setText(x);
    }

}
