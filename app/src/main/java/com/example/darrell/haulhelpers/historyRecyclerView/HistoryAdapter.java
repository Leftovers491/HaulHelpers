package com.example.darrell.haulhelpers.historyRecyclerView;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.darrell.haulhelpers.R;

import java.util.List;

/**
 * Created by 013416011 on 3/19/18.
 */

public class HistoryAdapter extends RecyclerView.Adapter<HistoryViewHolders> {

    private List<HistoryObject> itemList;
    private Context context;

    public HistoryAdapter(List<HistoryObject> itemList, Context context){

        this.itemList = itemList;
        this.context = context;

    }


    @Override
    public HistoryViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, null, false    );
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);
        HistoryViewHolders rvc = new HistoryViewHolders(layoutView);

        return rvc;
    }

    @Override
    public void onBindViewHolder(HistoryViewHolders holder, int position) {

        holder.rideId.setText(itemList.get(position).getRideId());
        holder.time.setText(itemList.get(position).getTime());

    }

    @Override
    public int getItemCount() {

       //int test = this.itemList.size();
        return this.itemList.size();
    }
}
