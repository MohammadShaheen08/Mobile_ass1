package com.example.ass11;

import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;




import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
    public void btnShow(View view){
        Intent intent = new Intent(MainActivity.this, activity_2.class);
        startActivity(intent);
    }
    public void btnpractice(View view){
        Intent intent = new Intent(MainActivity.this, activity_3.class);
        startActivity(intent);
    }
}
