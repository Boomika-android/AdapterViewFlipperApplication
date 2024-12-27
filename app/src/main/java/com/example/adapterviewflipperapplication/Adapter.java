package com.example.adapterviewflipperapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

    Context context;
    int [] images ;
    String [] names ;

    public Adapter(Context context, int[] images, String[] names){
        this.context = context;
        this.images = images;
        this.names = names;
    }

    public int getCount(){
        return images.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View view, ViewGroup viewGroup){
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, null);
        TextView textView = view.findViewById(R.id.txtView);
        ImageView imageView = view.findViewById(R.id.imgView);

        textView.setText(names[position]);
        imageView.setImageResource(images[position]);
        return view;

    }
}
