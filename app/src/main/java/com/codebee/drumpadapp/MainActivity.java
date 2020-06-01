package com.codebee.drumpadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.AndroidException;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    private int s1,s2,s3,s4,s5,s6,s7,s8,s9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        s1 = sp.load(MainActivity.this,R.raw.sound1,1);
        s2 = sp.load(MainActivity.this,R.raw.sound2,1);
        s3 = sp.load(MainActivity.this,R.raw.sound3,1);
        s4 = sp.load(MainActivity.this,R.raw.sound4,1);
        s5 = sp.load(MainActivity.this,R.raw.sound5,1);
        s6 = sp.load(MainActivity.this,R.raw.sound6,1);
        s7 = sp.load(MainActivity.this,R.raw.sound7,1);
        s8 = sp.load(MainActivity.this,R.raw.sound8,1);
        s9 = sp.load(MainActivity.this,R.raw.sound9,1);
    }

    public void playSound1(View view){
       sp.play(s1,1,1,0,0,1);
    }
    public void playSound2(View view){
        sp.play(s2,1,1,0,0,1);
    }
    public void playSound3(View view){
        sp.play(s3,1,1,0,0,1);
    }
    public void playSound4(View view){
        sp.play(s4,1,1,0,0,1);
    }
    public void playSound5(View view){
        sp.play(s5,1,1,0,0,1);
    }
    public void playSound6(View view){
        sp.play(s6,1,1,0,0,1);
    }
    public void playSound7(View view){
        sp.play(s7,1,1,0,0,1);
    }
    public void playSound8(View view){
        sp.play(s8,1,1,0,0,1);
    }
    public void playSound9(View view){
        sp.play(s9,1,1,0,0,1);
    }

    @Override
    public void onBackPressed() {
        sp.release();
        sp = null;
        super.onBackPressed();
    }
}
