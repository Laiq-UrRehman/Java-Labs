import java.util.*;

public class employProgrammingConstructs {

    //Main Menu
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int choice;

        do {
            System.out.println("\n----------------------------------------");
            System.out.println("               Main Menu                  ");
            System.out.println("----------------------------------------");
            System.out.println("1. Matrix Multiplication");
            System.out.println("2. Binary Matrix Analysis");
            System.out.println("3. Character Array Sorting");
            System.out.println("4. Array Operations");
            System.out.println("5. Smart Grid Optimaization");
            System.out.println("0. Exit");
            System.out.println("----------------------------------------");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    matrixMultiplication(input);
                    break;
                case 2:
                    binaryMatrixAnalysis(input);
                    break;
                case 3:
                    characterArraySorting(input);
                    break;
                case 4:
                    arrayOperations(input); 
                    break;
                case 5:
                    smartGridOptimization(input);   
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        input.close();
    }

    //Question 1: Matrix Multiplication
    public static void matrixMultiplication(Scanner input) {
        System.out.println("-----Matrix Multiplication-----");
        System.out.print("Enter number of rows for 1st matrix: ");
        int r1 = input.nextInt();
        System.out.print("Enter number of columns for 1st matrix: ");
        int c1 = input.nextInt();

        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter elements of 1st matrix:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter number of rows for 2nd matrix: ");
        int r2 = input.nextInt();
        System.out.print("Enter number of columns for 2nd matrix: ");
        int c2 = input.nextInt();
        if(c1 != r2) {
            System.out.println("Matrix multiplication not possible.");
            System.out.println("Columns of 1st matrix must equal rows of 2nd matrix.");
            return;
        }

        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter elements of 2nd matrix:");
        for(int i = 0; i<r2; i++) {
            for(int j = 0; j<c2; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                matrix2[i][j] = input.nextInt();
            }
        }

        int[][] result = new int[r1][c2];
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                result[i][j] = 0;
                for(int k=0; k<c1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("\n 1st Matrix:");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n 2nd Matrix:");
        for(int i=0; i<r2; i++) {
            for(int j=0; j<c2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n Resultant Matrix:");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Question 2: Binary Matrix Analysis
    public static void binaryMatrixAnalysis(Scanner input) {
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        
        Random ran = new Random();
        int[][] matrix = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = ran.nextInt(2);
            }
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < size; i++) {
            int zeros = 0;
            int ones = 0;
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (zeros == size) {
                System.out.println("All 0s on row " + i);
            }
            if (ones == size) {
                System.out.println("All 1s on row " + i);
            }
        }
        
        boolean foundCol = false;
        for (int j = 0; j < size; j++) {
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < size; i++) {
                if (matrix[i][j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (zeros == size) {
                System.out.println("All 0s on column " + j);
                foundCol = true;
            }
            if (ones == size) {
                System.out.println("All 1s on column " + j);
                foundCol = true;
            }
        }
        if (foundCol == false) {
            System.out.println("No same numbers on a column");
        }
        
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < size; i++) {
            if (matrix[i][i] == 0) {
                zeros++;
            } else {
                ones++;
            }
        }
        if (zeros == size) {
            System.out.println("All 0s on the major diagonal");
        } else if (ones == size) {
            System.out.println("All 1s on the major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }
        
        zeros = 0;
        ones = 0;
        for (int i = 0; i < size; i++) {
            if (matrix[i][size - 1 - i] == 0) {
                zeros++;
            } else {
                ones++;
            }
        }
        if (zeros == size) {
            System.out.println("All 0s on the sub-diagonal");
        } else if (ones == size) {
            System.out.println("All 1s on the sub-diagonal");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }

    //Question 3: Character Array Sorting
    public static void characterArraySorting(Scanner input) {
        System.out.println("\n-----Character Array Sorting-----");
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        char[] arr = new char[size];
        System.out.println("Enter characters (a,b, or c):");

        for(int i=0; i<size; i++) {
            System.out.print("Enter character " + i + ": ");
            arr[i] = input.next().charAt(0);
        }
        System.out.println("\nOriginal Array:");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int countA = 0, countB = 0, countC = 0;
        for(int i=0; i<size; i++) {
            if(arr[i] == 'a') {
                countA++;
            } else if(arr[i] == 'b') {
                countB++;
            } else if(arr[i] == 'c') {
                countC++;
            }
        }

        int index = 0;
        for(int i=0; i<countA; i++) {
            arr[index] = 'a';
            index++;
        }
        for(int i=0; i<countB; i++) {
            arr[index] = 'b';
            index++;
        }
        for(int i=0; i<countC; i++) {
            arr[index] = 'c';
            index++;
        }

        System.out.println("\nSorted Array:");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   // Question 4: Array Operations
    public static void arrayOperations(Scanner input) {
        System.out.println("\n--- Array Operations ---");
        
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = input.nextInt();
        }
        
        int choice;
        do {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Count occurrences");
            System.out.println("2. Partition array");
            System.out.println("3. Find duplicates");
            System.out.println("4. Circular replacement");
            System.out.println("5. Shift left by 2");
            System.out.println("0. Back");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter number to count: ");
                int num = input.nextInt();
                int result = count(arr, num);
                System.out.println("Count: " + result);
                
            } else if (choice == 2) {
                partition(arr);
                System.out.println("After partition:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                
            } else if (choice == 3) {
                duplicates(arr);
                
            } else if (choice == 4) {
                circular(arr);
                System.out.println("After circular replacement:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                
            } else if (choice == 5) {
                shiftCircular(arr);
                System.out.println("After shift:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                
            } else if (choice == 0) {
                System.out.println("Going back to main menu...");
            } else {
                System.out.println("Invalid choice!");
            }
            
        } while (choice != 0);
    }

    // Method 1: Count occurrences of x in array
    public static int count(int[] arr, int x) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                c++;
            }
        }
        return c;
    }

    // Method 2: Partition array based on first element
    public static void partition(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        
        int x = arr[0];
        int left = 1;
        int right = arr.length - 1;
        
        while (left <= right) {
            while (left <= right && arr[left] <= x) {
                left++;
            }
            while (left <= right && arr[right] > x) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        
        if (right != 0) {
            int temp = arr[0];
            arr[0] = arr[right];
            arr[right] = temp;
        }
    }

    // Method 3: Display frequencies of all elements
    public static void duplicates(int[] arr) {
        boolean[] checked = new boolean[arr.length];
        
        System.out.println("Frequencies:");
        for (int i = 0; i < arr.length; i++) {
            if (checked[i] == false) {
                int freq = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        freq++;
                        checked[j] = true;
                    }
                }
                System.out.println(arr[i] + " appears " + freq + " times");
            }
        }
    }

    // Method 4: Circular replacement - replace each element with sum of next two
    public static void circular(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        
        for (int i = 0; i < arr.length; i++) {
            int next1 = (i + 1) % arr.length;
            int next2 = (i + 2) % arr.length;
            arr[i] = temp[next1] + temp[next2];
        }
    }

    // Method 5: Shift array circularly left by 2 positions
    public static void shiftCircular(int[] arr) {
        if (arr.length <= 2) {
            return;
        }
        
        int temp1 = arr[0];
        int temp2 = arr[1];
        
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = arr[i + 2];
        }
        
        arr[arr.length - 2] = temp1;
        arr[arr.length - 1] = temp2;
    }

    
    // Question 5: Smart Grid Optimization
    public static void smartGridOptimization(Scanner input) {
        System.out.println("\n--- Smart Grid Optimization ---");
        
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int cols = input.nextInt();
        
        int[][] grid = new int[rows][cols];
        System.out.println("Enter grid values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                grid[i][j] = input.nextInt();
            }
        }
        
        System.out.print("Enter threshold: ");
        int threshold = input.nextInt();
        
        System.out.println("\nOriginal Grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] original = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = grid[i][j];
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (original[i][j] > threshold) {
                    int sum = 0;
                    int count = 0;
                    
                    if (i > 0) {
                        sum = sum + original[i - 1][j];
                        count++;
                    }
                    if (i < rows - 1) {
                        sum = sum + original[i + 1][j];
                        count++;
                    }
                    if (j > 0) {
                        sum = sum + original[i][j - 1];
                        count++;
                    }
                    if (j < cols - 1) {
                        sum = sum + original[i][j + 1];
                        count++;
                    }
                    
                    if (count > 0) {
                        grid[i][j] = sum / count;
                    }
                }
            }
        }
        
        System.out.println("\nOptimized Grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
