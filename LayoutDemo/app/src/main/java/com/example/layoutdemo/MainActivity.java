package com.example.layoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SayHi(View view) {
        Log.d("Here", "here");
        Toast.makeText(this,"Hi From Test Lab", Toast.LENGTH_LONG).show();
        //Uncomment to test debugging with a code bug
        //int crashy = 1/0;
    }
}
