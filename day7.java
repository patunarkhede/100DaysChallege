
// Day 7 coding Statement: Write a program to find Number of days in a given
// month of a given year

// Description

// Get the number of month and year as input from the user and check the number
// of days present in that month.

// Input

// Enter month : 2

// Enter year : 2000

// Output

// 29
import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter month :");
        int a = obj.nextInt();
        System.out.println("Enter year :");
        int b = obj.nextInt();
        boolean LeapYear = (b % 4 == 0) && (b % 100 != 0 || b % 400 == 0);

        if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
            b = 31;
        } else if (a == 4 || a == 6 || a == 9 || a == 11) {
            b = 30;
        } else if (a == 2) {
            b = LeapYear ? 29 : 28;
            ;
        } else {
            System.out.println("Invalid month!");

        }
        System.out.println(b);

        obj.close();
    }

}