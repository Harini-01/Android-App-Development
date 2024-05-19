package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title;
    TextView output;
    Button mybtn;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title=findViewById(R.id.title);
        input=findViewById(R.id.editText);
        mybtn=findViewById(R.id.button);
        output=findViewById(R.id.output);

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText=input.getText().toString();

                double metres=Double.parseDouble(inputText);

                double cms = convert(metres);

                output.setText("" + cms);


            }
        });
    }

    public double convert(double x){
        // 1 m = 100 cm
        return x*100;
    }
}