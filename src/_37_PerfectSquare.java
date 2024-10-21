/*Checking for Perfect Squares
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to determine if a number is a perfect square.
Example:
Input: number = 16
Output: True
Explanation: 16 is a perfect square (4^2 = 16).
 */

import java.util.Scanner;

public class _37_PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        if(isPerfectSquare(num)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static boolean isPerfectSquare(long n){
        long sqrt = (long) Math.sqrt(n);
        return sqrt*sqrt == n;
    }
}
