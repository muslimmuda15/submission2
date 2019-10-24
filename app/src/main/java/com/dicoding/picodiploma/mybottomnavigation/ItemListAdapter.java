package com.dicoding.picodiploma.mybottomnavigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ItemListHolder> {

    public ItemListAdapter(Context context) {
        this.context = context;
    }

    private Context context;


    public ArrayList<ModelData> getListModelData() {
        return listModelData;
    }

    public void setListModelData(ArrayList<ModelData> listModelData) {
        this.listModelData = listModelData;
    }

    private ArrayList<ModelData> listModelData;

    @NonNull
    @Override
    public ItemListAdapter.ItemListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ItemListHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemListAdapter.ItemListHolder holder, int position) {
        //RecyclerView untuk ModelData
        Glide.with(context)
                .load(getListModelData().get(position).getPoster())
                .apply(new RequestOptions().override(100, 150))
                .into(holder.imgPoster);

        holder.tvTitle.setText(getListModelData().get(position).getTitle());
        holder.tvRelease.setText(getListModelData().get(position).getRelease());

    }

    @Override
    public int getItemCount() {
        return getListModelData().size();
    }

    public class ItemListHolder extends RecyclerView.ViewHolder{
        ImageView imgPoster;
        TextView tvTitle, tvRelease;

        public ItemListHolder(@NonNull View itemView) {
            super(itemView);

            imgPoster = itemView.findViewById(R.id.img_poster);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvRelease = itemView.findViewById(R.id.tv_release);
        }

    }
}
