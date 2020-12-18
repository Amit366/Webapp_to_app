package com.example.webapp_to_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Window window=getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAGS_CHANGED);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        Thread thread=new Thread(){
            public void run(){

                try {

                    sleep(4000);
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                super.run();
            }

        };
        thread.start();
    }
}