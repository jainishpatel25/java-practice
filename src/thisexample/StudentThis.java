package thisexample;

public class StudentThis {
    int age;

    StudentThis(){
        System.out.println("first one");
    }

    StudentThis(int age)
    {
        this();              //CALL ONE CONSTRUCTOR FROM ANOTHER---constructor chaining
        this.age=age;       // instance variable = parameter
    }
    void display(){
        System.out.println(age);
    }
}
