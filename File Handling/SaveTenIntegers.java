// Lab 13 Task 1
import java.io.*;
import java.util.*;

public class SaveTenIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        try {
            PrintWriter out = new PrintWriter("numbers.txt");
            for (int i = 0; i < 10; i++) {
                out.println(numbers[i]);
            }
            out.close();
            System.out.println("10 integers saved to numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error saving file!");
        }
    }
}