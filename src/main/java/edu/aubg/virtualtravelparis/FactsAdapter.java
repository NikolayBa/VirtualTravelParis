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
    private Integer[] mThumbIds = {
            R.string.fact1, R.string.fact2, R.string.fact3,
            R.string.fact4, R.string.fact5, R.string.fact6,
            R.string.fact7, R.string.fact8,
    };
}

