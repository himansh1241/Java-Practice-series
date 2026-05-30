// Find Remainder after division

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int a = hr.nextInt();

        System.out.print("Enter divisor: ");
        int b = hr.nextInt();

        int remainder = a % b;
        System.out.println("The remainder of " + a + " and " + b + " is: " +remainder);

        hr.close();
    }
}
