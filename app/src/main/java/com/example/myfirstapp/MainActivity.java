package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static final String TOTAL_COUNT = "total_count";
    private Boolean lots_of = false;

    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Coin Coin !", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view){
        TextView showCountTextView = findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;
        showCountTextView.setText(count.toString());
        if(count>14 && lots_of==false){
            lots_of=true;
            Intent lostofIntent = new Intent(this,BeaucoupCanards.class);
            startActivity(lostofIntent);
        }
    }

    public void randomMe(View view){
        Intent randomIntent = new Intent(this,SecondActivity.class);
        TextView showCountTextView = findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        randomIntent.putExtra(TOTAL_COUNT,count);

        startActivity(randomIntent);
    }
}
