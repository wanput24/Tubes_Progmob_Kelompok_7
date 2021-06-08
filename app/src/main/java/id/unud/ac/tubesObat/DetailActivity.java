package id.unud.ac.tubesObat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView tvItemName, tvItemDesc, tvItemIndikasi, tvItemKategori, tvItemKomposisi,
            tvItemDosis, tvItemAturan, tvItemKemasan, tvItemPerhatian;
    ImageView imgItemPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvItemName = findViewById(R.id.tv_item_name);
        imgItemPhoto = findViewById(R.id.img_item_photo);
        tvItemIndikasi = findViewById(R.id.tv_item_indikasi);
        tvItemDesc = findViewById(R.id.tv_item_desc);
        tvItemKategori = findViewById(R.id.tv_item_kategori);
        tvItemKomposisi = findViewById(R.id.tv_item_komposisi);
        tvItemDosis = findViewById(R.id.tv_item_dosis);
        tvItemAturan = findViewById(R.id.tv_item_aturan);
        tvItemKemasan = findViewById(R.id.tv_item_kemasan);
        tvItemPerhatian = findViewById(R.id.tv_item_perhatian);

        Bundle bundle = getIntent().getExtras();
        int img = bundle.getInt("image");
        imgItemPhoto.setImageResource(img);
        tvItemName.setText(getIntent().getStringExtra("name"));
//        Glide.with(DetailActivity.this)
//                .asBitmap()
//                .load(img)
//                .into(imgItemPhoto);
//        imgItemPhoto.setImageDrawable(Drawable.createFromPath(getIntent().getStringExtra("image")));
        tvItemIndikasi.setText(getIntent().getStringExtra("indikasi"));
        tvItemDesc.setText(getIntent().getStringExtra("desc"));
        tvItemKategori.setText(getIntent().getStringExtra("kategori"));
        tvItemKomposisi.setText(getIntent().getStringExtra("komposisi"));
        tvItemDosis.setText(getIntent().getStringExtra("dosis"));
        tvItemAturan.setText(getIntent().getStringExtra("aturan"));
        tvItemKemasan.setText(getIntent().getStringExtra("kemasan"));
        tvItemPerhatian.setText(getIntent().getStringExtra("perhatian"));

    }
}