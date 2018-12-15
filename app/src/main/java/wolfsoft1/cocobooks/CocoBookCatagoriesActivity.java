package wolfsoft1.cocobooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapters.BookCatgorieAdapter;
import Adapters.BookCatgorieAdapter2;
import Adapters.GridAdapter;
import Adapters.HomeRecyclerAdapter;
import Models.GridModel;
import Models.HomeRecycleModelClass;

public class CocoBookCatagoriesActivity extends AppCompatActivity {

    ImageView search,menu;
    TextView txt;

    private ArrayList<GridModel> homeListModelClassArrayList1;
    private RecyclerView recyclerView;
    private BookCatgorieAdapter bAdapter;

    private ArrayList<HomeRecycleModelClass> homeListModelClassArrayList2;
    private RecyclerView recyclerView1;
    private BookCatgorieAdapter2 mAdapter;


    String fieldName[]={"Photography","Art & Design","Medicine","Detective"};
    Integer fieldImage[]={R.drawable.photography,R.drawable.art,R.drawable.medicine,R.drawable.detective};

String bookName[]={"Science Fiction","Art & Design","Education","Health, Mind & Body","Novels"};
String authorName[]={"129 Books","43 Magazine  65 Books","10 Magazine  39 Books","240 Books","339 Books"};
Integer bookImage[]={R.drawable.android,R.drawable.artdesign,R.drawable.education,R.drawable.health,R.drawable.novels};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_book_catagories);

        search=(ImageView)findViewById(R.id.search);
        menu=(ImageView)findViewById(R.id.menu);
        txt=(TextView)findViewById(R.id.txt);
        txt.setText("Categories");

        search.setVisibility(View.VISIBLE);
       // menu.setVisibility(View.VISIBLE);

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CocoBookCatagoriesActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < fieldName.length; i++) {
            GridModel beanClassForRecyclerView_contacts = new GridModel(fieldName[i],fieldImage[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new BookCatgorieAdapter(CocoBookCatagoriesActivity.this,homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);



        recyclerView1 = findViewById(R.id.recyclerView1);
        RecyclerView.LayoutManager alayoutManager = new LinearLayoutManager(CocoBookCatagoriesActivity.this);
        recyclerView1.setLayoutManager(alayoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList2 = new ArrayList<>();

        for (int i = 0; i < bookImage.length; i++) {
            HomeRecycleModelClass beanClassForRecyclerView_contacts = new HomeRecycleModelClass(bookImage[i],bookName[i],authorName[i]);
            homeListModelClassArrayList2.add(beanClassForRecyclerView_contacts);
        }
        mAdapter = new BookCatgorieAdapter2(CocoBookCatagoriesActivity.this,homeListModelClassArrayList2);
        recyclerView1.setAdapter(mAdapter);
    }
}
