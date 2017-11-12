package com.example.krahman.mathsplitscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Player1Win extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winscreenplayer1);
    }
    public void StartClickedMenu(View v){
        Intent a = new Intent(Player1Win.this, TitleScreen.class);
        startActivity(a);
    }
    public void StartClickedPlay(View v) {
        Intent a = new Intent(Player1Win.this, MainActivity.class);
        startActivity(a);
    }
}
