// Day 18 coding Statement : Write a program to Add two fractions

// Description

// Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

// x3/y3 = (x1/y1) + (x2/y2)

// here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)

// Input

// 2  3

// 4  3

// Output

// 2/1   
import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the numerator and denominator of the first fraction:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter the numerator and denominator of the second fraction:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Adding fractions
        int x3 = x1 * y2 + x2 * y1;
        int y3 = y1 * y2;

        // Simplify the fraction
        int gcd = gcd(x3, y3);
        x3 /= gcd;
        y3 /= gcd;

        // Output
        System.out.println("Output:");
        System.out.println(x3 + "/" + y3);
    }

    // Method to calculate the greatest common divisor
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
