/*Finding the Fibonacci Number at a Specific Position
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to find the Fibonacci number at a specific position.
Example:
Input: position = 5
Output: 5
Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).
 */

//Link https://leetcode.com/problems/fibonacci-number/description/

import java.util.Scanner;

public class _23_NthFibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = fib(num);
        System.out.println(ans);
    }
    public static int fib(int n) {
        if(n<2){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
