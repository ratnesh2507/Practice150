package Sprint_1;/*Finding the Sum of the Digits of the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of the digits of the factorial of a given number.
        Example:
Input: number = 4
Output: 9
Explanation: The factorial of 4 is 24, and the sum of the digits (2 + 4) is 6.
 */

//Link

import java.util.Scanner;

public class _28_FactorialDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = _8_Factorial.Factorial(num);
        _9_SumOfDigits.SumOfDigits(fact);
    }
}
