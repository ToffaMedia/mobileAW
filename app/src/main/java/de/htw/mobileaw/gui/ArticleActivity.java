package de.htw.mobileaw.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import de.htw.mobileaw.R;

public class ArticleActivity extends AppCompatActivity {

    private ArticleType articleType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_found);

        articleType = (ArticleType) getIntent().getSerializableExtra("ArticleType");

        TextView title = findViewById(R.id.notificationTitle);
        Button buttonSend = findViewById(R.id.buttonSend);

        if (articleType == ArticleType.SEARCH){
            title.setText(R.string.searchText);
            buttonSend.setText(R.string.sendSearch);
        }

    }
}