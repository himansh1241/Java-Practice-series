// Print your name 100 times

import java.util.Scanner;

public class LoopsQ4 {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = hr.nextLine();

        for (int i = 1; i <= 100; i++){
            System.out.println(name);
        }

        hr.close();
    }    
}