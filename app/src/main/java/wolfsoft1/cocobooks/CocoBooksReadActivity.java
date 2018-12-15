package wolfsoft1.cocobooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CocoBooksReadActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt;
    ImageView search,menu;

    ImageView img_play,img_pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_books_read);
        txt=(TextView)findViewById(R.id.txt);
        search=(ImageView)findViewById(R.id.search);
        menu=(ImageView)findViewById(R.id.menu);
        txt.setText("Top Chart");
        search.setVisibility(View.VISIBLE);
        menu.setVisibility(View.VISIBLE);


        img_play = (ImageView)findViewById(R.id.img_play);
        img_pause = (ImageView)findViewById(R.id.img_pause);

        img_play.setOnClickListener(this);
        img_pause.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.img_play:

                img_pause.setVisibility(View.VISIBLE);
                img_play.setVisibility(View.GONE);

                break;

            case R.id.img_pause:

                img_play.setVisibility(View.VISIBLE);
                img_pause.setVisibility(View.GONE);
                break;

        }

    }
}
