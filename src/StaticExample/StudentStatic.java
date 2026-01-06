package StaticExample;

public class StudentStatic {


    static{
        System.out.println("static example");
    }
    String name;
    static String college="uka tarsadia university";


    StudentStatic(String n){
        name=n;
    }

    static void display(){
        System.out.println("static method");
    }

    void show(){
        System.out.println(name+ " is student of " +college);
    }

}

