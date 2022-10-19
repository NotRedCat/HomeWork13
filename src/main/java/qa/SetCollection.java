package qa;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    Set<String> set = new HashSet<>();

    void add(String item) {
        set.add(item);
    }

    Boolean find(String item) {
        return set.contains(item);
    }

    void delete(String item) {
        set.remove(item);
    }

    public void print() {
        var array = set.toArray();
        for (var i = 0; i < set.size(); i++) {
            System.out.println(array[i]);
        }
    }
}
