package Encapsulationexample;

public class Main {
    public static void main() {
        Student s1=new Student();
        s1.setAge(21);                  // value set (setter)
        s1.setName("Jainish");
        System.out.println( "Student age is: " +s1.getAge()); // (getter)
        System.out.println("Student name is:" +s1.getName());
    }
}

