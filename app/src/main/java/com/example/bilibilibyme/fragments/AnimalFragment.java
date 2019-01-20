package com.example.bilibilibyme.fragments;

import android.support.v7.widget.RecyclerView;

import com.example.bilibilibyme.R;
import com.example.bilibilibyme.adapter.AnimalAdapter;
import com.example.bilibilibyme.base.BaseFragment;
import com.example.bilibilibyme.bean.Animal;

public class AnimalFragment extends BaseFragment {


    private RecyclerView recyclerView;
    private AnimalAdapter adapter;


    @Override
    public int setIdResource() {
        return R.layout.animal_fragment;
    }

    @Override
    public void loadData() {

        for(int i=0;i<10;i++){
            Animal animal=new Animal(R.drawable.ic_tutu,"我是一只兔子");
            animals.add(animal);
        }
    }

    @Override
    public void initView(){
        recyclerView=getview().findViewById(R.id.animal_recycler_view);
        adapter=new AnimalAdapter(animals, getContext());
    }
}
