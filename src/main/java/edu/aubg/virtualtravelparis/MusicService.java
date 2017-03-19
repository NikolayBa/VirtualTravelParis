package edu.aubg.virtualtravelparis;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.media.MediaPlayer;

public class MusicService extends Service {
    public MusicService() {
    }

    MediaPlayer mPlayer;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //TODO do something useful
        return Service.START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        return null;
    }

    @Override
    public void onCreate () {
        super.onCreate();

        mPlayer = MediaPlayer.create(this, R.raw.french_chill_music);

        mPlayer.start();

        if (mPlayer != null) {
            mPlayer.setLooping(true);
            mPlayer.setVolume(100, 100);
        }
    }
}
