// Find average of 3 Nos

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter 3 Numbers: ");

        int a = hr.nextInt();
        int b = hr.nextInt();
        int c = hr.nextInt();

        double average = (a + b + c) / 3;
        System.out.println("Average is: " + average);

        hr.close();
    }
}
