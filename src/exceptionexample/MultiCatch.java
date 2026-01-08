package exceptionexample;

public class MultiCatch {
    public static void main(String[] args) {

        try {
//            int x=10/0;
//            System.out.println(x);
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]); // ArrayIndexOutOfBounds
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Array index error");
        }
        catch (Exception e) {
//            System.out.println(e);
            System.out.println("Generic Exception");
        }
        finally {
            System.out.println("program continue");
        }
    }
}
