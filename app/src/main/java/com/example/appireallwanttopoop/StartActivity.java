package com.example.appireallwanttopoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    private EditText etWriteSomething;
    private Button buttonTap;

    private View.OnClickListener mOnTapClickListener = new View.OnClickListener() {
        //
        @Override
        public void onClick(View view) {
            if(isTextValid()) {
                showText(etWriteSomething.getText().toString());
            }
        }
    };

    private boolean isTextValid()
    {
        return !TextUtils.isEmpty(etWriteSomething.getText());
    }

    private void showText(String string)
    {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_start);

        etWriteSomething = findViewById(R.id.etTextSomething);
        buttonTap = findViewById(R.id.tap_button);

        buttonTap.setOnClickListener(mOnTapClickListener);
    }
}