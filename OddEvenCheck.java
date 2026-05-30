import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter any no: ");
        int num = hr.nextInt();

        if (num % 2 == 0) {
            System.out.println(+ num + " is even");
        }
        else {
            System.out.println(+ num + " is odd");
        }

        hr.close();
    }   
}