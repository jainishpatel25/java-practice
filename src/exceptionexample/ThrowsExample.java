package exceptionexample;

import java.io.IOException;

public class ThrowsExample {
    static void readFile() throws Exception {
        System.out.println("Reading file...");
        throw new Exception("File not found");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
