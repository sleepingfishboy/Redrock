package com.example.level2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.InnerHolder> {

    private ArrayList<Fruit> data;

    public Adapter(ArrayList<Fruit> data) {
        this.data = data;//传入数据
    }
    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false));

    }//适配器模板

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {

        holder.tvFruitName.setText(data.get(position).getFruitName());
        holder.tvFruitPrice.setText(data.get(position).getFruitPrice().toString());

    }//绑定数据

    @Override
    public int getItemCount() {

        return data.size();

    }

    public static class InnerHolder extends RecyclerView.ViewHolder{

        TextView tvFruitName;
        TextView tvFruitPrice;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            tvFruitName = (TextView) itemView.findViewById(R.id.tv_fruit_name);
            tvFruitPrice = (TextView)itemView.findViewById(R.id.tv_fruit_price);

        }
    }

}
