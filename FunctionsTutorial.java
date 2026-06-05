import java.util.Scanner;

public class FunctionsTutorial {

    public static int printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        return 0;
    }

    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        int a = hr.nextInt(); 
        int b = hr.nextInt();
        calculateSum(a, b);
    }
}