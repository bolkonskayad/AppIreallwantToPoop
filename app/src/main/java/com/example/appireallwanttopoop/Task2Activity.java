package com.example.appireallwanttopoop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class Task2Activity extends AppCompatActivity {

    public static final String TEXT_KEY = "TEXT_KEY";
    private TextView tvSomething;
    private Button mButton;


    private View.OnClickListener mOnButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.google.com/search?q="+tvSomething.getText().toString()));
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_task2);

        tvSomething = findViewById(R.id.mText);
        mButton = findViewById(R.id.mButton);

        Bundle bundle = getIntent().getExtras();
        tvSomething.setText(bundle.getString(TEXT_KEY));

        mButton.setOnClickListener(mOnButtonClickListener);

    }

}
