package edu.aubg.virtualtravelparis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;


public class QuickFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_facts);

        ListView listView = (ListView) findViewById(R.id.mylistview);
        listView.setAdapter(new FactsAdapter(this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                selectFrag(v, position);

            }
        });
    }


    public void selectFrag(View view, int position) {
        Fragment fr;

        switch (position)
        {
            case '1':
                fr = new Fact1Fragment();
                break;
            case '2':
                fr = new Fact2Fragment();
                break;
            case '3':
                fr = new Fact3Fragment();
                break;
            case '4':
                fr = new Fact4Fragment();
                break;
            case '5':
                fr = new Fact5Fragment();
                break;
            case '6':
                fr = new Fact6Fragment();
                break;
            case '7':
                fr = new Fact7Fragment();
                break;
            case '8':
                fr = new Fact8Fragment();
                break;
            default:
                fr =  new Fact1Fragment();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();

    }

}

