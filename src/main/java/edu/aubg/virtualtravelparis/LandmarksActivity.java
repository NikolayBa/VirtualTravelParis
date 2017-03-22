package edu.aubg.virtualtravelparis;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.AdapterView;

public class LandmarksActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                selectLandmarkFrag(v, position);
            }
        });
    }

    public void selectLandmarkFrag(View view, int position) {
        Fragment fr;

        switch (position) {
            case 0:
                fr = new Landmarks1Fragment();
                break;
            case 1:
                fr = new Landmarks2Fragment();
                break;
            case 2:
                fr = new Landmarks3Fragment();
                break;
            case 3:
                fr = new Landmarks4Fragment();
                break;
            case 4:
                fr = new Landmarks5Fragment();
                break;
            case 5:
                fr = new Landmarks6Fragment();
                break;
            case 6:
                fr = new Landmarks7Fragment();
                break;
            case 7:
                fr = new Landmarks8Fragment();
                break;
            case 8:
                fr = new Landmarks9Fragment();
                break;
            case 9:
                fr = new Landmarks10Fragment();
                break;
            case 10:
                fr = new Landmarks11Fragment();
                break;
            case 11:
                fr = new Landmarks12Fragment();
                break;
            case 12:
                fr = new Landmarks13Fragment();
                break;
            case 13:
                fr = new Landmarks14Fragment();
                break;
            default:
                fr = new Landmarks1Fragment();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();
    }
}