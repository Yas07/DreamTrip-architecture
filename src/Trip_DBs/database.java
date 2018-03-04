package Trip_DBs;
import com.google.common.collect.TreeMultimap;
import com.google.common.collect.TreeMultiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

abstract class  database<KEY, VALUE extends DB_Item> {
    private TreeMultimap<KEY,VALUE> _database;

    // ** abstract methods.. **
    abstract void addToDb(VALUE value);
    abstract void removeFromDb(VALUE value);
    // ** public methods.. **
    public database(Comparator<KEY> keyComparator, Comparator<VALUE> valueComparator)
    {
        _database = TreeMultimap.create(keyComparator, valueComparator); // keyComparator, valueComparator
    }


    public void add(KEY key, VALUE value)
    {
        _database.put(key, value);
        addToDb(value);
    }


    public NavigableSet<VALUE> find(KEY key)
    {
        return _database.get(key);
    }

    public VALUE findByName(KEY key, String name){
        NavigableSet<VALUE> set = find(key);
        for (VALUE item: set) {
            if (item.getItemName().equals(name)){
                return item;
            }
        }
        return null;
    }

    public void remove(KEY key, VALUE value)
    {
        _database.remove(key, value);
        removeFromDb(value);
    }

    public void removeByName(KEY key, String name)
    {
        VALUE value = findByName(key, name);
        if (value != null) {
            _database.remove(key, value);
        } else {
          // TODO: print something..
        }
    }
}

