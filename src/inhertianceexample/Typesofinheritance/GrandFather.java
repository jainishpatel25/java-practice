package inhertianceexample.Typesofinheritance;


public class GrandFather {

    void dada(){
        System.out.println("i am the grandfater");
    }
}

class Father extends GrandFather{
    void papa(){
        System.out.println("i am the father");
    }
}

class Son extends Father{
    void self(){
        System.out.println("i am son");
    }
}
