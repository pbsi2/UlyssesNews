package com.pbsi2.ulyssesnews;

import android.os.Bundle;

import com.pbsi2.ulyssesnews.ui.main.MainFragment;
import com.pbsi2.ulyssesnews.ui.main.PreferenceFragment;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
            getSupportFragmentManager().beginTransaction()
                    .replace(android.R.id.content, new PreferenceFragment())
                    .commit();
        }
    }
}
