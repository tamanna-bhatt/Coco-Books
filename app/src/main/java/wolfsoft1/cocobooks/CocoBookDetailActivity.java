package wolfsoft1.cocobooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CocoBookDetailActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_book_detail);
        txt=(TextView)findViewById(R.id.txt);
        txt.setText("Science");

    }
}
