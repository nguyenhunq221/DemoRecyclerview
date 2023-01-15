package com.example.demorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mWordlist = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private WordlistAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i =0 ; i<20 ;i++){
            mWordlist.addLast("Word" +i);

        mRecyclerView = findViewById(R.id.recyclerView);

        mAdapter = new WordlistAdapter(this,mWordlist);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }
}