// Day 15 coding Statement : Write a program to identify if the number is Strong number or not

// Description

// Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

// E.g. let the number be 145

// Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

// Input

// 121

// Output

// Not a strong number

// Input

// 2

// Output

// Strong number

import java.util.Scanner;

public class day15 {

    // Function to calculate the factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Function to check if a number is a strong number
    static boolean isStrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a strong number
        if (isStrong(number)) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }

        scanner.close();
    }
}
