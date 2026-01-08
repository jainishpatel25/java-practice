package CollectionFramework.MapInterface;


import java.util.HashMap;
import java.util.Map;

class HashMapExample {

     static void main(String[] args) {
         HashMap<Integer,String> m = new HashMap<>();

         m.put(1,"Lionel");
         m.put(2,"Andres");
         m.put(3,"Messi");
//         m.put(3,"Messi");          //key unique-value duplicate // this is one is ignored

         m.put(4,null);             //
         m.put(5,null);             //multiple null values allowed
         m.put(null,"hi");
         m.put(null,"ki");              // one null key allow


//         m.put(3,"Leo")  // key is exist so it will updated

         System.out.println(m);
         System.out.println(m.get(2));


         //         m.remove(1);
         //         System.out.println(m);

//         System.out.println("For loop Result");
//         for (Map.Entry<Integer, String> entry : m.entrySet()) {
//             System.out.println(entry.getKey() + " : " + entry.getValue());
//         }

     }
}
