package id.unud.ac.tubesObat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }
    public void toBatuk(View view) {
        Intent i = new Intent(getApplicationContext(), ListObat.class);
        i.putExtra("data1", "batuk");
        startActivity(i);
    }

    public void toFlu(View view) {
        Intent i = new Intent(getApplicationContext(), ListObat.class);
        i.putExtra("data1", "flu");
        startActivity(i);
    }

    public void toLuka(View view) {
        Intent i = new Intent(getApplicationContext(), ListObat.class);
        i.putExtra("data1", "luka");
        startActivity(i);
    }

    public void toPanas(View view) {
        Intent i = new Intent(getApplicationContext(), ListObat.class);
        i.putExtra("data1", "panas");
        startActivity(i);
    }

    public void toKepala(View view) {
        Intent i = new Intent(getApplicationContext(), ListObat.class);
        i.putExtra("data1", "kepala");
        startActivity(i);
    }

    public void toPegal(View view) {
        Intent i = new Intent(getApplicationContext(), ListObat.class);
        i.putExtra("data1", "pegal");
        startActivity(i);
    }

    public void toVitamin(View view) {
        Intent i = new Intent(getApplicationContext(), ListObat.class);
        i.putExtra("data1", "vitamin");
        startActivity(i);
    }

    public void toMaag(View view) {
        Intent i = new Intent(getApplicationContext(), ListObat.class);
        i.putExtra("data1", "maag");
        startActivity(i);
    }
}