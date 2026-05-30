import java.util.Scanner;

public class SquaringNumbers {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter the no: ");
        int num = hr.nextInt();

        int square = num * num;
        System.out.println("Square of " + num + " is: " + square);

        hr.close();
    }
}
