package inhertianceexample;

//single inherit with multiple variable

 class Person {
     String name="jainish";
}

class Student extends Person{
     int age=21;
     void study(){
         System.out.println(name+ " is " +age+ " years old");
     }
}
