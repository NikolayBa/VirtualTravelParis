package edu.aubg.virtualtravelparis;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class FactsAdapter extends BaseAdapter {
    private Context mContext;

    public FactsAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            textView = new TextView(mContext);
         } else {
            textView = (TextView) convertView;
        }

        textView.setText(mThumbIds[position]);
        return textView;
    }

    // references to our images
    private String[] mThumbIds = {
            "Fact1", "Fact2", "Fact3",
            "Fact3", "Fact4", "Fact5",
            "Fact6", "Fact7", "Fact8"
    };
}

