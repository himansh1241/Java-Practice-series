import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = hr.nextInt();

        String result = (age >= 18) ? "Eligible to vote" : "Not Eligible";
        System.out.println(result);

        hr.close();
    }
} 