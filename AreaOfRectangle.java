import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = hr.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = hr.nextInt();

        int area = length * breadth;

        System.out.println("\nArea of rectangle is " + area);

        hr.close();
    }
    
}