import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double area;
        double perimeter;
        double diagonal;
        boolean lengthCheck = false;
        boolean widthCheck = false;

        do {
            System.out.print("Please enter the length of your rectangle: ");
            if (scan.hasNextDouble()) {
                length = scan.nextDouble();
                if (length > 0) {
                    lengthCheck = true;
                } else {
                    scan.nextLine();
                    System.out.println("Error: invalid value for length.  Please enter a positive number.");
                }
            } else {
                scan.nextLine();
                System.out.println("Error: invalid value for length.  Please enter a number.");
            }
        } while (!lengthCheck);

        do {
            System.out.print("Please enter the width of your rectangle: ");
            if (scan.hasNextDouble()) {
                width = scan.nextDouble();
                scan.nextLine();
                if (width > 0) {
                    widthCheck = true;
                } else {
                    System.out.println("Error: invalid value for width.  Please enter a positive number.");
                }
            } else {
                scan.nextLine();
                System.out.println("Error: invalid value for width.  Please enter a number.");
            }
        } while (!widthCheck);

        area = length*width;
        perimeter = (length*2) + (width *2);
        diagonal = Math.sqrt((length*length)+(width*width));
        System.out.printf("Length: %10.2f", length);
        System.out.printf("\nWidth: %11.2f", width);
        System.out.printf("\nArea: %12.2f", area);
        System.out.printf("\nPerimeter: %7.2f", perimeter);
        System.out.printf("\nDiagonal: %8.2f", diagonal);
    }
}