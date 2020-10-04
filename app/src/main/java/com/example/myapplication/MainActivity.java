package com.example.myapplication;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity<name> extends AppCompatActivity {
    private static final String TAG = "Checker";
    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"On the Start");

        button=findViewById(R.id.btnOk);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                    text = findViewById(R.id.txtHello);
//                    text.setText("Hello Nisal");
                Intent i  = new Intent(getApplicationContext(),MainActivityTwo.class);
                startActivity(i);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"On Start method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"On the Pause");
    }

    public void Username(View view) {
        Intent intent  =  new  Intent(this,MainActivityTwo.class);
        String name= "Damish Nisal";
        int age = 23;
//        intent.putExtra("USER_NAME",name);
        Bundle bud = new Bundle();
        bud.putString("USER_NAME",name);
        bud.putInt("Age",age);
        intent.putExtras(bud);
        startActivity(intent);
    }
}