package CollectionFramework.ListInterface;

import java.util.ArrayList;

public class Arraylist {
    static void main(String[] args) {
        ArrayList<String> a =new ArrayList<>();

        a.add("jainish");
        a.add("ashokbhai");
        a.add("patel");
//        a.add("patel");  //ALLOW DUPLICATE

//        for (int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i));
//        }

//        for(String n:a){
//            System.out.println(n);
//        }

//        System.out.println("  ");
//        System.out.println(a);                  //print a
//        System.out.println(a.get(1));           //first element
//        System.out.println(a.size());           //size
//        System.out.println(a.remove(2));  //remove element
        System.out.println(a.set(0,"Jainish"));   //update the value
        System.out.println(a);                  //print after operations
    }
}
