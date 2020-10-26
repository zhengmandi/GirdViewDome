package com.example.girdviewdome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private GridView grid_photo;
    private BaseAdapter mAdapter = null;
    private ArrayList<Icon> mData = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        grid_photo = findViewById(R.id.grid_photo);

        mData = new ArrayList<Icon>();
        mData.add(new Icon(R.drawable.iv_icon_2,"主题"));
        mData.add(new Icon(R.drawable.iv_icon_2data,"日历"));
        mData.add(new Icon(R.drawable.iv_icon_3clock,"闹钟"));
        mData.add(new Icon(R.drawable.iv_icon_4,"王者"));
        mData.add(new Icon(R.drawable.iv_icon_5weix,"微信"));
        mData.add(new Icon(R.drawable.iv_icon_6,"联系人"));
        mData.add(new Icon(R.drawable.iv_icon_7qq,"QQ"));
        mData.add(new Icon(R.drawable.iv_icon_8dy,"抖音"));
        mData.add(new Icon(R.drawable.iv_icon_9,"应用商店"));
        mData.add(new Icon(R.drawable.iv_icon_10,"天气"));
        mData.add(new Icon(R.drawable.iv_icon_11,"相机"));
        mData.add(new Icon(R.drawable.iv_icon_12,"相册"));
        mData.add(new Icon(R.drawable.iv_icon_13,"支付宝"));
        mData.add(new Icon(R.drawable.iv_icon_14,"淘宝"));
        mData.add(new Icon(R.drawable.iv_icon_15,"腾讯"));
        mData.add(new Icon(R.drawable.iv_icon_16,"爱奇艺"));
        mData.add(new Icon(R.drawable.iv_icon_17,"网易云音乐"));



        mAdapter = new MyAdapter<Icon>(mData,R.layout.item_grid_icon) {
            @Override
            public void bindView(ViewHolder holder, Icon obj) {
                holder.setImageResource(R.id.iv_icon,obj.getiId());

                holder.setText(R.id.tv_icon,obj.getiName());
            }

        };

        grid_photo.setAdapter(mAdapter);

        grid_photo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(mContext,"你点击了~" + i + "~项",Toast.LENGTH_SHORT).show();
            }
        });
    }
}