
import java.awt.*;
import java.util.*;

class MainActivity{
    public static void main(String[] args){
        Comparator<Trips_trip> comparator =
                (Trips_trip trip1, Trips_trip trip2)->
                        trip1.getStartDate().compareTo(trip2.getStartDate());

        Trips_DB trips_db = new Trips_DB(comparator);
        Trips_trip trip2 = new Trips_trip("title2", new Date(2018,2, 25),
                new Date(2018,4, 30), Color.RED);
        Trips_trip trip1 = new Trips_trip("title", new Date(2018,1, 20),
                new Date(2018,2, 21), Color.RED);

        trips_db.add(trip1);
        trips_db.add(trip2);
        System.out.println(trips_db.find("title"));
        for (Trips_trip iTrip:trips_db) {
            System.out.println(iTrip);
        }

        //TreeSet<Trips_trip> set = new TreeSet<Trips_trip>(comparator);

    }
}

class TripComparator implements Comparator< Map.Entry< String, Trips_trip > > {
    public int compare(Map.Entry<String, Trips_trip> trip1, Map.Entry<String, Trips_trip> trip2)
    {
        return trip1.getValue().getStartDate().compareTo(trip2.getValue().getStartDate());
    }
}

