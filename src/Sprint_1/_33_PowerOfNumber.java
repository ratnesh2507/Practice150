package Sprint_1;/*Calculating the Power of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the power of a number.
Example:
Input: base = 2, exponent = 3
Output: 8
Explanation: 2 raised to the power of 3 is 8.
 */

//Link https://www.geeksforgeeks.org/java-program-to-calculate-power-of-a-number/

import java.util.Scanner;

public class _33_PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int ans = aPowerB(base,exponent);
        System.out.println(ans);
    }
    public static int aPowerB(long a , long b){
        long ans = 1;
        long x = a;
        long M = 1000000007;
        while (b!=0){
            if((b & 1) == 1){
                ans = (ans *x) % M;
            }
            b = b >>1;
            x = (x*x) % M;
        }
        return (int)ans;
    }
}
