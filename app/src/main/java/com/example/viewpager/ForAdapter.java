package com.example.viewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ForAdapter extends RecyclerView.Adapter<ForAdapter.AnimalsViewHolder> {

    private ArrayList<String>  nameList;
    private ArrayList<Integer> photoList;

    public ForAdapter(ArrayList<String> nameList, ArrayList<Integer> photoList) {
        this.nameList = nameList;
        this.photoList = photoList;
    }


    @NonNull
    @Override
    public AnimalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new AnimalsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalsViewHolder holder, int position) {
    holder.tvName.setText(nameList.get(position));
    holder.ivPhoto.setImageResource(photoList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public class AnimalsViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;
        TextView tvName;

        public AnimalsViewHolder(@NonNull View v) {
            super(v);
            ivPhoto = v.findViewById(R.id.ivPhoto);
            tvName = v.findViewById(R.id.tvName);

        }
    }
}


