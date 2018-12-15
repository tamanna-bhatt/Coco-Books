package wolfsoft1.cocobooks;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

import Adapters.BookDetailAdapter;
import Models.BookDetailModelClass;

public class CocoBooksCollectionActivity extends AppCompatActivity {

    private ArrayList<BookDetailModelClass> bookDetailModelClasses;
    private RecyclerView recyclerView1;
    private BookDetailAdapter mAdapter;


    int image[]={R.drawable.coll1,R.drawable.coll2,R.drawable.coll4,R.drawable.coll4,
            R.drawable.coll1, R.drawable.coll2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_books_collection);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.BLACK);
        }


        recyclerView1 = findViewById(R.id.recyclerView3);
        RecyclerView.LayoutManager alayoutManager =  new GridLayoutManager(CocoBooksCollectionActivity.this,2);
        recyclerView1.setLayoutManager(alayoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        bookDetailModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            BookDetailModelClass beanClassForRecyclerView_contacts = new BookDetailModelClass(image[i]);
            bookDetailModelClasses.add(beanClassForRecyclerView_contacts);
        }
        mAdapter = new BookDetailAdapter(CocoBooksCollectionActivity.this,bookDetailModelClasses);
        recyclerView1.setAdapter(mAdapter);
    }
}
