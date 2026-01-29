package arrayexample;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 7, 1};






        // start from last index and move backward
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
