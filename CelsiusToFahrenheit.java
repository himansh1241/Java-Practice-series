import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter Celsius value: ");
        double celsius = hr.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit value of " + celsius + " celsius will be: " + fahrenheit);

        hr.close();
        }
    }