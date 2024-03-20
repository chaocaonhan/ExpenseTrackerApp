package com.example.expensetrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Tạo một Runnable để chuyển activity sau 2 giây
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Đóng SplashActivity sau khi chuyển activity
            }
        };

        // Sử dụng Handler để thực hiện Runnable sau 2 giây
        Handler handler = new Handler();
        handler.postDelayed(runnable, 2000); // 2000 milliseconds = 2 giây
    }
}
