package Sprint_1;/*Calculating the Sum of Digits of a Number Until Single Digit
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to keep summing the digits of a number until a single digit is obtained.
        Example:
Input: number = 9875
Output: 2
Explanation: The sum of digits is 9 + 8 + 7 + 5 = 29, and then 2 + 9 = 11, and finally 1 + 1 = 2.
 */

//Link https://www.geeksforgeeks.org/finding-sum-of-digits-of-a-number-until-sum-becomes-single-digit/

import java.util.Scanner;

public class _40_SumOfDigitsUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = DigSum(num);
        System.out.println(ans);
    }
    public static int DigSum(int num){
        int sum =0;
        while(num>0 || sum>9){
            if(num==0){
                num=sum;
                sum=0;
            }
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
