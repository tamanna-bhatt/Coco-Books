package wolfsoft1.cocobooks;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Adapters.IconAdapter;

public class CocoBookHome2Activity extends AppCompatActivity {

    int selectedPos =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_book_home2);

        final TabLayout tabLayout = findViewById(R.id.tab);
        final ViewPager viewPager = findViewById(R.id.vp);

        tabLayout.setTabMode(tabLayout.MODE_FIXED);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.books));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.author));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.collection));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.favourite));


        tabLayout.setTabGravity(TabLayout.MODE_FIXED);
        IconAdapter tabAdapter = new IconAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(tabAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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
}



