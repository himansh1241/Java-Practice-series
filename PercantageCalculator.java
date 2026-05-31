// Calculate percentage of 5 subjects

import java.util.Scanner;

public class PercantageCalculator {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects: ");

        int s1 = hr.nextInt();
        int s2 = hr.nextInt();
        int s3 = hr.nextInt();
        int s4 = hr.nextInt();
        int s5 = hr.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5;

        System.out.println("Percentage = " + percentage);

        hr.close();
    }   
}