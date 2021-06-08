package id.unud.ac.tubesObat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import id.unud.ac.tubesObat.adapter.ItemListAdapter;
import id.unud.ac.tubesObat.data.BatukData;
import id.unud.ac.tubesObat.data.TipsData;

public class ListTipsActivity extends AppCompatActivity {
    private RecyclerView rvListTips;
    private ArrayList<Tips> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tips);

        rvListTips = findViewById(R.id.rv_list_tips);
        rvListTips.setHasFixedSize(true);

        list.addAll(TipsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvListTips.setLayoutManager(new LinearLayoutManager(this));
        ItemListAdapter listTipsAdapter = new ItemListAdapter(list);
        rvListTips.setAdapter(listTipsAdapter);
    }
}