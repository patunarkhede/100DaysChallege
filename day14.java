
// Day 14 coding Statement : Write a program to reverse a given number

// Description

// Get an input from the user and the print the reverse of the given number as the output

// E.g. let the number be 324 then the reverse of the number is 423

// Input

// 675

// Output

// 576

import java.util.Scanner;

class day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;

        }
        return reversedNumber;
    }

}
