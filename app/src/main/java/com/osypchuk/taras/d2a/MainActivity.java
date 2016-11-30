package com.osypchuk.taras.d2a;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.osypchuk.taras.d2a.Interfaces.OnFragmentInteractionListener;
import com.osypchuk.taras.d2a.Tabs.FragmentTab2;
import com.osypchuk.taras.d2a.adapters.PagerAdapter;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private final static String API_KEY = "73EE0AFD6C12F2AB4605F611C2AB86EF";
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        fragmentManager = getSupportFragmentManager();

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (fragmentManager, tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(String uri) {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.acc, new FragmentTab2());
        fragmentTransaction.commit();

    }


}