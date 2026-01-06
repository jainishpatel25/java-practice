package constructorexample;

public class Student {
    int age;

    // User-defined default constructor

    Student(){
        System.out.println("default const");
    }
    // Parameterized constructor
    Student(int a){
        age=a;
    }

    void show(){
        System.out.println("student age: " +age);
    }
}
