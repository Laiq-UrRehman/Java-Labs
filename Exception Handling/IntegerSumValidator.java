//Lab 11 Task 1:
import java.util.*;

public class IntegerSumValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("Enter first integer: ");
                num1 = input.nextInt();
                
                System.out.print("Enter second integer: ");
                num2 = input.nextInt();
                
                validInput = true;
                
            } catch (Exception e) {
                System.out.println("You have entered an invalid input, type integers only");
                input.nextLine();
            }
        }
        
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
