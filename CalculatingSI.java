import java.util.Scanner;

public class CalculatingSI {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double p = hr.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = hr.nextDouble();
        System.out.print("Enter time period: ");
        double t = hr.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("\nSimple Interest is: " + si);
        System.out.println("Total amout to pay will be " + (p + si));

        hr.close();
    }   
}