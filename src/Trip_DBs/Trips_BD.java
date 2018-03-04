package Trip_DBs;

import java.util.Comparator;
import java.util.Date;
import Trip_Items.Trips_trip;

// TODO: Remove this code if it's not needed
//public class Trip_DB extends TreeMultimap<Date, Trip_> {
//
//    Ordering<String> byLengthOrdering = new Ordering<String>() {
//        public int compare(String left, String right) {
//            return Ints.compare(left.length(), right.length());
//        }
//    };
//
//    Trip_DB(Ordering<Date> order) {
////        super();
//    }
//
//    public Trip_ find(String tripTitle){
//        for (Trip_ iTrip : this) {
//            if (iTrip.getName() == tripTitle)
//                return iTrip;
//        }
//        return null;
//    }
//}

public class Trips_BD extends database<Date, Trips_trip> {

	public Trips_BD(Comparator<Date> keyComparator, Comparator<Trips_trip> valueComparator){
		super(keyComparator, valueComparator);
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

