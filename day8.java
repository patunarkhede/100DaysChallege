/*Day 8 coding Statement:  Write a program to find roots of a quadratic equation
Description:
Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.
*/
import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the values of a, b and c (coefficients of quadratic equation): ");
        double a = obj.nextDouble();
        double b = obj.nextDouble();
        double c = obj.nextDouble();
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if (determinant > 0) {
            System.out.println("The Roots are real and distinct");
            root1 = (-b + Math.sqrt(determinant) / (2 * a));
            root2 = (-b - Math.sqrt(determinant) / (2 * a));
            System.out.println("Root1= " + root1 % .2f + " Root2= " + root2 % .2f);

        } else if (determinant == 0) {
            System.out.println("The Roots are real and equal");
            root1 = root2 = -b / (2 * a);
            System.out.println("Root1= Root2= " + root1 % .2f);

        } else {
            System.out.println("The Roots are complex and distinct");
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("Root1= %.2f+i%.2f    Root2= %.2f-i%.2f", real, imaginary, real, imaginary);

        }

        obj.close();
    }
}
