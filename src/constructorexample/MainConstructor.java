


package constructorexample;

public class MainConstructor {
    public static void main(String[] args) {
        Student s1=new Student();  // default constructor called
        Student s2=new Student(42);

//        System.out.println(s1.age); //0
//        System.out.println(s1.name); //null
        System.out.println(s2.age); //42
        s2.show();

    }
}
