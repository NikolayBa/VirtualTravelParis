package edu.aubg.virtualtravelparis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.Toast;

public class LandmarksActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new FactsAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(LandmarksActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}