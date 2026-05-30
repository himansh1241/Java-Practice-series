import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = hr.nextInt();

        System.out.print("Enter second number: ");
        int b = hr.nextInt();

        int sum = a + b;
        System.out.println("Sum is: " + sum);

        hr.close();
    }
}