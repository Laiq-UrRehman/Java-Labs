// Lab 13 Task 2
import java.io.*;
import java.util.*;

public class SortNumbersAscending {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        
        try {
            File inputFile = new File("numbers.txt");
            Scanner in = new Scanner(inputFile);
            
            for (int i = 0; i < 10; i++) {
                numbers[i] = in.nextInt();
            }
            in.close();
            
            Arrays.sort(numbers);
            
            System.out.println("Sorted numbers (ascending order):");
            for (int i = 0; i < 10; i++) {
                System.out.println(numbers[i]);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("numbers.txt not found!");
        }
    }
}
