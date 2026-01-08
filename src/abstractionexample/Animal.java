package abstractionexample;

// ================================
// TOPIC: ABSTRACTION (Abstract Class)
// ================================
// - abstract method has no body
// - child must implement it
// ================================

abstract class Animal {
abstract void sound();   //abstract method

    void eat(){          //normal method
        System.out.println("animal eats food");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}



