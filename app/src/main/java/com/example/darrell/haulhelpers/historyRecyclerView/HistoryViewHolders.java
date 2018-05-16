package com.example.darrell.haulhelpers.historyRecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.darrell.haulhelpers.HistorySingleActivity;
import com.example.darrell.haulhelpers.R;

    /*
    * Holds a collection of history views to manage objects
    * Contains the ride id and time for the view and binds them.
    * */

public class HistoryViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    //Variables to store info regarding ride time and ID
    public TextView rideId;
    public TextView time;

    public HistoryViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        rideId = (TextView) itemView.findViewById(R.id.rideId);
        time = (TextView) itemView.findViewById(R.id.time);
    }
    /*
    * Action that is executed when a user clicks on the history button.
    * Generates an intent activity to run the history activity.
    * Creates a ride id and passes object into the history class.
    * */
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(v.getContext(), HistorySingleActivity.class);
        Bundle b = new Bundle(); //allows passing data between activities
        b.putString("rideId", rideId.getText().toString());
        intent.putExtras(b);
        v.getContext().startActivity(intent);

    }
}
