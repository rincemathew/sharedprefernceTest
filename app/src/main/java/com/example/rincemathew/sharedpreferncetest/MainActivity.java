package com.example.rincemathew.sharedpreferncetest;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button minus,plus,next;

    int x;

    //SharedPreferences sp = getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.valuex);
        minus=findViewById(R.id.buttonminus);
        plus=findViewById(R.id.buttonplus);
        next=findViewById(R.id.buttonnext);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        final int highscore = mypref.getInt("your_int_key",0);
        textView.setText(""+highscore);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences mypref = getPreferences(MODE_PRIVATE);
                final int highscore = mypref.getInt("your_int_key",0);
                x=highscore-1;
                display(x);
                saveSharedpreference();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences mypref = getPreferences(MODE_PRIVATE);
                final int highscore = mypref.getInt("your_int_key",0);
                x=highscore+1;
                display(x);
                saveSharedpreference();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });


    }

    private void display(int number) {
        textView.setText(""+number);
    }

    private void saveSharedpreference() {
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = mypref.edit();
        editor.putInt("your_int_key", x);
        editor.commit();

    }


}
