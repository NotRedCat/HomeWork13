package qa;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    List<String> list = new ArrayList<>();
    void add(String item) {
        list.add(item);
    }

    Boolean find(String item) {
        return list.contains(item);
    }

    void delete(String item) {
        list.remove(item);
    }

    public void print() {
        int cur = 0;
        while (list.size() > cur) {
            System.out.println(list.get(cur));
            cur++;
        }
    }

}
