import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = hr.nextInt();

        int[] arr = new int[n];
        int[] prefix = new int[n];

        System.out.print("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = hr.nextInt();
        }

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.print("Prefix Sum Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }

        hr.close();
    }
}