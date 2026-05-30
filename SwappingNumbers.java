import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter first no: ");
        int a = hr.nextInt();

        System.out.print("Enter second no: ");
        int b = hr.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nSwapped first no: " + a);
        System.out.println("Swapped second no: " + b);

        hr.close();
    }
}
