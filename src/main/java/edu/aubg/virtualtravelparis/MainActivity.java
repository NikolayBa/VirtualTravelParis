package edu.aubg.virtualtravelparis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.content.ServiceConnection;

public class MainActivity extends AppCompatActivity {
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openLandmarks(View view) {
        Intent intent = new Intent(this, LandmarksActivity.class);
        startActivity(intent);
    }

    public void openMaps(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void openQuickFacts(View view) {
        Intent intent = new Intent(this, QuickFactsActivity.class);
        startActivity(intent);
    }



    public void StartPlayingMusic(View view) {

        if (flag==0){
            Intent music = new Intent(this, MusicService.class);
            startService(music);
            flag=1;
        }
        else {
            Intent music = new Intent(this, MusicService.class);
            stopService(music);
            flag=0;
        }
    }
}
