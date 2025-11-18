import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rating = new int[40];
        int[] freq = new int[11];

        System.out.println("Enter 40 ratings (1–10):");
        for (int i = 0; i < 40; i++) {
            rating[i] = sc.nextInt();
            freq[rating[i]]++;
        }

        System.out.println("Rating Summary:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " → " + freq[i] + " votes");
        }
    }
}
