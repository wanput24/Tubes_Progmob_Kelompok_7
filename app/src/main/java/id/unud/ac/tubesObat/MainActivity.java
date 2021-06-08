package id.unud.ac.tubesObat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnKategori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKategori = findViewById(R.id.btn_kategori);
        btnKategori.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CategoryActivity.class);
                startActivity(i);
            }
        });
    }


    public void toTips(View view) {
        Intent i = new Intent(getApplicationContext(),ListTipsActivity.class);
        startActivity(i);
    }
}