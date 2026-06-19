// Program to find Bionomial Coefficient

import java.util.Scanner;

public class FunctionsQ2 {
     
    public static int factorial(int n) {
        int f = 1; 
        
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = hr.nextInt();
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
    }
}