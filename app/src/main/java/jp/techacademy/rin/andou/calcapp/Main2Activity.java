package jp.techacademy.rin.andou.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int value1 = intent.getIntExtra("VALUE1", 0);
        int value2 = intent.getIntExtra("VALUE2", 0);

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);

        textView.setText(String.valueOf(value1 + value2));
        textView2.setText(String.valueOf(value1 - value2));
        textView3.setText(String.valueOf(value1 * value2));
        textView4.setText(String.valueOf(value1 / value2));

        
    }
}
