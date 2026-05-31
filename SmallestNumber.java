//Find Smallest of Two Numbers 

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter two nos: ");
        int a = hr.nextInt();
        int b = hr.nextInt();

        if (a < b) {
            System.out.println(a + " is smaller than " + b);
        }
        else {
            System.out.println(b + " is smaller than " + a);
        }

    }
}
