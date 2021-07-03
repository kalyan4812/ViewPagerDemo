package com.saikalyandaroju.viewpagerdemo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


/*class ViewPageAdaper extends FragmentStateAdapter {


    public ViewPageAdaper(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment f=null;
        switch (position){
            case 0:
                f= new ChatsFragment();
                break;
            case 1:
                f=new PeopleFragment();
                break;

        }
        assert f != null;
        return f;

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}*/
