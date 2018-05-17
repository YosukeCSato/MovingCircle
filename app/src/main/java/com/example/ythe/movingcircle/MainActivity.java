package com.example.ythe.movingcircle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPauseが実行されました");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPlayer.stop();
        Log.d("TAG", "onRestartが実行されました");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStopが実行されました");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestartが実行されました");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStartが実行されました");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResumeが実行されました");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreateが実行されました");
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setText("Hello");
        mPlayer = MediaPlayer.create(this, R.raw.music);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyActivity.class);
                intent.putExtra("vx", 13);
                intent.putExtra("vy", 10);
                startActivity(intent);
                mPlayer.start();


            }
        });

    }
}
