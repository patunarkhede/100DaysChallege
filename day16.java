// Day 16 coding Statement : Write a program to identify if the number is Perfect number or not

// Description

// Get the input from the user and check whether that number is a perfect number or not.

// E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.

// Input

// 28

// Output

// Perfect Number

// Input

// 4
import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect number");
        }

        scanner.close();
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}

// Output

// Not a perfect number
