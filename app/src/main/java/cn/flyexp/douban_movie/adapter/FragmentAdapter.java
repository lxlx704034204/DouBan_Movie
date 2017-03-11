package cn.flyexp.douban_movie.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import cn.flyexp.douban_movie.assistview.LazyFragment;

/**
 * 功能：主页引导栏的三个Fragment页面设置适配器
 */
public class FragmentAdapter extends FragmentPagerAdapter {
    private List<LazyFragment> fragments;

    public FragmentAdapter(FragmentManager fm, List<LazyFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public Fragment getItem(int fragment) {
        return fragments.get(fragment);
    }

    public int getCount() {
        return fragments.size();
    }

}