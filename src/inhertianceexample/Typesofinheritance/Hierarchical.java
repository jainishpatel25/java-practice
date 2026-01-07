package inhertianceexample.Typesofinheritance;

public class Hierarchical {
    public static void main(String[] args) {

        Bus b=new Bus();
        b.type();       //inherti
        b.start();      //bus-specific

        Car c=new Car();
        c.type();       //inher
        c.car();        //car-specific
    }
}
