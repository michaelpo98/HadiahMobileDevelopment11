package com.example.hadiahmd11;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer MP1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    protected void onResume() {
        super.onResume();
        MP1 = MediaPlayer.create(this,R.raw.lagu1);
        MP1.setLooping(true);
        MP1.start();
    }

    protected void onPause() {
        super.onPause();
        MP1.pause();
    }

    protected void onDestroy() {
        super.onDestroy();
        MP1.release();
    }

}
