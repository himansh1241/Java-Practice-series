import java.util.Scanner;

public class ConditionalPercentage {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        double m1 = hr.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double m2 = hr.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double m3 = hr.nextDouble();

        System.out.print("Enter marks of Subject 4: ");
        double m4 = hr.nextDouble();

        System.out.print("Enter marks of Subject 5: ");
        double m5 = hr.nextDouble();

        System.out.print("Enter marks of Subject 6: ");
        double m6 = hr.nextDouble();

        double total = m1 + m2 + m3 + m4 + m5 + m6;
        double percentage = (total / 600) * 100;

        System.out.printf("\nTotal of all the six subjects: %.1f%nand their percentage is: %.2f%n", total, percentage);
        
        double min = m1;

        if (m2 < min) {
            min = m2;
        }

        if (m3 < min) {
            min = m3;
        }

        if (m4 < min) {
            min = m4;
        }

        if (m5 < min) {
            min = m5;
        }

        if (m6 < min) {
            min = m6;
        }

        double top5Total = total - min;
        double top5percentage = (top5Total / 500) * 100;

        System.out.printf("\nTotal of top 5 subjects: %.1f%nand their percentage is: %.2f%n", top5Total, top5percentage);

        hr.close();
    }    
}