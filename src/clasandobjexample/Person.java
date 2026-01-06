// ================================
// Class with Constructor  + Method
// ================================
package clasandobjexample;

public class Person {

    int age;

//    Person(){ //normal constructor
//        age=21;
//    }
    Person(int a){  //constructor with parameter
        age=a;
    }

    void show(){
        System.out.println("Person Age " +age);
    }
}
