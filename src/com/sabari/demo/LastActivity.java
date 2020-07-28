package com.sabari.demo;

import java.util.ArrayList;

//import com.example.vote.EventName;
import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class LastActivity extends Activity implements ListListener {
	ListView lv;
	
	ArrayList<Names> list=new ArrayList<Names>();
	
	
	Adapter adt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_last);
		lv=(ListView) findViewById(R.id.listView1);
		
		
		list.add(new Names("SABARI",0));
        list.add(new Names("SANDY",0));
        list.add(new Names("MONY",0));
        list.add(new Names("MANDY",0));
        list.add(new Names("PRANAV",0));
        list.add(new Names("YOKESH",0));
        list.add(new Names("SAI",0));
        list.add(new Names("HARI",0));
        list.add(new Names("YESWANTH",0));
        list.add(new Names("ANGEL",0));
        list.add(new Names("SHRUTHI",0));
        list.add(new Names("SANDHIYA",0));
        list.add(new Names("SWETHA",0));
        list.add(new Names("KEERTHI",0));
        list.add(new Names("SUJI",0));
        list.add(new Names("SIVA",0));
        list.add(new Names("ROSHINI",0));
        list.add(new Names("MOHAN",0));
        list.add(new Names("RUTH",0));
        list.add(new Names("NANDHA",0));
        list.add(new Names("BALAJI",0));
        list.add(new Names("INIYAN",0));
        list.add(new Names("SATHISH",0));
        list.add(new Names("SUSI",0));
        list.add(new Names("NARENDRA",0));
        list.add(new Names("VICKY",0));
        list.add(new Names("SUBHASH",0));
		
		 adt=new Adapter(LastActivity.this,list,this);
		lv.setAdapter(adt);

		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.last, menu);
		return true;
	}
	@Override
	public void onItemClicked(int pos) {
		//Toast.makeText(LastActivity.this, "pos"+pos, Toast.LENGTH_LONG).show();
		
		//int likes  =0;
		//likes=((Names) names.get(pos)).getLikes();
		//likes+=1;
		//n.setLikes(likes);
		Names name = list.get(pos);
		name.setLikes(name.getLikes()+1);
		adt.notifyDataSetChanged();
		
		
		
		
		
		
	}


}
