package com.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    MainViewModel mainViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addAngka();
            }
        });
        textView.setText(String.valueOf(mainViewModel.setAngka()));
    }

    public void addAngka(){
        mainViewModel.addAngka();
        textView.setText(String.valueOf(mainViewModel.setAngka()));
    }
}