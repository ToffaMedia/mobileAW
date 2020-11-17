package de.htw.mobileaw.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.htw.mobileaw.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSearch(View view) {
        Intent intent = new Intent(this, ArticleActivity.class);
        intent.putExtra("ArticleType", ArticleType.SEARCH);
        startActivity(intent);
    }
    public void openFound(View view) {
        Intent intent = new Intent(this, ArticleActivity.class);
        intent.putExtra("ArticleType", ArticleType.FOUND);
        startActivity(intent);
    }
    public void openNotifications(View view) {
        Intent intent = new Intent(this, NotificationsActivity.class);
        startActivity(intent);
    }



}