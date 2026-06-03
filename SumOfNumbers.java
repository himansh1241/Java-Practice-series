import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner hr = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = hr.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

        hr.close();
    }
}