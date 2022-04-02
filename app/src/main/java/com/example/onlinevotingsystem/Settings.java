package com.example.onlinevotingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Settings extends AppCompatActivity {

    Boolean darkModeEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    /**
     * Toggle darkModeEnabled between true/false
     * This is toggled by darkModeButton
     * @param view
     */
    public void toggleDarkMode(View view){
        darkModeEnabled = !darkModeEnabled;
        Log.d("Dark Mode", "Enabled " + darkModeEnabled);
    }
}