package com.android.design;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    private static String[] OS_NAME = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
            "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
            "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
            "Android", "iPhone", "WindowsMobile" };

    private static String[] OS_NAME_SHORT = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X"};

    private static String[] OS_NAME_SHORT_MORE = new String[] { "Android", "iPhone", "WindowsMobile"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Chat");
        setSupportActionBar(toolbar);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.addTab("Cars", new CommonFragment(), 1);
        pagerAdapter.addTab("Bike", new CommonFragment(), 2);
        pagerAdapter.addTab("HMV", new CommonFragment(), 3);
        pager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(pager);

       /* // Iterate over all tabs and set the custom view
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(pagerAdapter.getTabView(i));
        }*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class PagerAdapter extends FragmentStatePagerAdapter{

        private final HashMap<Integer, Fragment> mFragments;
        private final ArrayList<Integer> mTabNums;
        private final ArrayList<CharSequence> mTabTitles;

        @SuppressLint("UseSparseArrays")
        public PagerAdapter(FragmentManager fm) {
            super(fm);
            mFragments = new HashMap<Integer, Fragment>(3);
            mTabNums = new ArrayList<Integer>(3);
            mTabTitles = new ArrayList<CharSequence>(3);
        }

        public void addTab(String tabTitle, Fragment newFragment, int tabId) {
            mTabTitles.add(tabTitle);
            mFragments.put(tabId, newFragment);
            mTabNums.add(tabId);
            notifyDataSetChanged();
        }

        public Fragment getTabFragment(int tabNum) {
            if (mFragments.containsKey(tabNum)) {
                return mFragments.get(tabNum);
            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabTitles.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 0)
            {
                CommonFragment frag1 = (CommonFragment) mFragments.get(mTabNums.get(position));
                frag1.setData(OS_NAME);
                return frag1;
            }else if(position == 1){
                CommonFragment frag2 = (CommonFragment) mFragments.get(mTabNums.get(position));
                frag2.setData(OS_NAME_SHORT);
                return frag2;
            }else{
                CommonFragment frag3 = (CommonFragment) mFragments.get(mTabNums.get(position));
                frag3.setData(OS_NAME_SHORT_MORE);
                return frag3;
            }
        }
    }

    public static class CommonFragment extends Fragment{
        String[] data;

        public void setData(String[] data){
            this.data = data;
        }
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView =  inflater.inflate(R.layout.layout,container,false);
            ListView listView = (ListView) rootView.findViewById(R.id.list);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
            listView.setAdapter(adapter);
            return rootView;
        }
    }

    public static class MessageFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView =  inflater.inflate(R.layout.layout,container,false);
            ListView listView = (ListView) rootView.findViewById(R.id.list);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,OS_NAME);
            listView.setAdapter(adapter);
            return rootView;
        }
    }

    public static class ContactsFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView =  inflater.inflate(R.layout.layout,container,false);
            ListView listView = (ListView) rootView.findViewById(R.id.list);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,OS_NAME);
            listView.setAdapter(adapter);
            return rootView;
        }
    }
}
