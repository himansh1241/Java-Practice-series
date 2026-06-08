//Print the 10 multiples of n

import java.util.Scanner;

public class LoopsQ3 {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = hr.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(+ n + " * " + i + " = " + (n * i));
        }

        hr.close();   
    }   
}