package com.mdazizulhakim.worldsbestplacestovisit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MD AZIZUL HAKIM on 04/02/2017.
 */

public class CustomAdapter extends BaseAdapter {

    String Placedata[];
    int Icon[];

    LayoutInflater inflater;

    public CustomAdapter(Context context ,String[] Placedata,int[] Icon){

        this.Placedata = Placedata;
        this.Icon = Icon;

        inflater = (LayoutInflater.from(context));


    }
    @Override
    public int getCount() {
        return Placedata.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.list_style,parent,false);
        TextView textView = (TextView) convertView.findViewById(R.id.txtListdata);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imgLicon);
        textView.setText(Placedata[position]);
        imageView.setImageResource(Icon[position]);
        return convertView;
    }
}
