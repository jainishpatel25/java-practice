package exceptionexample;

public class ThrowExample {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        checkAge(16);
        //       try{
//           checkAge(16);
//       }
//       catch (Exception e){
//           System.out.println(e.getMessage());
//       }
    }
}
