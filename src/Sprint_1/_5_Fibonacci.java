package Sprint_1;/*Generating the Fibonacci Series
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to generate the Fibonacci series up to a given number.
        Example:
Input: limit = 10
Output: [0, 1, 1, 2, 3, 5, 8]
Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].
*/

//Link https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

import java.util.Scanner;

public class _5_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        Fibonacci(range);
    }
    public static void Fibonacci(int range){
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        int num3 = num1 +num2;
        while (num3 <= range){
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
    }
}

//Leetcode https://leetcode.com/problems/fibonacci-number/