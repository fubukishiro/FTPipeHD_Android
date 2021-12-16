package com.example.ftpipehd_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Thread trainThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.trainThread = new Thread(() -> {
            TextView msg = findViewById(R.id.train_message);
            msg.setText("Train Start");
        });
        trainThread.start();
    }
}