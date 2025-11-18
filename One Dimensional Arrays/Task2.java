import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();

        modify(arr);

        System.out.println("New Array:");
        for (int x : arr) System.out.print(x + " ");
    }

    public static void modify(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= 3;
        }
    }
}
