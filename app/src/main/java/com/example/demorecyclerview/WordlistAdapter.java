package com.example.demorecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordlistAdapter extends RecyclerView.Adapter<WordlistAdapter.WordViewHolder> {

    private final LinkedList<String> mWordlist;
    private LayoutInflater mInflater;

    public WordlistAdapter(Context context,LinkedList<String> mWordlist) {
        mInflater =LayoutInflater.from(context);
        this.mWordlist = mWordlist;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,parent,false);
        return new WordViewHolder(mItemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String mCurrent = mWordlist.get(position);
        holder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordlist.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder{

        public final TextView wordItemView;
        final WordlistAdapter mAdapter;
        public WordViewHolder (@NonNull View itemView,WordlistAdapter adapter ){
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
        }
    }
}
