package com.example.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private Button button;
    private ImageView imageView;
    public final static String COUNT = "COUNT_STORAGE_BLAH_BLAH";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(COUNT, 0);
            button.setText(count + "");
        }

        Toast.makeText(getApplicationContext(), "Activity Created!", Toast.LENGTH_SHORT).show();
        Log.v("potato", "Activity Created!");
    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v("potato", "saving state");
        outState.putInt(COUNT, count);
    }



    public void countUp(View view) {
        count = Integer.parseInt(button.getText().toString()) + 1;
        button.setText(count + "");
        if(count % 2 == 0) {
            imageView.setAlpha(0.5f);
        } else {
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(), "Starting ...", Toast.LENGTH_SHORT).show();
        Log.v("potato", "Starting ...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Resuming ...", Toast.LENGTH_SHORT).show();
        Log.v("potato", "Resuming ...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
        Log.v("potato", "Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "Stopped", Toast.LENGTH_SHORT).show();
        Log.v("potato", "Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Destroyed", Toast.LENGTH_SHORT).show();
        Log.v("potato", "Destroyed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "RESTARTED", Toast.LENGTH_SHORT).show();
        Log.v("potato", "RESTARTED");
    }
}
