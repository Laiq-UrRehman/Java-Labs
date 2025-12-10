// Lab 13 Task 3
import java.io.*;
import java.util.*;

public class RemovePrimes {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        try {
            File inputFile = new File("numbers.txt");
            Scanner in = new Scanner(inputFile);
            
            while (in.hasNextInt()) {
                numbers.add(in.nextInt());
            }
            in.close();
            
            ArrayList<Integer> nonPrimes = new ArrayList<>();
            
            for (int num : numbers) {
                if (!isPrime(num)) {
                    nonPrimes.add(num);
                }
            }
            
            PrintWriter out = new PrintWriter("numbers.txt");
            for (int num : nonPrimes) {
                out.println(num);
            }
            out.close();
            
            System.out.println("Prime numbers removed. Non-prime numbers saved:");
            for (int num : nonPrimes) {
                System.out.println(num);
            }
            System.out.println("Total non-prime numbers: " + nonPrimes.size());
            
        } catch (FileNotFoundException e) {
            System.out.println("numbers.txt not found!");
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}