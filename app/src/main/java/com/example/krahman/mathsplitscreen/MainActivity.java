package com.example.krahman.mathsplitscreen;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    static Player PlayerOne = new Player();
    static Player PlayerTwo = new Player();
    float time;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeBottomSetUp();
        changeTopSetUp();
        time = System.nanoTime();




    }
    public void Bottom0(View v){
        if (PlayerOne.resolve(0)){
            isBottomCorrect();
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            }catch(Exception e){

            }
            changeBottomSetUp();
        }else{
            isBottomFalse();
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(Exception e){

            }
            changeBottomSetUp();
        }


    }


    public void Bottom1(View v){
        if (PlayerOne.resolve(1)){
            isBottomCorrect();
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            }catch(Exception e){

            }
            changeBottomSetUp();
        }else{
            isBottomFalse();
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(Exception e){

            }
            changeBottomSetUp();
        }

    }
    public void Bottom2(View v){
        if (PlayerOne.resolve(2)){
            isBottomCorrect();
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            }catch(Exception e){

            }
            changeBottomSetUp();
        }else{
            isBottomFalse();
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(Exception e){

            }
            changeBottomSetUp();
        }

    }
    public void Bottom3(View v){
        if (PlayerOne.resolve(3)){
            isBottomCorrect();
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            }catch(Exception e){

            }
            changeBottomSetUp();
        }else{
            isBottomFalse();
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(Exception e){

            }
            changeBottomSetUp();
        }

    }
    public void changeBottomSetUp(){
        PlayerOne.setUpProblem();
        TextView BottomText = (TextView) findViewById(R.id.BottomText);
        BottomText.setText(PlayerOne.getCurrentProblem());

        Button bottomZero = (Button) findViewById(R.id.BottomZero);
        bottomZero.setText(PlayerOne.getCurrentAnswer1());

        Button bottomOne = (Button) findViewById(R.id.BottomOne);
        bottomOne.setText(PlayerOne.getCurrentAnswer2());

        Button bottomTwo = (Button) findViewById(R.id.BottomTwo);
        bottomTwo.setText(PlayerOne.getCurrentAnswer3());

        Button bottomThree = (Button) findViewById(R.id.BottomThree);
        bottomThree.setText(PlayerOne.getCurrentAnswer4());
    }
    public void isBottomCorrect(){
        TextView BottomCorrect = (TextView) findViewById(R.id.BottomCorrect);
        BottomCorrect.setTextColor(Color.parseColor("#4EA743"));
        TextView BottomIncorrect = (TextView) findViewById(R.id.BottomIncorrect);
        BottomIncorrect.setTextColor(Color.parseColor("#60caf6"));
        scoreLine();
        Timer();
    }
    public void isBottomFalse(){
        TextView BottomCorrect = (TextView) findViewById(R.id.BottomCorrect);
        BottomCorrect.setTextColor(Color.parseColor("#60caf6"));
        TextView BottomIncorrect = (TextView) findViewById(R.id.BottomIncorrect);
        BottomIncorrect.setTextColor(Color.parseColor("#CE2222"));
        scoreLine();
        Timer();
    }
    /*public void stopTime(long milliseconds){
        long startTime = System.currentTimeMillis();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        while(milliseconds > elapsedTime){
            stopTime = System.currentTimeMillis();
            elapsedTime = stopTime - startTime;
        }
    }*/
    //THIS IS GOING TO BE ABOUT THE TOP PORTION
    public void changeTopSetUp(){
        PlayerTwo.setUpProblem();
        TextView BottomText = (TextView) findViewById(R.id.TopText);
        BottomText.setText(PlayerTwo.getCurrentProblem());

        Button bottomZero = (Button) findViewById(R.id.TopButtonZero);
        bottomZero.setText(PlayerTwo.getCurrentAnswer1());

        Button bottomOne = (Button) findViewById(R.id.TopButtonOne);
        bottomOne.setText(PlayerTwo.getCurrentAnswer2());

        Button bottomTwo = (Button) findViewById(R.id.TopButtonTwo);
        bottomTwo.setText(PlayerTwo.getCurrentAnswer3());

        Button bottomThree = (Button) findViewById(R.id.TopButtonThree);
        bottomThree.setText(PlayerTwo.getCurrentAnswer4());
    }
    public void Top0(View v){
        if (PlayerTwo.resolve(0)){
            isTopCorrect();
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            }catch(Exception e){

            }
            changeTopSetUp();
        }else{
            isTopFalse();
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(Exception e){

            }
            changeTopSetUp();
        }


    }
    public void Top1(View v){
        if (PlayerTwo.resolve(1)){
            isTopCorrect();
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            }catch(Exception e){

            }
            changeTopSetUp();
        }else{
            isTopFalse();
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(Exception e){

            }
            changeTopSetUp();
        }


    }
    public void Top2(View v){
        if (PlayerTwo.resolve(2)){
            isTopCorrect();
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            }catch(Exception e){

            }
            changeTopSetUp();
        }else{
            isTopFalse();
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(Exception e){

            }
            changeTopSetUp();
        }


    }
    public void Top3(View v){
        if (PlayerTwo.resolve(3)){
            isTopCorrect();
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            }catch(Exception e){

            }
            changeTopSetUp();
        }else{
            isTopFalse();
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(Exception e){

            }
            changeTopSetUp();
        }


    }
    public void isTopCorrect(){
        TextView BottomCorrect = (TextView) findViewById(R.id.TopCorrect);
        BottomCorrect.setTextColor(Color.parseColor("#4EA743"));
        TextView BottomIncorrect = (TextView) findViewById(R.id.TopIncorrect);
        BottomIncorrect.setTextColor(Color.parseColor("#ffc7c7"));
        scoreLine();
        Timer();
    }
    public void isTopFalse(){
        TextView BottomCorrect = (TextView) findViewById(R.id.TopCorrect);
        BottomCorrect.setTextColor(Color.parseColor("#ffc7c7"));
        TextView BottomIncorrect = (TextView) findViewById(R.id.TopIncorrect);
        BottomIncorrect.setTextColor(Color.parseColor("#CE2222"));
        scoreLine();
        Timer();
    }
    public void scoreLine(){
        LinearLayout bar5 = (LinearLayout) findViewById(R.id.bar5);
        LinearLayout bar4 = (LinearLayout) findViewById(R.id.bar4);
        LinearLayout bar3 = (LinearLayout) findViewById(R.id.bar3);
        LinearLayout bar2 = (LinearLayout) findViewById(R.id.bar2);
        LinearLayout bar1 = (LinearLayout) findViewById(R.id.bar1);

        int diff = PlayerOne.getScore() - PlayerTwo.getScore();

        if(diff >= -1 && diff <= 1){
            bar5.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar4.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar3.setBackgroundColor(Color.parseColor("#d0d0d0"));
            bar2.setBackgroundColor(Color.parseColor("#60caf6"));
            bar1.setBackgroundColor(Color.parseColor("#60caf6"));
        }else if(diff >= 2 && diff <= 3){

            bar5.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar4.setBackgroundColor(Color.parseColor("#d0d0d0"));
            bar3.setBackgroundColor(Color.parseColor("#60caf6"));
            bar2.setBackgroundColor(Color.parseColor("#60caf6"));
            bar1.setBackgroundColor(Color.parseColor("#60caf6"));
        }else if(diff >= -3 && diff <= -2){
            bar5.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar4.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar3.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar2.setBackgroundColor(Color.parseColor("#d0d0d0"));
            bar1.setBackgroundColor(Color.parseColor("#60caf6"));
        }else if(diff == 4){
            bar5.setBackgroundColor(Color.parseColor("#d0d0d0"));
            bar4.setBackgroundColor(Color.parseColor("#60caf6"));
            bar3.setBackgroundColor(Color.parseColor("#60caf6"));
            bar2.setBackgroundColor(Color.parseColor("#60caf6"));
            bar1.setBackgroundColor(Color.parseColor("#60caf6"));
        }else if(diff == -4){
            bar5.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar4.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar3.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar2.setBackgroundColor(Color.parseColor("#ffc7c7"));
            bar1.setBackgroundColor(Color.parseColor("#d0d0d0"));
        }else if(diff >= 5){
            Intent a = new Intent(MainActivity.this, Player1Win.class);
            startActivity(a);
        }else if(diff <= -5){
            Intent a = new Intent(MainActivity.this, Player2Win.class);
            startActivity(a);
        }

    }
    public void Timer(){
        if (System.nanoTime() - time > 20000000000f){
            Toast.makeText(getApplicationContext(), "Times Up!!",
                    Toast.LENGTH_SHORT).show();
            int diff = PlayerOne.getScore() - PlayerTwo.getScore();
            PlayerOne.resetScore();
            PlayerTwo.resetScore();
            if(diff>0) {
                Intent a = new Intent(MainActivity.this, Player1Win.class);
                startActivity(a);
            }else if(diff<0){
                Intent a = new Intent(MainActivity.this, Player2Win.class);
                startActivity(a);
            }else{
                Intent a = new Intent(MainActivity.this, TitleScreen.class);
                startActivity(a);
            }

        }else{
            //nothing happens
        }
    }

}
