import com.google.common.collect.Multimap;
import com.google.common.collect.Ordering;
import com.google.common.collect.TreeMultimap;

import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;

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
//            if (iTrip.getTitle() == tripTitle)
//                return iTrip;
//        }
//        return null;
//    }
//}


abstract class  database<KEY,VALUE> {
    private TreeMultimap<KEY,VALUE> _database;

    database(Comparator<KEY> keyComparator, Comparator<VALUE> valueComparator)
    {
        _database = TreeMultimap<Date, Trip_>.create(keyComparator, valueComparator);
    }

    abstract void addToDb(VALUE value);

    void add(KEY key, VALUE value)
    {
        _database.put(key, value);
        addToDb(value);
    }

    abstract void removeFromDb(VALUE value);

    void remove(KEY key, VALUE value)
    {
        _database.remove(key, value);
        removeFromDb(value);
    }
}

class Ttips_BD extends database<Date, Trip_> {
    void addToDb(Trip_ value)
    {

    }

    void removeFromDb(Trip_ value)
    {

    }
}

class Something_BD extends database<Date, Trip_> {
    void addToDb(Trip_ value)
    {

    }

    void removeFromDb(Trip_ value)
    {

    }
}

class Whatever_BD extends database<Date, Trip_> {
    void addToDb(Trip_ value)
    {

    }

    void removeFromDb(Trip_ value)
    {

    }
}