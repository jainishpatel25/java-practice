package inhertianceexample;

// ================================
// TOPIC: SINGLE INHERITANCE
// ================================

class Animal {

//    Animal(){
//        super();        //super constructor
//        System.out.println("animal constructor");       //constructor
//    }

    String n="Lion";

    void eat(){
        System.out.println("animal eat food");
    }

//    void bark(){
//        System.out.println("super dog barking");
//    }


}
class Dog extends Animal{

    String n="tommy";        // child variable (shadows parent)

    void bark(){
//        super.bark();                   //super method calls parent method
//        System.out.println(super.n);  //parent variable access
//        System.out.println(n);        // access child variable
        System.out.println("dog is barking");
    }
}

