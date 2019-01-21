package com.md.pjatk.kidsvocabularygame;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;


public class MyService extends Service {
    //creating a mediaplayer object
    private MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        player = MediaPlayer.create(this,
                R.raw.happymusic);
        player.setLooping(true);

        //staring the player
        player.start();

        return START_STICKY;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();
    }
}