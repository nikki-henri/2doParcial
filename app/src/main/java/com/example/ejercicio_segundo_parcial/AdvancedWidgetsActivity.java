package com.example.ejercicio_segundo_parcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class AdvancedWidgetsActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_widgets);

        bottomNavigationView = findViewById(R.id.bottom_nav);

        //poner titulo por medio de codigo
        setTitle("Advanced Widgets");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_favorite:
                        message("Favorite");
                        return true;
                    case R.id.menu_delete:
                        message("Delete");
                        return true;
                    case R.id.menu_account:
                        message("Profile");
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_favorite:
                message("Favorite");
                break;
            case R.id.menu_delete:
                message("Delete");
                break;
            case R.id.menu_account:
                message("Profile");
                break;
            case android.R.id.home:
                message("HOME");
                finish();
                break;
            default:
                message("Pulsaste otra opción");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void message(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}