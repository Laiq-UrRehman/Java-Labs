// Lab 10 Task 1:
import java.util.*;

public class MatrixRowColumnMaxSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][4];
        
        System.out.println("Enter values for 3x4 matrix:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.println("Enter element [" + row + "][" + col + "]: ");
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
        
        int maxRowSum = 0;
        int maxRowIndex = 0;
        
        for (int row = 0; row < 3; row++) {
            int rowSum = 0;
            for (int col = 0; col < 4; col++) {
                rowSum = rowSum + matrix[row][col];
            }
            
            if (row == 0 || rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = row;
            }
        }
        
        int maxColSum = 0;
        int maxColIndex = 0;
        
        for (int col = 0; col < 4; col++) {
            int colSum = 0;
            for (int row = 0; row < 3; row++) {
                colSum = colSum + matrix[row][col];
            }
            
            if (col == 0 || colSum > maxColSum) {
                maxColSum = colSum;
                maxColIndex = col;
            }
        }
        
        System.out.println("\nRow " + maxRowIndex + " has maximum sum: " + maxRowSum);
        System.out.println("Column " + maxColIndex + " has maximum sum: " + maxColSum);
    }
}
