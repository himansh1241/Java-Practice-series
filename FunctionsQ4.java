// Function overloading

import java.util.Scanner;

public class FunctionsQ4 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        int a = hr.nextInt();
        int b = hr.nextInt();
        int c = hr.nextInt();

        System.out.println("Sum of a and b is: " + sum(a, b));
        System.out.println("Sum of a, b and c is: " +sum(a, b, c));
    }
    
}