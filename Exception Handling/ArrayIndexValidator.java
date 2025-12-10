// Lab 11 Task 2:
import java.util.Scanner;

public class ArrayIndexValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 integer values:");
        
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            
            while (!validInput) {
                try {
                    System.out.print("Enter value " + (i + 1) + ": ");
                    numbers[i] = input.nextInt();
                    validInput = true;
                    
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    input.nextLine();
                }
            }
        }
        
        System.out.println("\nArray values entered successfully!");
        System.out.println("Enter an index to display its value:");
        
        try {
            System.out.print("Enter index (0-9): ");
            int index = input.nextInt();
            System.out.println("Value at index " + index + " is: " + numbers[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Index must be between 0 and 9.");
            
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer for index.");
        }
    }
}
