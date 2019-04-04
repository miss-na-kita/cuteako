package com.example.checkit;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay1;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
        }
    };

    private Button BtnChecker;
    private Button BtnProfessor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);

        handler.postDelayed(runnable, 2000);

        BtnChecker = findViewById(R.id.BtnChecker);

        BtnChecker.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v)
        {   openBtnChecker();

        }
        });

        BtnProfessor = findViewById(R.id.BtnProfessor);

        BtnProfessor.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v)
        {   openBtnProfessor();

        }
        });

    }

    public void openBtnChecker()
    {
        Intent intent = new Intent(this, LoginChecker.class);
        startActivity(intent);
    }

    public void openBtnProfessor()
    {
        Intent intent = new Intent(this, LoginChecker.class);
        startActivity(intent);
    }
    }

