// Print counting from n to 1

import java.util.Scanner;

public class LoopsQ2 {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = hr.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        
        hr.close();
    }
}