// Print counting from 1 to n

import java.util.Scanner;

public class LoopsQ1 {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = hr.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }   
}