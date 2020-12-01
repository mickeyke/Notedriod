package com.example.notedriod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private NavController mNavController;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        
        mNavController = Navigation.findNavController(this,R.id.nav_host);
        mAppBarConfiguration = new AppBarConfiguration.Builder().build();

        NavigationUI.setupActionBarWithNavController(this, mNavController, mAppBarConfiguration);

    }

    private void setSupportActionBar(Toolbar mToolbar) {
    }
}