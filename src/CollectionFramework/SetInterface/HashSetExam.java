package CollectionFramework.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {

    static void main(String[] args) {
//        HashSet<Integer> set=new HashSet<>();
        Set<Integer> set=new HashSet<>();

        set.add(12);
        set.add(22);
        set.add(32);
        set.add(42);
        set.add(42);            //duplicate ignore
        set.add(null);
        set.add(null);          //one null allowed

        System.out.println(set);        //output unordered

        System.out.println(set.contains(52));  //true
    }
}
