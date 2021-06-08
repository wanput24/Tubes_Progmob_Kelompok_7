package id.unud.ac.tubesObat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import id.unud.ac.tubesObat.adapter.CardViewItemAdapter;
import id.unud.ac.tubesObat.adapter.ItemListAdapter;
import id.unud.ac.tubesObat.data.BatukData;
import id.unud.ac.tubesObat.data.FluData;
import id.unud.ac.tubesObat.data.LukaData;
import id.unud.ac.tubesObat.data.MaagData;
import id.unud.ac.tubesObat.data.PanasData;
import id.unud.ac.tubesObat.data.PegalData;
import id.unud.ac.tubesObat.data.SakitKepalaData;
import id.unud.ac.tubesObat.data.VitaminData;

public class ListObat extends AppCompatActivity {
    private RecyclerView rvListObat;
    private ArrayList<Obat> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_obat);

        rvListObat = findViewById(R.id.rv_list_obat);
        rvListObat.setHasFixedSize(true);

        if (getIntent().getStringExtra("data1").equals("batuk")){
            list.addAll(BatukData.getListData());
            showRecyclerCardView();
        }else if (getIntent().getStringExtra("data1").equals("flu")){
            list.addAll(FluData.getListData());
            showRecyclerCardView();
        }else if (getIntent().getStringExtra("data1").equals("luka")){
            list.addAll(LukaData.getListData());
            showRecyclerCardView();
        }else if (getIntent().getStringExtra("data1").equals("panas")){
            list.addAll(PanasData.getListData());
            showRecyclerCardView();
        }else if (getIntent().getStringExtra("data1").equals("vitamin")){
            list.addAll(VitaminData.getListData());
            showRecyclerCardView();
        }else if (getIntent().getStringExtra("data1").equals("kepala")){
            list.addAll(SakitKepalaData.getListData());
            showRecyclerCardView();
        }else if (getIntent().getStringExtra("data1").equals("maag")){
            list.addAll(MaagData.getListData());
            showRecyclerCardView();
        }else if (getIntent().getStringExtra("data1").equals("pegal")){
            list.addAll(PegalData.getListData());
            showRecyclerCardView();
        }

    }

//    private void showRecyclerList(){
//        rvListObat.setLayoutManager(new LinearLayoutManager(this));
//        ItemListAdapter listObatAdapter = new ItemListAdapter(list);
//        rvListObat.setAdapter(listObatAdapter);
//    }

    private void showRecyclerCardView(){
        rvListObat.setLayoutManager(new LinearLayoutManager(this));
        CardViewItemAdapter cardViewItemAdapter = new CardViewItemAdapter(list);
        rvListObat.setAdapter(cardViewItemAdapter);
    }

//    private void showSelectedObat(Obat obat) {
//        Toast.makeText(this, "Kamu memilih " + obat.getName(), Toast.LENGTH_SHORT).show();
//    }
}