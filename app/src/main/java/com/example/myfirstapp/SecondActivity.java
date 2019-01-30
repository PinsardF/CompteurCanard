package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    private static final String TOTAL_COUNT = "total_count";

    public void showRandomNumber(){
        TextView randomView = findViewById(R.id.textView_random);
        TextView headingView = findViewById(R.id.textView_display);
        int count = getIntent().getIntExtra(TOTAL_COUNT,0);
        Random random = new Random();
        int randomInt = 0;
        if(count>0) {
            randomInt = random.nextInt(count);
        }
        randomView.setText(Integer.toString(randomInt));
        headingView.setText(getString(R.string.random_heading,count));
    }
}
