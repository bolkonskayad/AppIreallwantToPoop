package com.example.appireallwanttopoop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class SearchInternet extends AppCompatActivity {

    public static final String TEXT_KEY = "TEXT_KEY";
    private TextView searchTv;
    private Button searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchTv = findViewById(R.id.search_tv);
        searchBtn = findViewById(R.id.search_btn);

        Bundle bundle = getIntent().getExtras();
        searchTv.setText(bundle.getString(TEXT_KEY));

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/search?q=" + searchTv.getText().toString()));
                startActivity(intent);
            }
        });

    }


}
