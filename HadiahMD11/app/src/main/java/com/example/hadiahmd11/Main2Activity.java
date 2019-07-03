package com.example.hadiahmd11;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    MediaPlayer MP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    protected void onStop() {
        super.onStop();
        MP2.stop();
        MP2.release();
    }

    protected void onStart() {
        super.onStart();
        MP2 = MediaPlayer.create(this, R.raw.lagu2);
        MP2.setLooping(true);
        MP2.start();
    }
}
