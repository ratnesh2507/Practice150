package Sprint_1;/*Checking for Perfect Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is a perfect number.
Example:
Input: number = 28
Output: Perfect Number
Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.
 */

//Link https://www.geeksforgeeks.org/perfect-number/

import java.util.Scanner;

public class _20_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPerfect(num)){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
    public static boolean isPerfect(int num){
        if (num <= 1) return false; // Perfect numbers are greater than 1
        int sum = 1; // Start with 1
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i; // Add the divisor
                if (i != num / i) { // Ensure we don't add the square root twice
                    sum += num / i; // Add the corres divisor
                }
            }
        }
        return sum == num; // Check if sum of divisors equals the number
    }
}
