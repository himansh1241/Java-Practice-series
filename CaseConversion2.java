// Take uppercase character and print lowercase version

import java.util.Scanner;

public class CaseConversion2 {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter an Uppercase character: ");
        char uCase = hr.next().charAt(0);

        char lCase = (char)(uCase + 32);
        System.out.println("Lowercase character: " + lCase);

        hr.close();
    }   
}