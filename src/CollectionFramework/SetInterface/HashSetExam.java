package CollectionFramework.SetInterface;

import java.util.HashSet;

public class HashSetExam {

    static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        set.add(12);
        set.add(22);
        set.add(32);
        set.add(42);
        set.add(42);            //duplicate ignore

        System.out.println(set);        //output unordered

        System.out.println(set.contains(52));  //true
    }
}
