package Trip_DBs;

import java.awt.*;
import java.util.Comparator;
import java.util.Date;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


class Trips_BDTest {
    @org.junit.jupiter.api.Test
    void test() {
        // create bd
        Trips_BD trips_bd = new Trips_BD(Comparator.naturalOrder());

        // create trips
        Trip_Items.Trips_trip trip2 = new Trip_Items.Trips_trip("title2", new Date(2018,2, 25),
                new Date(2018,4, 30), Color.RED);
        Trip_Items.Trips_trip trip1 = new Trip_Items.Trips_trip("title", new Date(2018,1, 20),
                new Date(2018,2, 21), Color.RED);

        // add trips
        trips_bd.add(trip1);
        trips_bd.add(trip2);

        // check public NavigableSet<VALUE> findAll(KEY key)
        assertTrue(trips_bd.findAll(trip1.getStartDate()).contains(trip1));

        // check public NavigableSet<VALUE> findAll(String name)
        assertTrue (trips_bd.findAll(trip1.getName()).contains(trip1));

        // check public VALUE find(KEY key, String name){
        assertTrue (trip1.equals(trips_bd.find(trip1.getStartDate(), trip1.getName())));

        // check public void remove(KEY key, String name)
        trips_bd.remove(trip2.getStartDate(), trip2.getName());
        assertFalse (trip2.equals(trips_bd.find(trip2.getStartDate(), trip2.getName())));

        // check public void remove(Trips_trip trip)
        trips_bd.remove(trip1);
        assertFalse (trip1.equals(trips_bd.find(trip1.getStartDate(), trip1.getName())));
    }
}