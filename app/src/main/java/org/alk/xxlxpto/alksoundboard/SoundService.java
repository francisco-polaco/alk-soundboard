package org.alk.xxlxpto.alksoundboard;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import java.util.ArrayList;

public class SoundService extends Service implements MediaPlayer.OnPreparedListener {
    private static final String ACTION_PLAY = "com.example.action.PLAY";
    MediaPlayer mMediaPlayer = null;

    public SoundService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void setMediaPlayer(MediaPlayer mediaPlayer){
        mMediaPlayer = mediaPlayer;
    }


    public int onStartCommand(Intent intent, int flags, int startId) {
        int sound = intent.getExtras().getInt(Constants.SOUNDS);
        mMediaPlayer = MediaPlayer.create(this, sound);// initialize it here
        mMediaPlayer.setOnPreparedListener(this);
        mMediaPlayer.prepareAsync(); // prepare async to not block main thread
        return 1;
    }

    /** Called when MediaPlayer is ready */
    public void onPrepared(MediaPlayer player) {
        player.start();
        player.release();
        setMediaPlayer(null);
        stopSelf();
    }
}
