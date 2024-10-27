package Sprint_1;/*Finding the Number of Digits in a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to count the number of digits in a given number.
        Example:
Input: number = 12345
Output: 5
Explanation: The number 12345 has 5 digits.
 */

//Link

import java.util.Scanner;

public class _25_NumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        SumOfDigits(num);
    }
    public static void SumOfDigits(int n){
        int digit =0;
        while(n>0){
            digit ++;
            n /= 10;
        }
        System.out.println(digit);
    }
}