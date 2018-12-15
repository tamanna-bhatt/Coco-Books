package wolfsoft1.cocobooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView screen1,screen2,screen3,screen4,screen5,screen6,screen7,screen8,screen9,screen10,screen11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen1=(TextView)findViewById(R.id.screen1);
        screen2=(TextView)findViewById(R.id.screen2);
        screen3=(TextView)findViewById(R.id.screen3);
        screen4=(TextView)findViewById(R.id.screen4);
        screen5=(TextView)findViewById(R.id.screen5);
        screen6=(TextView)findViewById(R.id.screen6);
        screen7=(TextView)findViewById(R.id.screen7);
        screen8=(TextView)findViewById(R.id.screen8);
        screen9=(TextView)findViewById(R.id.screen9);
        screen10=(TextView)findViewById(R.id.screen10);
        screen11=(TextView)findViewById(R.id.screen11);






        screen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBookGerneActivity.class);
                startActivity(intent);
            }
        });

        screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBooksHomeActivity.class);
                startActivity(intent);
            }
        });

        screen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBooksHome1Activity.class);
                startActivity(intent);
            }
        });

        screen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBookHome2Activity.class);
                startActivity(intent);
            }
        });

        screen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBooksLibraryActivity.class);
                startActivity(intent);
            }
        });
        screen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBookCatagoriesActivity.class);
                startActivity(intent);
            }
        });
        screen7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBookDetailActivity.class);
                startActivity(intent);
            }
        });
        screen8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBookAuthorActivity.class);
                startActivity(intent);
            }
        });

        screen9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBooksReadActivity.class);
                startActivity(intent);
            }
        });

        screen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBooksCollectionActivity.class);
                startActivity(intent);
            }
        });

        screen11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CocoBookFictionActivity.class);
                startActivity(intent);
            }
        });


    }
}
