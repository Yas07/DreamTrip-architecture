
import Trip_DBs.Trips_BD;

import java.util.*;

class MainActivity{
    public static void main(String[] args){
		 Trips_BD trips_bd = new Trips_BD(Comparator.naturalOrder(), Comparator.naturalOrder());

        // Trips_DB trips_db = new Trips_DB(comparator);
        // Trip_Items.Trips_trip trip2 = new Trip_Items.Trips_trip("title2", new Date(2018,2, 25),
        //         new Date(2018,4, 30), Color.RED);
        // Trip_Items.Trips_trip trip1 = new Trip_Items.Trips_trip("title", new Date(2018,1, 20),
        //         new Date(2018,2, 21), Color.RED);

        // trips_db.add(trip1);
        // trips_db.add(trip2);
        // System.out.println(trips_db.find("title"));
        // for (Trip_Items.Trips_trip iTrip:trips_db) {
        //     System.out.println(iTrip);
        // }

        //TreeSet<Trip_Items.Trips_trip> set = new TreeSet<Trip_Items.Trips_trip>(comparator);

    }
}

