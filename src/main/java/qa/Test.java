package qa;

import java.time.LocalDateTime;


public class Test {


    public static void main(String[] args) {
        ListCollection listCollection = new ListCollection();
        listCollection.add("Chekhov");
        listCollection.add("Dostoevsky");
        listCollection.add("Dostoevsky");
        listCollection.delete("Dostoevsky");
        listCollection.print();

        SetCollection setCollection = new SetCollection();
        setCollection.add("Tolstoy");
        setCollection.add("Tolkien");
        setCollection.add("Dostoevsky");
        setCollection.add("Dostoevsky");
        setCollection.delete("Dostoevsky");
        setCollection.print();

        MapCollection mapCollection = new MapCollection();
        mapCollection.add("King",1947);
        mapCollection.add("Bulgakov",1891);
        mapCollection.print();
        System.out.println("Возраст Кинга "+(LocalDateTime.now().getYear() - mapCollection.find("King")));


    }

}
