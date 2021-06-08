package id.unud.ac.tubesObat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailTipsActivity extends AppCompatActivity {

    TextView tvTipsTitle, tvTipsDesc, tvTipsDesc2;
    ImageView imgTipsPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tips);

        tvTipsTitle = findViewById(R.id.tv_tips_title);

        tvTipsDesc = findViewById(R.id.tv_tips_desc);
        tvTipsDesc2 = findViewById(R.id.tv_tips_desc2);

        tvTipsTitle.setText(getIntent().getStringExtra("title"));
        tvTipsDesc.setText(getIntent().getStringExtra("desc"));
        tvTipsDesc2.setText(getIntent().getStringExtra("desc2"));
    }
}