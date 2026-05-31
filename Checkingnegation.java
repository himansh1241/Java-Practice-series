// Check Positive, Negative, or Zero

import java.util.Scanner;

public class Checkingnegation {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter any No: ");
        int num = hr.nextInt();

        if (num > 0) {
            System.out.println(num + " is +ve");
        }
        else if (num < 0) {
            System.out.println(num + " is negative");
        }
        else {
            System.out.println(num + " is Zero");
        }
    }
    
}
