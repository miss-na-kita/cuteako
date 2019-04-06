package com.example.checkit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class MainActivity2 extends Activity {

    ExpandableListView expandableTextView;
    
    @Override
    protected void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_main2);

        expandableTextView = findViewById(R.id.rooms);
        ExpandableRoomNumber adapter = new ExpandableRoomNumber(MainActivity2.this);
        expandableTextView.setAdapter(adapter);
    }
}
