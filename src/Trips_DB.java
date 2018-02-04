import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Trips_DB extends TreeSet<Trips_trip> {
    public Trips_DB(Comparator<Trips_trip> comparator) {
        super(comparator);
    }
    public Trips_trip find(String tripTitle){
        for (Trips_trip iTrip : this) {
            if (iTrip.getTitle() == tripTitle)
                return iTrip;
        }
        return null;
    }
}


