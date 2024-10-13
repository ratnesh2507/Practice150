/*Calculating the Sum of Even Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all even numbers within a given range.
        Example:
Input: range = [1, 10]
Output: 30
Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.
 */

//Link https://www.geeksforgeeks.org/sum-of-all-even-numbers-in-range-l-and-r/

import java.util.Scanner;

public class _21_SumOfEvenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int ans = SumOfEvens(left,right);
        System.out.println(ans);
    }
    public static int SumOfEvens(int l, int r){
        return sumOfNatural(r/2) - sumOfNatural((l-1)/2);
    }
    public static int sumOfNatural(int n){
        return n*(n+1);
    }
}
