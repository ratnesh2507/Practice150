package Sprint_1;/*Summing Digits of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the sum of digits of a number.
Example:
Input: number = 1234
Output: 10
Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.
*/

// Link https://www.geeksforgeeks.org/program-for-sum-of-the-digits-of-a-given-number/

import java.util.Scanner;

public class _9_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((SumOfDigits(num)));
    }
    public static int SumOfDigits(int n){
        int sum=0,rem=0;
        while(n>0){
            rem = n%10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
}
