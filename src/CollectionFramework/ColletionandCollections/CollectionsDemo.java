package CollectionFramework.ColletionandCollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);

        System.out.println("normal: " +list);

        Collections.sort(list);   // utility method
        System.out.println("After Sorting: " +list);

        Collections.reverse(list);
        System.out.println("After Reverse: " +list);

        System.out.println("max number: " +Collections.max(list));
        System.out.println("min number: " +Collections.min(list));

    }
}
