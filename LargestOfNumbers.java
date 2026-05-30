import java.util.Scanner;

public class LargestOfNumbers {
    public static void main(String[] args){
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = hr.nextInt();

        System.out.print("Enter the value of b: ");
        int b = hr.nextInt();

        if (a > b) {
            System.out.println("\n" + a + " is greater than " + b);
        }
        else {
            System.out.println("\n" + a + " is samller than " + b);
        }

        hr.close();
    }   
}