package com.gyj.dialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.gyj.dialogdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements SetMyTime.DateCallback {
        ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetMyTime setMyTime =new SetMyTime();
                setMyTime.show(getSupportFragmentManager(),"设置时间");

            }
        });
    }

    @Override
    public void getDate(String date) {
        binding.button1.setText(date);
    }
}