// Day 5 coding Statement:  Write a program to identify if the number is even or odd

// Description

// Get a number as input from the user and check whether the given number is odd or even

// Input

// 10

// Output

// Even

// Input

// 5

// Output

// Odd

import java.util.Scanner;

class day5 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int a = var.nextInt();
        {
            if (a % 2 == 0) {
                System.out.println("Even");

            } else {
                System.out.println("Odd");
            }
        }
        var.close();
    }
}
