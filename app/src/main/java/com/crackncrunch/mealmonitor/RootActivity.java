package com.crackncrunch.mealmonitor;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class RootActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
    }
}
