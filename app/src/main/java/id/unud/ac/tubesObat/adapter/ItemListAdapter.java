package id.unud.ac.tubesObat.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.unud.ac.tubesObat.DetailActivity;
import id.unud.ac.tubesObat.DetailTipsActivity;
import id.unud.ac.tubesObat.Obat;
import id.unud.ac.tubesObat.R;
import id.unud.ac.tubesObat.Tips;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ListViewHolder> {
    private ArrayList<Tips> listTips;
    public ItemListAdapter(ArrayList<Tips> list){
        this.listTips = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemListAdapter.ListViewHolder holder, int position) {
        Tips tips = listTips.get(position);
//        Glide.with(holder.itemView.getContext())
//                .load(obat.getPhoto())
//                .apply(new RequestOptions().override(55,55))
//                .into(holder.imgPhoto);
        holder.tvName.setText(tips.getTitle());
        holder.tvDesc.setText(tips.getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listTips.get(holder.getAdapterPosition()).getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(holder.itemView.getContext(), DetailTipsActivity.class);
                intent.putExtra("title", tips.getTitle());
                intent.putExtra("desc", tips.getDesc());
                intent.putExtra("desc2", tips.getDesc2());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTips.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
//        ImageView imgPhoto;
        TextView tvName, tvDesc;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
//            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
        }
    }
}
