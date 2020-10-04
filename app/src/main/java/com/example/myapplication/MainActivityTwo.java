package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityTwo extends AppCompatActivity {
    Button button1 ;
    TextView text,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);


//            button1 = findViewById(R.id.button_second);
//            button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(i);
//            }
//        });
         text = findViewById(R.id.textView2);
         text.setText("Hello Damish");
         Intent intent = getIntent(); // to get passing Intend
//          String ss= intent.getStringExtra("USER_NAME");
        Bundle ss = intent.getExtras();
        String s= ss.getString("USER_NAME");
        int s1 = ss.getInt("Age");
          text2 = findViewById(R.id.username);
          text3 = findViewById(R.id.userAge);
          text2.setText(s);
          text3.setText(String.valueOf(s1));
    }


    public void back_to_main(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }

    public void Second_page(View view) {
        Intent k =  new Intent(getApplicationContext(),MainActivityTree.class);
        startActivity(k);
    }
}