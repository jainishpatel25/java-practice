// ================================
// Class with Instance Variables + Method with Parameters
// ================================
package clasandobjexample;

class Student {
    int age;
    String name;
    void study(int std,int roll){       //method with parameters
        System.out.println(age);
        System.out.println(name);
        System.out.println("studing");
        System.out.println( "Student std: "+std);
        System.out.println( "Student roll no: " +roll);
    }
}

