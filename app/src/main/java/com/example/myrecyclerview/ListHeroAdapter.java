package com.example.myrecyclerview;

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

public class ListHeroAdapter extends
        RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> {
    private ArrayList<Hero> listHero;
    private int mode; // 0 for list, 1 for grid, 2 for cardview
    public static final int MODE_LIST = 0;
    public static final int MODE_GRID = 1;
    public static final int MODE_CARDVIEW = 2;

    public ListHeroAdapter(ArrayList<Hero> list, int mode) {
        this.listHero = list;
        this.mode = mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return mode;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
        int layoutId;
        switch (viewType) {
            case MODE_GRID:
                layoutId = R.layout.item_row_hero; // Gunakan layout yang sama untuk sementara
                break;
            case MODE_CARDVIEW:
                layoutId = R.layout.item_card_hero;
                break;
            case MODE_LIST:
            default:
                layoutId = R.layout.item_row_hero;
                break;
        }
        View view =
                LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int
            position) {
        Hero hero = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName());
        holder.tvDetail.setText(hero.getDetail());
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}

