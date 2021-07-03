package com.saikalyandaroju.viewpagerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.saikalyandaroju.viewpagerdemo.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2=findViewById(R.id.view_pager2);
        viewPager2.setAdapter(new MyAdapter());
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        
    }
}