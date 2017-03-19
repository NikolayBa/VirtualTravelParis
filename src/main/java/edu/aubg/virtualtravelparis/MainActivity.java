package edu.aubg.virtualtravelparis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

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
}
