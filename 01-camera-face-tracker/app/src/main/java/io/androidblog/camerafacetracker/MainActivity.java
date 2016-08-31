package io.androidblog.camerafacetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * First steps:
 * 1.- Add Play Services dependency to gradle
 * 2.- Add the CustomViews ()
 * 3.- Build a basic UI
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
