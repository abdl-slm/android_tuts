package com.tutorial.salam.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<String> title, subTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        title = new ArrayList<>();
        subTitle = new ArrayList<>();

        title.add("Alpha");
        title.add("Beta");
        title.add("Gamma");
        title.add("Delta");
        title.add("Epsilon");
        title.add("Zeta");
        title.add("Eta");
        title.add("Theta");
        title.add("Lambda");
        title.add("Kappa");
        title.add("Mu");
        title.add("Nu");

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new RecyclerAdapter(title);
        recyclerView.setAdapter(recyclerAdapter);

    }
}
