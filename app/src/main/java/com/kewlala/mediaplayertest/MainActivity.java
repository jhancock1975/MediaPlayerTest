package com.kewlala.mediaplayertest;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer myMediaPlayer = new MediaPlayer();
    Integer currentPosition = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myMediaPlayer = MediaPlayer.create(this, R.raw.long_fart);


        // Find the View that shows the numbers category
        Button playButton = (Button) findViewById(R.id.play_button);

        // Set a click listener on that View
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Log.d(this.getClass().getSimpleName() + "onCreate::", "play button tap");
                    myMediaPlayer.start();

            }
        });

        // Find the View that shows the numbers category
        Button pauseButton = (Button) findViewById(R.id.pause_button);

        // Set a click listener on that View
        pauseButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Log.d(this.getClass().getSimpleName() + "onCreate::", "pause button tap");
                myMediaPlayer.pause();
            }
        });

        // Find the View that shows the numbers category
        Button volumeButton = (Button) findViewById(R.id.volume_button);

        // Set a click listener on that View
        volumeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Log.d(this.getClass().getSimpleName() + "onCreate::", "volume button tap");
                myMediaPlayer.setVolume(0.5f, 0.5f);
            }
        });



    }
}
