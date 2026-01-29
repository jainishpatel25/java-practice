package arrayexample;

import java.util.Scanner;

public class EvenAndOdd {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");

        int b= sc.nextInt();

        if(b%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
