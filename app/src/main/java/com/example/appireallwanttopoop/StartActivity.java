package com.example.appireallwanttopoop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    private EditText startTv;
    private Button toastBtn;
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        startTv = findViewById(R.id.something_et);
        toastBtn = findViewById(R.id.tap_btn);
        nextBtn = findViewById(R.id.next_btn);

        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isTextValid()) {
                    showText(startTv.getText().toString());
                }
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchInternetIntent =
                        new Intent(StartActivity.this, SearchInternet.class);
                searchInternetIntent.putExtra(SearchInternet.TEXT_KEY, startTv.getText().toString());
                startActivity(searchInternetIntent);
            }
        });
    }

    private boolean isTextValid() {
        return !TextUtils.isEmpty(startTv.getText());
    }

    private void showText(String string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }


}