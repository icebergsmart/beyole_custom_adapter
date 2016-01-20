package com.beyole.custombaseadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.beyole.adapter.CommonAdapter;
import com.beyole.adapter.ViewHolder;
import com.beyole.bean.Bean;

public class MainActivity extends Activity {

	private ListView mListView;
	private List<Bean> mDatas = new ArrayList<Bean>();
	private CommonAdapter<Bean> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (ListView) findViewById(R.id.lv_main);
		Bean bean1 = null;
		for (int i = 0; i < 9; i++) {
			bean1 = new Bean("红色钱包" + i, "周三早上丢失了红色钱包，在食堂二楼" + i, "1570511635" + i, "2016/01/" + i);
			mDatas.add(bean1);
		}
		mListView.setAdapter(adapter = new CommonAdapter<Bean>(getApplicationContext(), mDatas, R.layout.item) {

			@Override
			public void convert(ViewHolder viewHolder, Bean item) {
				viewHolder.setText(R.id.tv_title, item.getTitle());
				viewHolder.setText(R.id.tv_describe, item.getDescribe());
				viewHolder.setText(R.id.tv_phone, item.getPhone());
				viewHolder.setText(R.id.tv_time, item.getTime());
			}
		});
	}
}
