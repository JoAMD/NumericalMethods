package com.example.bisectionmethod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button nextBtn, sinBtn, cosBtn, lnBtn, logBtn;
    private double Eqn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextBtn = findViewById(R.id.next);
        sinBtn = findViewById(R.id.sin);
        cosBtn = findViewById(R.id.cos);
        lnBtn = findViewById(R.id.ln);
        logBtn = findViewById(R.id.log);


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(result);
            }
        });

        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Eqn
            }
        });

    }
}
