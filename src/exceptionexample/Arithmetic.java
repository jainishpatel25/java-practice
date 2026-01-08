package exceptionexample;

public class Arithmetic {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // Exception here
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" +e);
        }

        System.out.println("Program continues...");
    }
}
