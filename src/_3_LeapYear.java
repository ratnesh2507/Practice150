/*Validating Leap Years
Difficulty: Easy
Topics: Basic Programming, Date Handling
Description: Write a program to check if a given year is a leap year.
Example:
Input: year = 2020
Output: Leap Year
Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.
*/

//Link https://www.geeksforgeeks.org/program-check-given-year-leap-year/

import java.util.Scanner;

public class _3_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(isLeapYear(year)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
    public static boolean isLeapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}