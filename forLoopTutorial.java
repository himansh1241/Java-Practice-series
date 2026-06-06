import java.util.Scanner;

public class forLoopTutorial {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Value of i: " + i);
        }

        for (int i = 1; i <=4; i++) {
            System.out.println("Himanshu..");
        }

        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        hr.close();
    }
}