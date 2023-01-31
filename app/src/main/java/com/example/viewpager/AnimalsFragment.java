package com.example.viewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AnimalsFragment extends Fragment {
    RecyclerView rvAnimals;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_animals, container, false);

        rvAnimals = v.findViewById(R.id.rvAnimals);
        rvAnimals.setLayoutManager(new LinearLayoutManager(getActivity()));
        ForAdapter animalsAdapter = new ForAdapter(dummyAnimalList(),dummyPhotoList());
        rvAnimals.setAdapter(animalsAdapter);

        return v;

    }

    ArrayList<String> dummyAnimalList() {
        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("iguana");
        animalList.add("Suger Glider");

        return animalList;

    }
    ArrayList<Integer> dummyPhotoList() {
        ArrayList<Integer> photoList = new ArrayList<Integer>();
        photoList.add(R.drawable.dog);
        photoList.add(R.drawable.cat);
        photoList.add(R.drawable.iguana);
        photoList.add(R.drawable.suger_glider);

        return photoList;

    }
}
