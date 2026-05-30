import java.util.Scanner;

public class Input{
    public static void main(String[] args) {

        Scanner hr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = hr.nextInt();

        System.out.println("You entered: " + num);
    }
}