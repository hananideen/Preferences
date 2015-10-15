package com.example.hananideen.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button preferencesButton1 = (Button) findViewById(R.id.preferences1);
        preferencesButton1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent settingsActivity = new Intent(getBaseContext(),
                        Preferences.class);
                startActivity(settingsActivity);
            }
        });

        Button preferencesButton2 = (Button) findViewById(R.id.preferences2);
        preferencesButton2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent settingsActivity = new Intent(getBaseContext(),
                        Preferences3.class);
                startActivity(settingsActivity);
            }
        });

        Button preferencesButton3 = (Button) findViewById(R.id.preferences3);
        preferencesButton3.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent settingsActivity = new Intent(getBaseContext(),
                        Preferences4.class);
                startActivity(settingsActivity);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}