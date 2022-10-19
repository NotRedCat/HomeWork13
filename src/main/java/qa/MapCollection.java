package qa;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    Map<String, Integer> map = new HashMap<>();

    void add(String author, int year) {
        if (!map.containsKey(author)) {
            map.put(author, year);
        } else {
            map.replace(author, year);
        }
    }

    int find(String author) {
        return map.get(author);
    }

    void delete(String author) {
        map.remove(author);
    }

    public void print() {
        for (var item : map.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
