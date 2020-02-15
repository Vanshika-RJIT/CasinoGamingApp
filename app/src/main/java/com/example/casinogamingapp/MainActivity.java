package com.example.casinogamingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView left;
    ImageView right;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        final ImageView left=findViewById(R.id.imageView2);
        final ImageView right=findViewById(R.id.imageView3);
        final int[] Dice={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice","The button has been pressed");
                Random r=new Random();
                int n=r.nextInt(6);
                Log.d("Dice","The random number is"+n);
                left.setImageResource(Dice[n]);
                int n1=r.nextInt(6);
                right.setImageResource(Dice[n1]);




            }
        });

    }
}
