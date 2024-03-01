// Day 10 coding Statement:  Write a program to find Factorial of a number

// Description

// Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.

// Input

// 4

// Output

// 24

import java.util.Scanner;

class day10 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int a = obj1.nextInt();
        int fact = 1;
        for (int i = a; i > 0; i--)
            fact = fact * i;
        {
            System.out.println(fact);
        }

        obj1.close();
    }

}
