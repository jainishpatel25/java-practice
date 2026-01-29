package arrayexample;

import java.util.Arrays;

public class Arrayp {
    public static void main(String[] args) {
//        int [] a={12,23,43,12,43};
//        System.out.println(a[0]+ "and" +a[2]);

        int[] arr = {2, 1, 5, 9, 4, 3, 7};
        int temp;
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted array: " + arr[0]);
        System.out.println("sorted array: " + arr[1]);
        System.out.println("sorted array: " + arr[2]);
        System.out.println("sorted array: " + arr[3]);
        System.out.println("sorted array: " + arr[4]);
        System.out.println("sorted array: " + arr[5]);
        System.out.println("sorted array: " + arr[6]);

    }
}
