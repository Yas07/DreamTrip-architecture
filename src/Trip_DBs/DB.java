package Trip_DBs;
import com.google.common.collect.TreeMultimap;

import java.util.Comparator;
import java.util.NavigableSet;

abstract class DB<KEY, VALUE extends DB_Item> {
    private TreeMultimap<KEY,VALUE> _keyValueDB;
    private TreeMultimap<String,VALUE> _StringValueDB;

    // ** abstract methods.. **
    abstract void addToDb(VALUE value);
    abstract void removeFromDb(VALUE value);

    // ** public methods.. **
    public DB(Comparator<KEY> keyComparator, Comparator<VALUE> valueComparator, Comparator<String> stringComparator)
    {
        _keyValueDB = TreeMultimap.create(keyComparator, valueComparator);
        _StringValueDB = TreeMultimap.create(stringComparator, valueComparator);
    }


    public void add(KEY key, VALUE value)
    {
        _keyValueDB.put(key, value);
        _StringValueDB.put(value.getItemName(), value);
        addToDb(value);
    }


    public NavigableSet<VALUE> findAll(KEY key)
    {
        return _keyValueDB.get(key);
    }
    public NavigableSet<VALUE> findAll(String name)
    {
        return _StringValueDB.get(name);
    }

    public VALUE find(KEY key, String name){
        NavigableSet<VALUE> set = findAll(key);
        for (VALUE item: set) {
            if (item.getItemName().equals(name)){
                return item;
            }
        }
        return null;
    }

    public void remove(KEY key, VALUE value)
    {
        _keyValueDB.remove(key, value);
        _StringValueDB.remove(value.getItemName(), value);
        removeFromDb(value);
    }

    public void remove(KEY key, String name)
    {
        VALUE value = find(key, name);
        if (value != null) {
            _keyValueDB.remove(key, value);
            _StringValueDB.remove(name, value);
        } else {
          // TODO: print something..
        }
    }
}

