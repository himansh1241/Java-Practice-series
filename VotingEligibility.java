// Take age input and print if he/she is eligible to vote or not

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = hr.nextInt();

        if (age >= 18) {
            System.out.println("You're eligible to vote");
        } else {
            System.out.println("You're not eligible to vote");
        }
        
        hr.close();
    }
}