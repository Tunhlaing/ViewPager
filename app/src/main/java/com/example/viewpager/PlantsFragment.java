package com.example.viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlantsFragment extends Fragment {
    RecyclerView rvPlants;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_plants, container, false);

        rvPlants = v.findViewById(R.id.rvPlants);
        rvPlants.setLayoutManager(new LinearLayoutManager(getActivity()));
        ForAdapter animalsAdapter = new ForAdapter(dummyPlantList(),dummyPhotoList());
        rvPlants.setAdapter(animalsAdapter);

        return v;
    }
    ArrayList<String> dummyPlantList() {
        ArrayList<String> plantsList = new ArrayList<>();
        plantsList.add("Mini Jade Plant");
        plantsList.add("Money Tree");
        plantsList.add("Peace Lily");
        plantsList.add("Spider Plant");
        plantsList.add("Yucca");


        return plantsList;

    }
    ArrayList<Integer> dummyPhotoList() {
        ArrayList<Integer> photoList = new ArrayList<Integer>();
        photoList.add(R.drawable.flower);
        photoList.add(R.drawable.money_tree);
        photoList.add(R.drawable.peace_lily);
        photoList.add(R.drawable.spider_plant);
        photoList.add(R.drawable.yucca);



        return photoList;

    }
}