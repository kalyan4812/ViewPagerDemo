package com.saikalyandaroju.viewpagerdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.saikalyandaroju.viewpagerdemo.adapter.MyAdapter;

public class SecondaryActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        tabLayout = findViewById(R.id.tablayout);
        viewPager2 = findViewById(R.id.view_pager2);
        viewPager2.setAdapter(new MyAdapter());
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText("Tab " + (position + 1));
                tab.setIcon(R.drawable.ic_launcher_background);
            }
        }).attach();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    /*
        use viewpageradapter class(in adapter package) type of thing for switching b/w fragments.
     */
    /* setting up icons.
     int[] tabIcons = {
                R.drawable.tab_chat_icon_selector,
                R.drawable.tab_thread_icon_selector,
                R.drawable.tab_leaderboard_icon_selector
        };
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);

     */

    /* to change the color of tab icon based on selected or not selected.
     int tab_icon_color= ContextCompat.getColor(getApplicationContext(),R.color.white);
               tab.getIcon().setColorFilter(tab_icon_color, PorterDuff.Mode.SRC_IN);
     */
}