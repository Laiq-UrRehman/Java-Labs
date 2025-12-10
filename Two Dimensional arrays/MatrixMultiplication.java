// Lab 10  Task 3:
import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] matrix1 = new int[3][4];
        
        System.out.println("Enter values for first matrix (3x4):");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Enter element [" + row + "][" + col + "]: ");
                matrix1[row][col] = input.nextInt();
            }
        }
        
        int[][] matrix2 = new int[4][3];
        
        System.out.println("\nEnter values for second matrix (4x3):");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter element [" + row + "][" + col + "]: ");
                matrix2[row][col] = input.nextInt();
            }
        }
        
        System.out.println("\nFirst Matrix (3x4):");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matrix1[row][col] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nSecond Matrix (4x3):");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix2[row][col] + " ");
            }
            System.out.println();
        }
        
        int[][] result = new int[3][3];
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                result[row][col] = 0;
                for (int k = 0; k < 4; k++) {
                    result[row][col] = result[row][col] + matrix1[row][k] * matrix2[k][col];
                }
            }
        }
        
        System.out.println("\nResult Matrix (3x3):");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
}
