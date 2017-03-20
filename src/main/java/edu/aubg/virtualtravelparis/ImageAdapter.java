package edu.aubg.virtualtravelparis;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
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

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 167));
            imageView.setScaleType(ImageView.ScaleType.FIT_END);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.paris_landmarks_01, R.drawable.paris_landmarks_02,
            R.drawable.paris_landmarks_03, R.drawable.paris_landmarks_04,
            R.drawable.paris_landmarks_05, R.drawable.paris_landmarks_06,
            R.drawable.paris_landmarks_07, R.drawable.paris_landmarks_08,
            R.drawable.paris_landmarks_09, R.drawable.paris_landmarks_10,
            R.drawable.paris_landmarks_11, R.drawable.paris_landmarks_12,
            R.drawable.paris_landmarks_13, R.drawable.paris_landmarks_14
    };
}