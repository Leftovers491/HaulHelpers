package com.example.darrell.haulhelpers.historyRecyclerView;

/*
* History object stores the
* */
public class HistoryObject {
    //pertains to the objects to store ride information
    private String rideId;
    private String time;
    //constructor for generating a history object when a request is made for a ride.
    public HistoryObject(String rideId, String time){
        this.rideId = rideId;
        this.time = time;


    }
    /*
    * returns ride ID for user's history object.
    * */
    public String getRideId(){
        return rideId;
    }

    /*
    * Get's ride Id for the trips.
    * */
    public String getTime(){
        return time;
    }
    /*
    * Sets the time of rides
    * */
    public void setTime( String time){
        this.time = time;
    }
}
