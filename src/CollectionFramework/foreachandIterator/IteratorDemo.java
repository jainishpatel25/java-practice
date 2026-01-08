package CollectionFramework.foreachandIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();

        a.add(12);
        a.add(10);
        a.add(15);

        System.out.println(a);
        a.remove(1);


        Iterator<Integer> itr= a.iterator();

        while(itr.hasNext()){
            Integer val= itr.next();
            if(val==10){            //for string name.equals("jainish")
                itr.remove();
            }
        }
        System.out.println(a);
    }

}
