package wolfsoft1.cocobooks;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import Adapters.FictionAdapter;
import Adapters.FictionTabAdapter;
import Adapters.LibraryAdapter;

public class CocoBookFictionActivity extends AppCompatActivity {
    TextView txt;
    ImageView search,menu;

    WrapContentHeightViewPager wrapContentHeightViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_book_fiction);
        txt=(TextView)findViewById(R.id.txt);
        search=(ImageView)findViewById(R.id.search);
        menu=(ImageView)findViewById(R.id.menu);
        txt.setText("Fiction");
        search.setVisibility(View.VISIBLE);
        menu.setVisibility(View.VISIBLE);
        TabLayout tabLayout = findViewById(R.id.tab);
        wrapContentHeightViewPager = (WrapContentHeightViewPager)findViewById(R.id.vp);

        tabLayout.setTabMode(tabLayout.MODE_SCROLLABLE);
        tabLayout.addTab(tabLayout.newTab().setText("DETAIL"));
        tabLayout.addTab(tabLayout.newTab().setText("REVIEWS"));
        tabLayout.addTab(tabLayout.newTab().setText("RELATED"));

        tabLayout.setTabGravity(TabLayout.MODE_FIXED);
        FictionTabAdapter tabAdapter1 = new FictionTabAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        wrapContentHeightViewPager.setAdapter(tabAdapter1);

        wrapContentHeightViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                wrapContentHeightViewPager.setCurrentItem(tab.getPosition());

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




