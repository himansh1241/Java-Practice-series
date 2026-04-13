import java.util.Scanner;

public class BasicsMaths {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int num = hr.nextInt();
        
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);

            num = num / 10;
        }

        hr.close();
    }
}