// Find product of a and b

import java.util.Scanner;

public class FunctionsQ1 {

    public static int calculateProduct(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }

    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        int a = hr.nextInt();
        int b = hr.nextInt();
        int result = calculateProduct(a, b);
        System.out.println(+ a + " * " + b + " = " + result);
    }
}