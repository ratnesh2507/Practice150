package Sprint_2;
/*Calculating the Sum of a Series (1 + 1/2 + 1/3 + ... + 1/n)
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/n up to the nth term.
Example:
Input: n = 4
Output: 2.083333
Explanation: Sum of the series is 1 + 1/2 + 1/3 + 1/4 ≈ 2.083333.
 */

//Link https://www.geeksforgeeks.org/c-program-find-sum-series-1-12-13-14-1n/

import java.util.Scanner;

public class _3_SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(SumOfHP(num));
    }
    public static double SumOfHP(int n){
        double i, s=0.0;
        for(i=1;i<=n;i++){
            s += 1/i;  //Constantly incrementing i using for loop to generate inverse sum of 1/2 1/3 so on...
        }
        return s;
    }
}
