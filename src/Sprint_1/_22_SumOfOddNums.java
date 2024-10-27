package Sprint_1;/*Calculating the Sum of Odd Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all odd numbers within a given range.
        Example:
Input: range = [1, 10]
Output: 25
Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25.
 */

//Link https://www.geeksforgeeks.org/sum-of-all-odd-natural-numbers-in-range-l-and-r/

import java.util.Scanner;

public class _22_SumOfOddNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int ans = SumOfOdds(left,right);
        System.out.println(ans);
    }
    public static int SumOfOdds(int l, int r){
        int sum = 0;
        // Loop through the range and add odd numbers
        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
    //Alt method
    /*public static int SumOfOdds(int l, int r){
        return sumOfOddNatural(r) - sumOfOddNatural((l-1));
    }
    public static int sumOfOddNatural(int n){
        return ((n+1)/2)*((n+1)/2);
    } */
}
