// Print sum of all numbers from 1 to n

import java.util.Scanner;

public class LoopsQ7 {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = hr.nextInt();
        
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

        hr.close();
    }
}