package methodOverriding;

public class MethodOverRiding {
    void start(){
        System.out.println("parent class");
    }
}

class Over extends MethodOverRiding {
    @Override
    void start(){
        System.out.println("child class");
    }
}
