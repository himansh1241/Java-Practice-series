import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter first no: ");
        int a = hr.nextInt();

        System.out.print("Enter second no: ");
        int b = hr.nextInt();

        System.out.print("Enter character among (+,-,*,/,%): ");
        char operator = hr.next().charAt(0);

        switch (operator) {
            case '+' :
                System.out.println(a + b);
                break;

            case '-' :
                System.out.println(a - b);
                break;

            case '*' :
                System.out.println(a * b);
                break;

            case '/' :
                System.out.println(a / b);
                break;

            case '%' :
                System.out.println(a % b);
                break;

            default:
                System.out.println("Invalid Operator");
        }

        hr.close();
    }
}