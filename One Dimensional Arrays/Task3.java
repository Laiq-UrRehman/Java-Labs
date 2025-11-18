import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] rev = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            rev[i] = arr[9 - i];
        }

        System.out.println("Reversed Array:");
        for (int x : rev) System.out.print(x + " ");
    }
}
