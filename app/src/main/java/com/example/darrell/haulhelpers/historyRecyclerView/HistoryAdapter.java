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
 * History classs to store objects containing timestamp, user, and the list of transactions made regarding trips.
 */

public class HistoryAdapter extends RecyclerView.Adapter<HistoryViewHolders> {
    //stores a list of hisstory objects
    private List<HistoryObject> itemList;

    private Context context;//object for which the history will pertain to

    public HistoryAdapter(List<HistoryObject> itemList, Context context){

        this.itemList = itemList;
        this.context = context;

    }

    /*
    * Generates a history with view holder and binds the layout.
    * Sets layout based on specific user that is requesting history
    * */
    @Override
    public HistoryViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, null, false    );
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);
        HistoryViewHolders rvc = new HistoryViewHolders(layoutView);

        return rvc;
    }

    /*
    * Finds the time and id for ride, and grabs the ID for the request.
    * */
    @Override
    public void onBindViewHolder(HistoryViewHolders holder, int position) {

        holder.rideId.setText(itemList.get(position).getRideId());
        holder.time.setText(itemList.get(position).getTime());

    }
    /*
    * Returns the item list count
    * */
    @Override
    public int getItemCount() {

       //int test = this.itemList.size();
        return this.itemList.size();
    }
}
