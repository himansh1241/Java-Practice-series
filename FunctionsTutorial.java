import java.util.Scanner;

public class FunctionsTutorial {
    
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        int a = hr.nextInt();
        int b = hr.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum is: " + sum);
    }
}