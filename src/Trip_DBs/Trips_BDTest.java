package Trip_DBs;

import java.awt.*;
import java.util.Comparator;
import java.util.Date;

class Trips_BDTest {
    @org.junit.jupiter.api.Test
    void add() {
        // create bd
        Trips_BD trips_bd = new Trips_BD(Comparator.naturalOrder(), Comparator.naturalOrder(), Comparator.naturalOrder());

        // create trips
        Trip_Items.Trips_trip trip2 = new Trip_Items.Trips_trip("title2", new Date(2018,2, 25),
                new Date(2018,4, 30), Color.RED);
        Trip_Items.Trips_trip trip1 = new Trip_Items.Trips_trip("title", new Date(2018,1, 20),
                new Date(2018,2, 21), Color.RED);

        // add trips
        trips_bd.add(trip1.getStartDate(), trip1);
        trips_bd.add(trip1.getStartDate(), trip2);
        assert (trips_bd.findAll(trip1.getStartDate()).contains(trip1));
    }

    @org.junit.jupiter.api.Test
    void findAll() { // by name
        // create bd
        Trips_BD trips_bd = new Trips_BD(Comparator.naturalOrder(), Comparator.naturalOrder(), Comparator.naturalOrder());

        // create trips
        Trip_Items.Trips_trip trip2 = new Trip_Items.Trips_trip("title2", new Date(2018,2, 25),
                new Date(2018,4, 30), Color.RED);
        Trip_Items.Trips_trip trip1 = new Trip_Items.Trips_trip("title", new Date(2018,1, 20),
                new Date(2018,2, 21), Color.RED);

        // add trips
        trips_bd.add(trip1.getStartDate(), trip1);
        trips_bd.add(trip1.getStartDate(), trip2);
        assert (trips_bd.findAll(trip1.getName()).contains(trip1));
    }

    @org.junit.jupiter.api.Test
    void find() {
        // create bd
        Trips_BD trips_bd = new Trips_BD(Comparator.naturalOrder(), Comparator.naturalOrder(), Comparator.naturalOrder());

        // create trips
        Trip_Items.Trips_trip trip2 = new Trip_Items.Trips_trip("title2", new Date(2018,2, 25),
                new Date(2018,4, 30), Color.RED);
        Trip_Items.Trips_trip trip1 = new Trip_Items.Trips_trip("title", new Date(2018,1, 20),
                new Date(2018,2, 21), Color.RED);

        // add trips
        trips_bd.add(trip1.getStartDate(), trip1);
        trips_bd.add(trip1.getStartDate(), trip2);
        assert (trip1.equals(trips_bd.find(trip1.getStartDate(), trip1.getName())));
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void remove1() {
    }

}