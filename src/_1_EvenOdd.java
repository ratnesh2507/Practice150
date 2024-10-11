/*Determining Even/Odd Numbers
Difficulty: Easy
Topics: Basic Programming
Description: Write a program to check whether a number is even or odd.
Example:
Input: number = 4
Output: Even
Explanation: Since 4 is divisible by 2, it is an even number.
*/

// Link https://www.geeksforgeeks.org/tcs-coding-practice-question-check-odd-or-even/

import java.util.Scanner;

public class _1_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
