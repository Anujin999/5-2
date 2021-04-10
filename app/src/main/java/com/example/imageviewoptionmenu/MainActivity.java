package com.example.imageviewoptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView)findViewById(R.id.image1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                image1.setImageResource(R.drawable.image1);
                return true;
            case R.id.item2:
                image1.setImageResource(R.drawable.image2);
                return true;
            case R.id.item3:
                image1.setImageResource(R.drawable.image3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}