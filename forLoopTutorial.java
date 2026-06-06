import java.util.Scanner;

public class forLoopTutorial {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        int i = 1;

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Value of i: " + i);
        // }

        // for (int i = 1; i <=4; i++) {
        //     System.out.println("Himanshu..");
        // }

        // for (int i = 2; i <= 20; i += 2) {
        //     System.out.println(i);
        // }

        for (i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        hr.close();
    }
}