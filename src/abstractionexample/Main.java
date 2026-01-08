package abstractionexample;

public class Main {

    static void main() {
        Animal a=new Dog();     // abstraction + polymorphism
        a.sound();
        a.eat();
    }
}
