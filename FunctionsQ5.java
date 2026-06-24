// Function overloading for intger and float datatypes

import java.util.Scanner;

public class FunctionsQ5 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = hr.nextInt();
        int b = hr.nextInt();

        System.out.print("Enter two floating no's: ");
        float x = hr.nextFloat();
        float y = hr.nextFloat();

        System.out.println("\nSum of integers: " + sum(a, b));
        System.out.println("Sum of floating no's: " + sum(x, y));

        hr.close();
    }   
}