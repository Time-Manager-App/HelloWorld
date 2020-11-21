package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rl);
    }
    /*
    点击事件的方法
    login 和 v 可以任意修改
     */
    public void login1(View v) {
        Log.i("Mainactivity", "clicked");
    }
}