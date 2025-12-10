// Lab 10 Task 2:
import java.util.*;

public class MatrixPrimeCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][4];
        
        System.out.println("Enter values for 3x4 matrix:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Enter element [" + row + "][" + col + "]: ");
                matrix[row][col] = input.nextInt();
            }
        }
        
        System.out.println("\nThe matrix is:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        int maxRowPrimes = 0;
        int maxRowIndex = 0;
        
        for (int row = 0; row < 3; row++) {
            int primeCount = 0;
            for (int col = 0; col < 4; col++) {
                int number = matrix[row][col];
                boolean isPrime = true;
                
                if (number <= 1) {
                    isPrime = false;
                }
                
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                    }
                }
                
                if (isPrime) {
                    primeCount = primeCount + 1;
                }
            }
            
            if (primeCount > maxRowPrimes) {
                maxRowPrimes = primeCount;
                maxRowIndex = row;
            }
        }
        
        int maxColPrimes = 0;
        int maxColIndex = 0;
        
        for (int col = 0; col < 4; col++) {
            int primeCount = 0;
            for (int row = 0; row < 3; row++) {
                int number = matrix[row][col];
                boolean isPrime = true;
                
                if (number <= 1) {
                    isPrime = false;
                }
                
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                    }
                }
                
                if (isPrime) {
                    primeCount = primeCount + 1;
                }
            }
            
            if (primeCount > maxColPrimes) {
                maxColPrimes = primeCount;
                maxColIndex = col;
            }
        }
        
        if (maxRowPrimes >= maxColPrimes) {
            System.out.println("\nRow " + maxRowIndex + " has maximum primes: " + maxRowPrimes);
        } else {
            System.out.println("\nColumn " + maxColIndex + " has maximum primes: " + maxColPrimes);
        }
    }
}
