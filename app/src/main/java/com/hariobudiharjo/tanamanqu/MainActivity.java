package com.hariobudiharjo.tanamanqu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewTanaman;
    ArrayList<TanamanModel> tanamanModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewTanaman = findViewById(R.id.rvTanaman);
        tanamanModels = new ArrayList<>();
        tanamanModels.addAll(TanamanData.getListData());
        showRecyclerView();
    }

    private void showRecyclerView(){
        recyclerViewTanaman.setLayoutManager(new LinearLayoutManager(this));
        TanamanAdapter tanamanAdapter = new TanamanAdapter(this);
        tanamanAdapter.setTanamanModels(tanamanModels);
        recyclerViewTanaman.setAdapter(tanamanAdapter);
    }
}
