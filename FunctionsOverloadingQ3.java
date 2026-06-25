// Print whether a no is Prime of not.

import java.util.Scanner;

public class FunctionsOverloadingQ3 {

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner hr = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int n = hr.nextInt();

        System.out.println(isPrime(n));
    }
}