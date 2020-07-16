package com.example.klinik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class dahsboard extends AppCompatActivity {

    ImageButton btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dahsboard);

        btn1=(ImageButton) findViewById(R.id.btn1);
        btn2=(ImageButton) findViewById(R.id.btn2);
        btn3=(ImageButton) findViewById(R.id.btn3);
        btn4=(ImageButton) findViewById(R.id.btn4);


        ImageButton imageButton = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), jadwal.class);
                startActivity(activity2Intent);
            }
        });

        ImageButton imageButton1 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), antrian.class);
                startActivity(activity2Intent);
            }
        });

        ImageButton imageButton2 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), pembayaran.class);
                startActivity(activity2Intent);
            }
        });

        ImageButton imageButton3 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), info.class);
                startActivity(activity2Intent);
            }
        });

    }
}
