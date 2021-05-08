package com.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
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
        button.setOnClickListener(v -> addAngka());
        mainViewModel.getAngka().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText(String.valueOf(integer));
            }
        });


//      lifecicle tanpa kelas mutablelivedata
//        textView.setText(String.valueOf(mainViewModel.setAngka()));
//    }
//
//    public void addAngka(){
//        mainViewModel.addAngka();
//        textView.setText(String.valueOf(mainViewModel.setAngka()));
    }
    public void addAngka(){
        mainViewModel.addAngka();
    }
}