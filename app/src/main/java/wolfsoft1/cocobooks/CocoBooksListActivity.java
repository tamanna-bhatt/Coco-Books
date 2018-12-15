package wolfsoft1.cocobooks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import Adapters.CocoBooksListRecycleAdapter;
import Models.CocoBooksListModelClass;

public class CocoBooksListActivity extends AppCompatActivity {
    private ArrayList<CocoBooksListModelClass> cocoBooksListModelClasses;
    private RecyclerView recyclerView;
    private CocoBooksListRecycleAdapter bAdapter;

    String txt[]={"CocoBookGerneActivity","CocoBooksHomeActivity","CocoBooksHome1Activity","CocoBookHome2Activity",
    "CocoBooksLibraryActivity","CocoBookCatagoriesActivity","CocoBookDetailActivity","CocoBookAuthorActivity",
    "CocoBooksReadActivity","CocoBooksCollectionActivity","CocoBookFictionActivity"};

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_books_list);

        textView = (TextView)findViewById(R.id.number);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+917490844738"));
                startActivity(intent);

            }
        });


        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CocoBooksListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        cocoBooksListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            CocoBooksListModelClass beanClassForRecyclerView_contacts = new CocoBooksListModelClass(txt[i]);
            cocoBooksListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new CocoBooksListRecycleAdapter(CocoBooksListActivity.this,cocoBooksListModelClasses);
        recyclerView.setAdapter(bAdapter);

    }
}
