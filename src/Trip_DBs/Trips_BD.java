package Trip_DBs;

import Trip_Items.Trips_trip;

import java.util.Comparator;
import java.util.Date;

public class Trips_BD extends DB<Date, Trips_trip> {

    public Trips_BD(Comparator comparator ){
        super(comparator);
    }

    public void add(Trips_trip trip)
    {
        add(trip.getStartDate(), trip);
    }

    public void remove(Trips_trip trip)
    {
        remove(trip.getStartDate(), trip);
    }

    void addToDb(Trips_trip value)
    {
        // some special SQL magic..
    }

    void removeFromDb(Trips_trip value)
    {
        // some special SQL magic..
    }
}

