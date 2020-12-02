package com.example.notedriod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private NavController mNavController;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        //instellen van mijn configuratie
        mNavController  = Navigation.findNavController(this,R.id.nav_host);
        mAppBarConfiguration = new AppBarConfiguration.Builder().build();
        //indien meerderen kan je dit in de Builder () plaatsen

        NavigationUI.setupActionBarWithNavController(this,mNavController,mAppBarConfiguration);

    }
}