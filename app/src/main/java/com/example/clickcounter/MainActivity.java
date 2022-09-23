package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout body;
    private Button plus,minus;
    private TextView num;
    static int counter = 0;



    public void changeNum(){
        num.setText(String.valueOf(counter));
        if(counter > 0){
            num.setTextColor(getResources().getColor(R.color.green));
        }else if(counter < 0){
            num.setTextColor(getResources().getColor(R.color.red));
        }else{
            num.setTextColor(getResources().getColor(R.color.blue));
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                changeNum();
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                changeNum();
            }
        });

    }

    public void init(){
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        num = findViewById(R.id.num);
        body = findViewById(R.id.body);

    }
}