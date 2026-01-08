package CollectionFramework.ColletionandCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


//collection and collections together

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();

        c.add(10);
        c.add(30);
        c.add(20);

        System.out.println(c);

        //type casting need

        ArrayList<Integer> arr=(ArrayList<Integer>) c;
        Collections.sort(arr);
        System.out.println(arr);
    }
}
