package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    ViewPager2 vpMain;
    TabLayout tlMain;

    String[] tabs = {"Plants", "Animals", "Planets"};
    int [] tabIcons = {R.drawable.tree,R.drawable.animal_australia_kangaroo_svgrepo_com,R.drawable.planet_svgrepo_com};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tlMain = findViewById(R.id.tlMain);
        vpMain = findViewById(R.id.vpMain);
        setPagerAdapter();
        new TabLayoutMediator(tlMain, vpMain,(tab, position) ->{
            tab.setText(tabs[position]);
            tab.setIcon(tabIcons[position]);

        }).attach();



    }
    private void setPagerAdapter(){
        vpMain.setAdapter(new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                Fragment fragment = new Fragment();
                switch (position){
                    case 0: {
                        fragment = new PlantsFragment();
                        break;
                    }
                    case 1: {
                        fragment = new AnimalsFragment();
                        break;
                    }
                    case 2: {
                        fragment = new PlanetsFragment();
                        break;
                    }
                }
                return fragment;
            }

            @Override
            public int getItemCount() {
                return 3;
            }
        });
    }
}