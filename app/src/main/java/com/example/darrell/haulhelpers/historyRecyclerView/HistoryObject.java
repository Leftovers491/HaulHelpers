package com.example.darrell.haulhelpers.historyRecyclerView;

/**
 * Created by 013416011 on 3/19/18.
 */

public class HistoryObject {

    private String rideId;
    private String time;

    public HistoryObject(String rideId, String time){
        this.rideId = rideId;
        this.time = time;


    }

    public String getRideId(){
        return rideId;
    }

    public String getTime(){
        return time;
    }

    public void setTime( String time){
        this.time = time;
    }
}
