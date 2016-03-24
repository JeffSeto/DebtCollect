package com.example.jeffrey.debtcollect;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jeffrey.debtcollect.R;

/**
 * Created by Jeffrey on 2016-03-23.
 */
public class UserOwedFragment extends Fragment{

    //RecyclerView object
    RecyclerView recyclerView;
    //Recycler view layout manager
    LinearLayoutManager layoutManager;
    //Parent activity
    Activity parent;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Get the parent activity (MainActivity)
        parent = getActivity();
        //Get view and layout objects uon fragment creation
        recyclerView = (RecyclerView) parent.findViewById(R.id.user_owed_recycler_view);
        layoutManager = new LinearLayoutManager(parent);
        //Set the recyclerView layout manager
        recyclerView.setLayoutManager(layoutManager);



    }


    //Inflate the fragment view upon fragment creation
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.user_owed_fragment, container);
    }




}
