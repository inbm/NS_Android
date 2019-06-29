package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_action;
    TextView tv_target;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_action = findViewById(R.id.btn_action);
        tv_target = findViewById(R.id.tv_target);

        btn_action.setOnClickListener( c -> {
            tv_target.setText("test");
        });
    }
}
