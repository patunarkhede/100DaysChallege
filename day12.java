/*Day 12 coding Statement:  Write a program to find Sum of digits of a number
Description
Get a number from user and then find the sum of the digits in the given number.*/

import java.util.Scanner;

public class day12 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an number  : ");
        int number = obj.nextInt();
        int sum = 0;
        while (number > 0) {

            sum = sum + (number % 10);
            number = number / 10;
        }
        System.out.println(sum);

        obj.close();
    }

}
