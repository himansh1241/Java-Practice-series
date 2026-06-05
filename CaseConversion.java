// Take lowercase character and print uppercase version

import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter a Lowercase character: ");
        char lCase = hr.next().charAt(0);

        char uCase = (char)(lCase - 32);
        System.out.println("Uppercase character : " + uCase);

        hr.close();
    }
}