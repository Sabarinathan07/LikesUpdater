package com.sabari.demo;
import java.util.ArrayList;

import com.sabari.demo.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.Toast;

import android.widget.TextView;

public class Adapter extends BaseAdapter {
    ArrayList<Names> list;
	LayoutInflater inFlater;
	TextView tv,tv2;
	ImageButton bt;
	
	Context context;
    ListListener listener;
    public Adapter(Context context,ArrayList<Names> list,ListListener listener ){
    	this.list=list;
    	inFlater=LayoutInflater.from(context);
    	this.context=context;
    	this.listener=listener;
    }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(final int pos, View arg1, ViewGroup arg2) {
		View view = inFlater.inflate(R.layout.activity_adapter,arg2, false);
		
	    Names n =(Names)list.get(pos);
		tv=(TextView)view.findViewById(R.id.textView1);
		tv.setText(n.getName());
		bt=(ImageButton) view.findViewById(R.id.imageButton1);
		tv2=(TextView)view.findViewById(R.id.textView2);
		tv2.setText("likes"+n.getLikes());
	   bt.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg1) {
			
		
			listener.onItemClicked(pos);
			
		}
	});
		
		return view;
	}
//run panu open notepad
}
