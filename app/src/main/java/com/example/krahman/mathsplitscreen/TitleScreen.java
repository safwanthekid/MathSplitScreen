package com.example.krahman.mathsplitscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.titlescreen);
    }
    public void StartClicked(View v){
        Intent a = new Intent(TitleScreen.this, MainActivity.class);
        startActivity(a);
    }

}
