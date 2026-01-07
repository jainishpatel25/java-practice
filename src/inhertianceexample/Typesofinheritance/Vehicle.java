package inhertianceexample.Typesofinheritance;

public class Vehicle {

    void type(){
        System.out.println("two type of vehicle is there");
    }
}

class Bus extends Vehicle{

    void start(){
        System.out.println("bus is 1st type");
    }
}

class Car extends Vehicle{

    void car(){
        System.out.println("car is 2nd type");
    }

}
