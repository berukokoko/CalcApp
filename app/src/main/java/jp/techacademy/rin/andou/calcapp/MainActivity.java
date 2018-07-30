package jp.techacademy.rin.andou.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // ①メンバ変数を定義
    EditText edittext;
    EditText edittext2;
    TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ボタン
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        //ボタン2
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        //ボタン3
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        //ボタン4
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        TextView = (TextView) findViewById(R.id.TextView);
        //エディットテキスト
        edittext =(EditText)findViewById(R.id.edittext);
        //エディットテキスト2
        edittext2 =(EditText)findViewById(R.id.edittext2);

        Editable getText = edittext.getText();
        Editable getText2 = edittext2.getText();
        int edit1 =Integer.parseInt(getText.toString());
        int edit2 =Integer.parseInt(getText2.toString());
        Intent intent = new Intent(this, Main2Activity.class);

        //もしボタン1が〜
        if(v.getId()==R.id.button){
            intent.putExtra("VALUE1", edit1);
            intent.putExtra("VALUE2", edit2);
            startActivity(intent);
        }else if(v.getId()==R.id.button2){
            Log.d("abc","b");
        }else if(v.getId()==R.id.button3){
            Log.d("abc","c");
        }else if(v.getId()==R.id.button4){
            Log.d("abc","d");
        }else{
            Log.d("abc","e");
        }
        //もしボタン1が
    }


}
