// Convert Days into Years and Months

import java.util.Scanner;

public class ConversionOfDays {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        
        System.out.print("Enter Days: ");
        int days = hr.nextInt();

        int years = days / 365;
        int remainindDays = days % 365;
        int months = remainindDays / 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);

        hr.close();
    }   
}