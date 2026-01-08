package exceptionexample;

import java.io.IOException;


//Call method from another method (Exception Propagation)

public class ThrowsExample2 {
    static void readFile() throws IOException {
        System.out.println("Reading file...");
        throw new IOException("File not found");
    }

    static void processFile() throws IOException {
        System.out.println("Processing file...");
        readFile();   // calling another method
//
//        try {
//            readFile();
//        } catch (IOException e) {
//            System.out.println("Handled in main: " + e.getMessage());
//        }
    }

    public static void main(String[] args) {
        try {
            processFile();
        } catch (IOException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}
