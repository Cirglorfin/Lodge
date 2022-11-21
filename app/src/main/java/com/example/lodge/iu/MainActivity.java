package com.example.lodge.iu;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;

import com.example.lodge.R;
import com.example.lodge.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.Menu;
import android.view.MenuItem;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

    }
    public void Visible(){

        binding.toolbar.setVisibility(View.VISIBLE);

    }
    public void Gone(){

        binding.toolbar.setVisibility(View.GONE);}
    public void Flecha(){
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(false);

        //getSupportActionBar().setHomeButtonEnabled(false);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu){
        for (int i=0; i<menu.size(); i++) {
            MenuItem mi = menu.getItem(i);
            String title = mi.getTitle().toString();
            Spannable newTitle = new SpannableString(title);
            newTitle.setSpan(new ForegroundColorSpan(Color.BLACK), 0, newTitle.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            mi.setTitle(newTitle);
        }
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, AboutUsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}