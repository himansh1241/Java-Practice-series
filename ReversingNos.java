import java.util.Scanner;

public class ReversingNos {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        int num = hr.nextInt();
        int reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number = " + reverse);

        hr.close();
    }
    
}
