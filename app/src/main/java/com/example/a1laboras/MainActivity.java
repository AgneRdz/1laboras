package com.example.a1laboras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnMainClick(View view) {
        TextView tvMain = (TextView)findViewById(R.id.tvMain);
        tvMain.setText("smth new");
    }
}