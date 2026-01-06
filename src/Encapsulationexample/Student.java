package Encapsulationexample;

// ================================
// Encapsulation with Multiple Variables
// ================================

public class Student {
    private int age;
    private String name;

    // Getter method (read access)
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    // Setter method (write access)
    public void setName(String n){
        name=n;
    }

    public void setAge(int a){
        if(a>0){
            age=a;
        }else{
            System.out.println("invalid age");
        }

    }
}