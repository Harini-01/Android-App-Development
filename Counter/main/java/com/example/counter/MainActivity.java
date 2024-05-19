package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView counter,title;
    Button mybtn;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mybtn=findViewById(R.id.button);
        counter=findViewById(R.id.countertext);
        title=findViewById(androidx.core.R.id.title);

        //Adding functions

        mybtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            counter.setText(""+increasecounter());
            }
        });


    }
    public int increasecounter(){
        return ++count;
    }

}