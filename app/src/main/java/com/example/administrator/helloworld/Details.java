package com.example.administrator.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        count = intent.getIntExtra(MainActivity.COUNT_MESSAGE, 0);

        Log.v("potato", "count received in detail activity: " + count);

        TextView textView = findViewById(R.id.textView);
        textView.setText(count + "%");

        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(count);

    }


}
