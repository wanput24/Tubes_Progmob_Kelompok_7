package id.unud.ac.tubesObat.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.unud.ac.tubesObat.DetailActivity;
import id.unud.ac.tubesObat.ListObat;
import id.unud.ac.tubesObat.Obat;
import id.unud.ac.tubesObat.R;

import static android.view.View.*;
import static androidx.core.content.ContextCompat.startActivity;

public class CardViewItemAdapter extends RecyclerView.Adapter<CardViewItemAdapter.CardViewViewHolder> {

    private final ArrayList<Obat> listObat;
    public CardViewItemAdapter(ArrayList<Obat> list) {this.listObat = list;}

    public String tvIndikasi;
    @NonNull
    @Override
    public CardViewItemAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewItemAdapter.CardViewViewHolder holder, int position) {
        Obat obat = listObat.get(position);
        Glide.with(holder.itemView.getContext())
                .load(obat.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.tvName.setText(obat.getName());
        holder.tvDetail.setText(obat.getDesc());


        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listObat.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("image", obat.getPhoto());
                intent.putExtra("name", obat.getName());
                intent.putExtra("indikasi", obat.getIndikasi());
                intent.putExtra("desc", obat.getDesc());
                intent.putExtra("kategori", obat.getKategori());
                intent.putExtra("komposisi", obat.getKomposisi());
                intent.putExtra("dosis", obat.getDosis());
                intent.putExtra("aturan", obat.getAturan());
                intent.putExtra("kemasan", obat.getKemasan());
                intent.putExtra("perhatian", obat.getPerhatian());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listObat.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        
        public CardViewViewHolder(@NonNull View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_desc);

        }
    }
}
